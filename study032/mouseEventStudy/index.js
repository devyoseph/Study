const map = document.querySelector('.map');

function showTitle(e) {
//classList.contains로 if문을 할 수는 없는가?
if(e.target.getAttribute('data-title')!=null){
	const making = document.createElement('span');
     making.classList.add('title');
	making.textContent=e.target.getAttribute('data-title');
	 e.target.append(making);
}

}


function removeTitle(e) {

	if(e.target.getAttribute('data-title')!=null){
		e.target.lastChild.remove();
	}

}


map.addEventListener('mouseover', showTitle);
map.addEventListener('mouseout', removeTitle);