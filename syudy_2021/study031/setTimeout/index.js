const a = document.querySelector('#A');
const b = document.querySelector('#B');
const c = document.querySelector('#C');
const output =  document.querySelector('#output');

function event2(){
    document.querySelector('.change').classList.remove('change');
}

function event1(e){
   e.target.classList.add('change');
   setTimeout(event2,500);
}
a.addEventListener('click',event1);
b.addEventListener('click',event1);
c.addEventListener('click',event1);
   


