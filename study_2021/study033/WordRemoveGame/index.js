const input = document.querySelector('#input');
const container2 = document.querySelector('#container');
const cwords = container2.children;
function checker() {
  const words = document.querySelectorAll('.word');
  if (words.length === 0) {
    alert('Success!👏');
    if(confirm('retry?')) {
      window.location.reload();
    }
  }
}

function remover(e){
 if(e.key == "Enter"){
    const val = input.value;
  for(i of cwords){
    if(val==i.textContent){
      i.remove();
      checker();
    }
  }input.value="";
 }

}
input.addEventListener('keypress',remover);