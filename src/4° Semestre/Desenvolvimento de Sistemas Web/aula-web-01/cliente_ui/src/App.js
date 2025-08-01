import React from "react";
import UsuariosList from "./components/UsuariosList";
import axios from 'axios'


function App() {
  return (
   <div>
      <h1>Gerenciamento de Usuários - UniSenai</h1>
      <UsuariosList />
   </div>
  );
}

export default App;
