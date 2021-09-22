const fields = document.querySelectorAll('[field]');
console.log(fields);

const task = {
    title : '프로그래머',
    money : '300,000',
    status : '',
};

for( let i of fields){
    const field = i.getAttribute('field');
    i.textContent = task[field];
    console.log(i);
};
console.log(task);

const buttons = document.querySelectorAll('.btn');
for( let btn of buttons){
    const status = btn.getAttribute('status');
    btn.onclick = function(){
        fields[2].textContent = status;
        fields[2].setAttribute('status',status);
    }
}