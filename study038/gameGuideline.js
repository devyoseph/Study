export class Guideline{
    constructor(stageWidth, stageHeight){
        this.stageWidth = stageWidth;
        this.stageHeight = stageHeight;
    }

    draw(ctx, cannon, angle){
        //공 발사 위치
        let startX = cannon.x+this.stageWidth/13;
        let startY = cannon.y;
        let arriveX = startX + 100*Math.cos(angle);
        let arriveY = startY - 100*Math.sin(angle);
        ctx.lineWidth = 2;
        ctx.strokeStyle = 'red';
        ctx.lineJoin = 'round';
        ctx.setLineDash([10]);
        ctx.beginPath();
        ctx.moveTo(startX, startY);
        ctx.lineTo(arriveX, arriveY);
        ctx.stroke();
    }
}
