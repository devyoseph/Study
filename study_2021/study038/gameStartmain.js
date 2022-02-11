import{Start}from './element/start.js';
import{Ball}from './element/ball.js';
import {Brick} from './element/brick.js';
import{Cannon}from './element/cannon.js';
import{Stage}from './element/stage.js';
import{Gauge}from './element/gauge.js';
//게임의 시작
let start = false;
let start_hover = false;
//각도 사용을 위한 PI 변수화
const PI = Math.PI;
//공 배열과 공 발사 변수
var balls = [];
var fire_ball = false;
//공의 타입과 속도
var ball_type = 1;
var ball_angle = PI/4;
var ball_magnitude = 1;
//stage의 벽돌 배치 walls, stage레벨
var walls = []; //로드용
let stage_level = 1;
//벽돌
var bricks = [];
//게임이 진행중인가, 벽이 부서졌는가
let onGame= false;
let brick_touch = false;
//게이지
let on_gauge = false;
let gauge_full = false;
let gauge_percent = 0;
let gauge_transfer = 0;

class App{
    constructor(){
        this.canvas = document.createElement('canvas');
        this.ctx = this.canvas.getContext('2d');

        document.body.appendChild(this.canvas);

        window.addEventListener('resize', this.resize.bind(this), false);
        this.resize(); //리사이즈가 이벤트를 거치지 않아도 발동하기 위함
        //시작화면
        this.start = new Start(start, this.stageWidth, this.stageHeight);
        //관련 이벤트
        document.addEventListener('mousemove', this.gameStart_before.bind(this), false);
        document.addEventListener('click', this.gameStart_after.bind(this));
        // if(start === true){
        // //스테이지 로드
        // this.stage = new Stage(1, this.stageWidth, this.stageHeight);
        // this.walls = this.stage.walls;
        // this.walls_hor_X = this.stage.walls_hor_X;
        // this.walls_hor_Y = this.stage.walls_hor_Y;
        //벽
            // for(let i = 0; i < this.walls.length; i++){
            //     for(let j = 0; j < this.walls[i].length; j++){
            //         var brick = new Brick(this.walls[i][j],this.walls_hor_X[i][j],this.walls_hor_Y[i][j],
            //                     this.stageWidth,this.stageHeight, balls, brick_touch);
            //         bricks.push(brick);
            //     }
            // }   


        //대포 관련
        this.cannon = new Cannon(this.stageWidth, this.stageHeight);
        document.addEventListener('keydown', this.cannonMove.bind(this), false);
        document.addEventListener('keydown', this.cannonAiming.bind(this), false);
        //공 관련
        document.addEventListener('keydown', this.fire_before.bind(this), false);
        document.addEventListener('keyup', this.fire_after.bind(this), false);
        window.requestAnimationFrame(this.animate.bind(this));
        document.addEventListener('keydown', this.shiftBallType.bind(this));
        document.addEventListener('keydown', this.shiftBallMagnitude.bind(this));
        this.gauge = new Gauge(this.cannon, this.stageHeight);
    }
    
    resize(){
        this.stageWidth = document.body.clientWidth;
        this.stageHeight = document.body.clientHeight;
        //캔버스는 두 배
        this.canvas.width = this.stageWidth * 2;
        this.canvas.height = this.stageHeight *2;
        this.ctx.scale(2,2); //ctx scale 모두 두 배 주의
    }

    animate(t){
        window.requestAnimationFrame(this.animate.bind(this));
        this.ctx.clearRect(0,0,this.stageWidth,this.stageHeight);
        //시작
        if(start === false){
            this.start.draw(this.ctx, start, start_hover);
        }
        if(onGame === true){
                //스테이지 로드
                this.stage = new Stage(stage_level, this.stageWidth, this.stageHeight);
                this.walls = this.stage.walls;
                this.walls_hor_X = this.stage.walls_hor_X;
                this.walls_hor_Y = this.stage.walls_hor_Y;
                
                //벽돌 배열 생성
                for(let i = 0; i < this.walls.length; i++){
                    for(let j = 0; j < this.walls[i].length; j++){
                        var brick = new Brick(this.walls[i][j],this.walls_hor_X[i][j],this.walls_hor_Y[i][j],
                                    this.stageWidth,this.stageHeight, balls, brick_touch);
                    bricks.push(brick);
                    }
                }
            onGame = false;
        }
        //대포
        this.cannon.draw(this.ctx, this.stageWidth,this.stageHeight, ball_angle);
        //게이지
        this.gauge.draw(this.ctx, on_gauge,gauge_percent, this.stageWidth, this.stageHeight);
        if(on_gauge === true){
            this.gaugeMove();
        }
        //스테이지
        bricks.forEach((brick_each,i , o)=>{
            brick_each.draw(this.ctx, balls, brick_touch)
            
            if(brick_each.type == 0){
                o.splice(i,1);
            }
        })
        //공을 발사
        if(fire_ball === true){
            var ball =  new Ball(ball_type, ball_magnitude, gauge_transfer,this.cannon.x, this.cannon.y, ball_angle);
            balls.push(ball);
            fire_ball = false;
        } 
        balls.forEach((ball_each, i, o) =>{
            ball_each.draw(this.ctx, this.stageWidth, this.stageHeight);
            if(ball_each.speed < 0.2 || ball_each.ball_meet == true){
                o.splice(i,1);}
        })
    }
    gameStart_before(e){
         if((e.clientX >= this.start.x && e.clientX <= this.start.x+this.start.width)&&
         (e.clientY >= this.start.y && e.clientY <= this.start.y+this.start.height)){
            start_hover = true;
         }else{start_hover = false;}
    }
    gameStart_after(e){
        if((e.clientX >= this.start.x && e.clientX <= this.start.x+this.start.width)&&
        (e.clientY >= this.start.y && e.clientY <= this.start.y+this.start.height)){
           start = true;
           onGame = true;
        }
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

    fire_before(e){
        if(e.code === 'Space'){
            on_gauge = true;
        }
    }
    fire_after(e){
        if(e.code === 'Space'){
            on_gauge = false;
            fire_ball = true;
            gauge_transfer = gauge_percent*0.01;
            gauge_percent=0;
        }
    }

    shiftBallType(e){
        if(e.key === 'Shift'){      
            switch(ball_type){
                case 1: ball_type++; break;
                case 2: ball_type++; break;
                case 3: ball_type = 1; break;
            }
        }
    }

    shiftBallMagnitude(e){
        if(e.code === 'KeyZ'){
            switch(ball_magnitude){
                case 1: ball_magnitude++; break;
                case 2: ball_magnitude++; break;
                case 3: ball_magnitude = 1; break;
            }
        }
    }

    gaugeMove(){
        if(gauge_percent == 100){
            gauge_full = true;
        }else if(gauge_percent == 0){
            gauge_full = false;
        }

        let full = gauge_full;
        if(!full){
            gauge_percent++;
        }
        if(full){
            gauge_percent--;
        }
    }


    }


window.onload = () =>{
    new App();
}
