import{Ball}from './element/ball.js';
import { Brick } from './element/brick.js';
import{Cannon}from './element/cannon.js';
import{Stage}from './element/stage.js';
//import {Engine} from './element/engine.js';

var balls = [];
var fire_ball = false;
//공의 타입과 속도
var ball_type = 1;
var ball_speed = 50;
var ball_angle = PI/4;
var ball_magnitude = 1;

    constructor(){
        this.canvas = document.createElement('canvas');
        this.ctx = this.canvas.getContext('2d');

        document.body.appendChild(this.canvas);

        window.addEventListener('resize', this.resize.bind(this), false);
        this.resize();
        
        this.stage = new Stage(1, this.stageWidth, this.stageHeight);
        this.walls = this.stage.walls;
        this.walls_hor_X = this.stage.walls_hor_X;
        this.walls_hor_Y = this.stage.walls_hor_Y;
       
        if(onGame === false){
            for(let i = 0; i < this.walls.length; i++){
                for(let j = 0; j < this.walls[i].length; j++){
                    var brick = new Brick(this.walls[i][j],this.walls_hor_X[i][j],this.walls_hor_Y[i][j],
                                this.stageWidth,this.stageHeight, balls, brick_touch);
                    bricks.push(brick);
                }
            }   
            onGame = true;}


       
        this.cannon = new Cannon(this.stageWidth, this.stageHeight);
        document.addEventListener('keydown', this.cannonMove.bind(this), false);
        document.addEventListener('keydown', this.cannonAiming.bind(this), false);
        //공 관련
        document.addEventListener('keydown', this.fire.bind(this), false);
        window.requestAnimationFrame(this.animate.bind(this));
        document.addEventListener('keydown', this.shiftBall.bind(this));
    }
    
    resize(){
        this.stageWidth = document.body.clientWidth;
        this.stageHeight = document.body.clientHeight;
       
        this.canvas.width = this.stageWidth * 2;
        this.canvas.height = this.stageHeight *2;
        this.ctx.scale(2,2); 
    }

    animate(t){
        window.requestAnimationFrame(this.animate.bind(this));
        this.ctx.clearRect(0,0,this.stageWidth,this.stageHeight);
       
        this.cannon.draw(this.ctx, this.stageWidth,this.stageHeight, ball_angle);
       
        bricks.forEach((brick_each,i , o)=>{
            brick_each.draw(this.ctx, balls, brick_touch)
            if(brick_each.type == 0){
                o.splice(i,1);
            }
        })
        //공을 발사
        if(fire_ball == true){
            //if함수 내부에서 볼을 정의하고 보낸다, 외부에서 정의한 걸 불러오면 오류
            switch(ball_type){
                case 1: var ball =  new Ball(1, ball_magnitude, this.cannon.x, this.cannon.y, ball_angle, this.stageWidth, this.stageHeight, ball_speed); break;
                case 2: var ball =  new Ball(2, ball_magnitude, this.cannon.x, this.cannon.y, ball_angle, this.stageWidth, this.stageHeight, ball_speed); break;
                case 3: var ball =  new Ball(3, ball_magnitude, this.cannon.x, this.cannon.y, ball_angle, this.stageWidth, this.stageHeight, ball_speed); break;
            }
            // var ball =  new Ball(1, this.cannon.x, this.cannon.y, ball_angle, this.stageWidth, this.stageHeight, ball_speed);
            balls.push(ball);
            fire_ball = false;
        } 
        balls.forEach((ball_each, i, o) =>{
            ball_each.draw(this.ctx, this.stageWidth, this.stageHeight);
            if(ball_each.speed < 0.2){
                o.splice(i,1);}
        })

    }

    cannonMove(e){
        if(e.code === 'ArrowLeft'){
            this.cannon.x -= 10;
        }
        if(e.code === 'ArrowRight'){
            this.cannon.x += 10;
        }
    }

    cannonAiming(e){
        if(e.code === 'ArrowUp'){
            ball_angle += PI/90;
        }
        if(e.code === 'ArrowDown'){
            ball_angle -= PI/90;
        }
    }

    fire(e){
        if(e.code === 'Space'){
            fire_ball = true;
        }

    }

    shiftBall(e){

        if(e.key === 'Shift'){
        
            switch(ball_type){
                case 1: ball_type++; break;
                case 2: ball_type++; break;
                case 3: ball_type = 1; break;
            }
        }
    }



    }


window.onload = () =>{
    new App();
}
