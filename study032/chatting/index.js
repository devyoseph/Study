const chatBox = document.querySelector('#chat-box');
const input = document.querySelector('#input');
const send = document.querySelector('#send');

function sendMyText(e) {
  if((e.key == 'Enter' && !e.shiftKey) || e.type == 'click'){
    const newMessage = input.value;
  if (newMessage) {
    const div = document.createElement('div');
    div.classList.add('bubble', 'my-bubble');
    div.innerText = newMessage;
    chatBox.append(div);
  } else {
    alert('메시지를 입력하세요...');
  }
  input.value = '';
  input.blur();
}
}

send.addEventListener('click', sendMyText);

// 여기에 코드를 작성해 주세요.
input.addEventListener('keypress',sendMyText);