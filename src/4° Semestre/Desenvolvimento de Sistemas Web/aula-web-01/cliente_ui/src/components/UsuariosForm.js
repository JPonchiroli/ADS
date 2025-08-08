import { useState } from 'react';
import axios from 'axios';

function UsuariosForm({ onUsuarioAdicionado }) {
    const [nomeUsuario, setNomeUsuario] = useState("")
    const [error, setError] = useState(null)

    const handleSubmit = async (e) => {
        e.preventDefault();
        if (!nomeUsuario.trim()) {
            setError("O nome é obrigatório")
            return
        }
        await axios.post("http://localhost:3001/usuarios", { nome: nomeUsuario });
        setNomeUsuario("");
        if (onUsuarioAdicionado) {
            onUsuarioAdicionado();
        }
    }

    return (
        <div>
            <form onSubmit={handleSubmit}>
                <label>Nome do usuário:</label>
                <input
                    type="text"
                    value={nomeUsuario}
                    onChange={(e) => setNomeUsuario(e.target.value)}
                />
                <button type="submit">Salvar</button>
                {error && <p style={{ color: "red" }}> {error} </p>}
            </form>
        </div>
    );

    }

export default UsuariosForm;