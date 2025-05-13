
let campoEmail = document.getElementById("email");
campoEmail.style.border = "2px solid green";

let campoSenha = document.getElementById("senha");
campoSenha.style.background = "red";

let campoLabel = document.getElementsByTagName("label");

for (let i = 0; i <= 1; i++) {
    campoLabel[i].style.color = "blue";
}

let campoBotao = document.getElementsByClassName("botao");
campoBotao[0].style.color = "red";
