const nonstandard = document.querySelectorAll('[data-nonstandard');
const output =  document.querySelector('#output');
for(nonst of nonstandard){
    const nonst_value = nonst.dataset.nonstandard;
    nonst.onclick = function(){
        output.textContent = nonst_value;
        output.dataset.nonstandard = nonst_value;
    }
}
