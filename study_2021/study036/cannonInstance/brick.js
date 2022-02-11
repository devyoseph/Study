export class Brick{
        constructor(type, x, y, stageWidth, stageHeight, balls, brick_touch){
            this.type = type;
            this.x = x;
            this.y = y;
            this.stageWidth = stageWidth;
            this.stageHeight = stageHeight;
            this.brick_width = stageWidth/24;
            this.brick_height = stageHeight/60;
        }

        draw(ctx, balls, brick_touch){
            this.brickCollision(balls, brick_touch);
            if(this.type ==1){
                ctx.fillStyle = 'red';
                ctx.strokeRect(this.x, this.y, this.brick_width, this.brick_height);
            }
        }
  
  //벽돌 안에다 인스턴스화한 볼을 가져오고 터치유무를 확인하기 위해 변수를 가져옴
  // 터치하면 외부 변수로 연결되는 brick_touch가 켜지면서 해당 배열이 제거됨
        brickCollision(balls, brick_touch){
            for(let i=0; i<balls.length; i++){
                this.ballX = balls[i].x;
                this.ballY = balls[i].y;
                this.ballVX = balls[i].vx;
                this.ballVY = balls[i].vy;
                let ballR = balls[i].radius;
                let minX = this.ballX - ballR;
                let maxX = this.ballX + ballR;
                let minY = this.ballY + ballR;
                let maxY = this.ballY - ballR;
                let minBX = this.x;
                let maxBX = this.x + this.brick_width;
                let maxBY = this.y+this.brick_height;
                let minBY = this.y 
         //이부분 주의: 어느 물체의 중심점을 알고 충돌여부를 판단할 때 일단 표면 좌표를 계산한다
                //Y에 대해서
                if(((minY >= minBY && maxY <= maxBY) && (this.ballX >= minBX && this.ballX <= maxBX)))
                {
                    balls[i].vy *= -0.6;
                    brick_touch = true;
                    this.type =0;
                }
                //X에 대해서
                if((minX >= minBX && maxX <= maxBX) && (this.ballY >= minBY && this.ballY <= maxBY))
                {
                    balls[i].vx *= -0.6;
                    brick_touch =true;
                    this.type =0;
                   }
                }
            }
        }
