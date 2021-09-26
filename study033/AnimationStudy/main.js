var canvas = document.getElementById('canvas');
var ctx = canvas.getContext('2d');
canvas.width=window.innerWidth - 100;
canvas.height=window.innerHeight -100;

var cannon = {
	x : 10,
    y : 200,
    width : 50,
    height : 50,
    
    draw(){
    ctx.fillStyle = 'green';
    ctx.fillRect(this.x,this.y,this.width,this.height);
    }
}

class Wall {
    constructor(){
        this.x = 300;
        this.y = 100;
        this.width = 50;
        this.height = 10;
    }
    draw(){
        ctx.fillStyle = 'brown';
        ctx.fillRect(this.x,this.y,this.width,this.height);
    }
}
// var wall = new Wall();
var timer = 0;
var walls = [];
function FrameMove(){
        ctx.clearRect(0,0,canvas.width,canvas.height);
        requestAnimationFrame(FrameMove);
        timer ++;

        if(timer % 150 === 0){
            var wall = new Wall();
            walls.push(wall);
        }

        walls.forEach((a)=>{
            a.x--;
            a.draw();
        })
        cannon.draw();

}
FrameMove();
// function CannonMove(e){
//     if(e.key == 'ArrowLeft'){
//         ctx.clearRect(0,0,canvas.width,canvas.height);
//         cannon.x = cannon.x - CANNON_MOVEMENT;
//         cannon.draw();
//     }

//     if(e.key == 'ArrowRight'){
//         ctx.clearRect(0,0,canvas.width,canvas.height);
//         cannon.x = cannon.x + CANNON_MOVEMENT;
//         cannon.draw();
//     }
// }


