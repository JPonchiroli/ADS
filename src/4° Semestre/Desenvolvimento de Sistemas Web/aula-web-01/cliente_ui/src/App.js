import React from "react";
import UsuariosList from "./components/UsuariosList";
import UsuariosForm from "./components/UsuariosForm";
import axios from 'axios'


function App() {
  return (
   <div>
      <h1>Gerenciamento de Usuários - UniSenai</h1>
      <UsuariosForm />
      <UsuariosList />
   </div>
  );
}

export default App;
