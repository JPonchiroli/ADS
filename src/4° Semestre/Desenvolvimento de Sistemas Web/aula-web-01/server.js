const express = require('express');
const app = express();
const port = 3000;

let usuarios = [
    {id: 1, nome: 'Celso'},
    {id: 2, nome: 'Maria'},
    {id: 3, nome: 'Carlos'},
    {id: 4, nome: 'Ana Paula'},
]

app.use(express.json());

app.get('/', (req, res) => {
    res.send("Servidor rodando...")
});

app.get('/usuarios', (req, res) => {
    res.json(usuarios)
});

app.get('/usuarios/:id', (req, res) => {
    const id = parseInt(req.params.id);
    const usuario = usuarios.find(a => a.id === parseInt(id));
    if (usuario) {
        res.json(usuario)
    } else {
        res.status(404).json({message: 'Usuário não encontrado'})
    }
});

app.delete('/usuarios/:id', (req, res) => {
    const id = parseInt(req.params.id);
    usuario = usuarios.filter(a => a.id !== id);
    res.json({message: `O usuário id:${id} foi excluido com sucesso`})
});

app.post('/usuarios', (req, res) => {
    const cadastraUsuario = { id: usuarios.length + 1, nome: req.body.nome }
    usuarios.push(cadastraUsuario)
    res.status(201).json(cadastraUsuario)
})

app.listen(port, () => {
    console.log(`Aplicação rodando em http:localhost:${port}/`)
})