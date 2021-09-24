const flagBlue = document.querySelector('.flag-blue');
const flagWhite = document.querySelector('.flag-white');

function reset() {
  document.querySelector('.up').classList.remove('up');
}

function flagUp(e) {

  e.target.classList.add('up');

  setTimeout(reset, 500);
}


document.addEventListener('contextmenu', function (event) {
 
    event.preventDefault();
});

// 테스트 코드
document.addEventListener('mousedown', flagUp);