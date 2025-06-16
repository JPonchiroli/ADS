
const carro = document.getElementById('carro');
let posX = 50; // porcentagem do centro

document.addEventListener('keydown', function (e) {
  if (e.key === 'ArrowLeft' || e.key.toLowerCase() === 'a') {
    posX -= 5;
  } else if (e.key === 'ArrowRight' || e.key.toLowerCase() === 'd') {
    posX += 5;
  }

  // Limites entre 0% e 100% (ajustado para manter dentro da estrada)
  posX = Math.max(5, Math.min(95, posX));
  carro.style.left = posX + '%';
});
