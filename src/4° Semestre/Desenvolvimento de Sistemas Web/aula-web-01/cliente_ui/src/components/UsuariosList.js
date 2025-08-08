import axios from 'axios';
import { useEffect, useState } from 'react';

function UsuariosList({atualizar}) {
    const [usuarios, setUsuarios] = useState([]);
    const [editandoId, setEditandoId] = useState(null)
    const [nomeEditado, setNomeEditado] = useState("");

    const fetchUsuarios = async () => {
        const res = await axios.get('http://localhost:3001/usuarios');
        setUsuarios(res.data);
    }

    useEffect(() => {
        fetchUsuarios();
    }, [atualizar]);

    const deletaUsuario = async (id) => {
        const res = await axios.delete(`http://localhost:3001/usuarios/${id}`);
        setUsuarios(usuarios.filter(usuario => usuario.id !== id));
    }

    const editaUsurio = (usuario) => {
        setEditandoId(usuario.id);
        setNomeEditado(usuario.nome);
        console.log("Editando usuário:", usuario);
    }

    const cancelaEdicao = () => {
        setEditandoId(null);
        setNomeEditado("");
    }

const salvaEdicao = async (usuario) => {
    if (!nomeEditado) return;
    try {
        await axios.put(`http://localhost:3001/usuarios/${usuario.id}`, { nome: nomeEditado });
        await fetchUsuarios(); // Atualiza a lista com os dados do backend
        setEditandoId(null);
        setNomeEditado("");
    } catch (error) {
        alert("Erro ao editar usuário");
    }
}

    return(
        <div>
            <h3>Usuários cadastrados:</h3>
            { usuarios.length > 0 ? (
                    <ul>
                        { usuarios.map((usuario, index) => (
                                <li key={index}>
                                    {editandoId === usuario.id ? (
                                        <>
                                            <input type="text" value={nomeEditado}
                                            onChange={ e => setNomeEditado(e.target.value)}/>
                                            <button onClick={() => salvaEdicao(usuario)}> Salvar Edição </button>
                                            <button onClick={() => cancelaEdicao()}> Cancelar Edição </button>
                                        </>
                                    ) : (
                                        <>  
                                            { usuario.nome ||`Usuário ${index + 1}`}
                                            <button onClick={() => editaUsurio(usuario)}> Editar </button>
                                            <button onClick={() => deletaUsuario(usuario.id)}> Excluir </button>
                                        </>
                                    )}
                                </li>
                            ))}
                    </ul>
                ) : (
                    <p>Não há dados</p>
                )
            }
        </div>
    );
}

export default UsuariosList