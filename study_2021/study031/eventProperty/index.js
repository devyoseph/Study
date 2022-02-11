const toDoList = document.querySelector('#to-do-list');
const items = toDoList.children;

function updateToDo(event) {
  event.target.classList.toggle("done");
}

for( i of items){
  i.addEventListener('click',updateToDo);
}


items[2].removeEventListener('click', updateToDo);