export class Start{
    constructor(start, stageWidth, stageHeight){
        this.start = start;
        this.stageWidth = stageWidth;
        this.stageHeight = stageHeight;
        this.width = stageWidth/3;
        this.height = stageHeight/5;
        this.x = (this.stageWidth-this.width)/2;
        this.y = (this.stageHeight-this.height)/2
    }

    draw(ctx, start, start_hover){
        if(start == false){
        ctx.fillStyle = 'ivory';
        ctx.fillRect(0, 0, this.stageWidth, this.stageHeight);
        ctx.fillStyle = 'black';
        ctx.fillRect(this.x, this.y, this.width, this.height);
        }
        if(start_hover == true){
        ctx.fillStyle = 'ivory';
        ctx.fillRect(0, 0, this.stageWidth, this.stageHeight);
        ctx.fillStyle = 'red';
        ctx.fillRect(this.x, this.y, this.width, this.height);
        }
    }
}
