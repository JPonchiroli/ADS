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
    alert("Login enviado! (a ser implementado)");
    if (modal) {
      modal.style.display = "none";
    }
  };
});
