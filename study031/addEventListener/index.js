const nonstandard = document.querySelectorAll('[data-nonstandard]');
const output =  document.querySelector('#output');
console.log(nonstandard);
function event1(){
console.log('자바스크립트');
}
    function event2(){
        console.log('입니다');
    }
nonstandard[0].addEventListener('click',event1);
   


