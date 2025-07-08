document.addEventListener('DOMContentLoaded', function () {
  const modal = document.getElementById("loginModal");
  const loginButtons = document.querySelectorAll('.btn-header, .btn-main');

  if (modal && loginButtons.length > 0) {
    loginButtons.forEach(btn => {
      btn.addEventListener('click', function (e) {
        e.preventDefault();
        modal.style.display = "flex";
      });
    });

    window.onclick = function (event) {
      if (event.target === modal) {
        modal.style.display = "none";
      }
    };
  }

  const toggle = document.querySelector('.toggle-visibility');
  if (toggle) {
    toggle.addEventListener('click', function () {
      const input = document.getElementById("senha");
      if (input) {
        input.type = input.type === "password" ? "text" : "password";
      }
    });
  }

  window.fazerLogin = function () {
    const usuario = document.getElementById("usuario").value.trim().toLowerCase();

    if (!usuario) {
      alert("Por favor, informe o nome de usuário.");
      return;
    }

    switch (usuario) {
      case "admin":
        window.location.href = "administrador.html";
        break;
      case "cliente":
        window.location.href = "cliente.html";
        break;
      default:
        alert("Usuário não reconhecido.");
        break;
    }

    // Fecha o modal após o login (se quiser manter esse comportamento)
    const modal = document.getElementById("loginModal");
    if (modal) {
      modal.style.display = "none";
    }
  };
});

