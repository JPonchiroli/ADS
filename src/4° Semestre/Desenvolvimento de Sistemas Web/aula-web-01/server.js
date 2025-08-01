const express = require('express');
const fs = require('fs');
const app = express();
const port = 3001;

const cors = require('cors')
app.use(cors())


const readUsuarios = () => {
    const dados = fs.readFileSync('./usuarios.json')
    return JSON.parse(dados)
}

const writeUsuarios = (dados) => {
    fs.writeFileSync('./usuarios.json', JSON.stringify(dados, null, 2))
}

app.use(express.json());

app.get('/', (req, res) => {
    res.send("Servidor rodando...")
});

app.get('/usuarios', (req, res) => {
    const usuarios = readUsuarios();
    res.json(usuarios);
});

app.get('/usuarios/:id', (req, res) => {
    const usuarios = readUsuarios();
    const id = parseInt(req.params.id);
    const usuario = usuarios.find(a => a.id === parseInt(id));
    if (usuario) {
        res.json(usuario)
    } else {
        res.status(404).json({message: 'Usuário não encontrado'})
    }
});

app.delete('/usuarios/:id', (req, res) => {
    let usuarios = readUsuarios()
    const id = parseInt(req.params.id);
    usuarios = usuarios.filter(a => a.id !== id);
    writeUsuarios(usuarios)
    res.json({message: `O usuário id:${id} foi excluido com sucesso`})
});

app.post('/usuarios', (req, res) => {
    const usuarios = readUsuarios()
    const novo_usuario = {
        id: usuarios.length > 0 ? usuarios[usuarios.length - 1].id + 1 : 1,
        nome: req.body.nome
    }
    usuarios.push(novo_usuario)
    writeUsuarios(usuarios)
    res.status(201).json(novo_usuario)
})

app.listen(port, () => {
    console.log(`Aplicação rodando em http:localhost:${port}/`)
})