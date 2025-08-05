import React, { useState } from "react";
import axios from 'axios'

function UsuariosForm() {
    const [nomeUsuario, setNomeUsuario] = useState("")
    const [mensagem, setMensagem] = useState("")

    const handleSubmit = async (e) => {
        e.preventDefault();
        try {
            await axios.post('http://localhost:3001/usuarios', { nome: nomeUsuario });
            setMensagem("Usuário cadastrado com sucesso!");
            window.location.reload();
        } catch (error) {
            setMensagem("Erro ao cadastrar usuário.");
        }
    }

    return (
        <div>  
            <form onSubmit={handleSubmit}>
                <h3>Cadastre novos usuários:</h3>
                <input 
                    type="text" 
                    placeholder="Informe um usuário" 
                    value={nomeUsuario} 
                    onChange={(e) => setNomeUsuario(e.target.value)} 
                    required={true}/>
                <button type="submit">Enviar</button>
            </form>
            {mensagem && <p>{mensagem}</p>}
        </div>
    )
}

export default UsuariosForm;