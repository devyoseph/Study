hide()
global.python_X=getX()
global.python_Y=getY()
var ready = 0;
var after=  0;
global.hp1=30;
onSignal("start1",function(){
    show()
    moveTo(1000,250)
    playSound("booster", false)
    wait(2)
    sendSignal("dice")
})
playAnimation("idle",true)

onSignal("dice",function(){
    while(after==ready){
        ready=getRandom(1,5)
    }
    after=ready
    if(ready==1){
    sendSignal("pattern1")
    }else if(ready==2){
    sendSignal("pattern2")
    }else if(ready==3){
    sendSignal("pattern3")
    }else if(ready==4){
    sendSignal("pattern4")
    }else{
    sendSignal("pattern5")
    }
})

onSignal("pattern1",function(){
    wait(1)
    moveTo(1000,500)
    setFlipX(false)
    playAnimation("attack",true)
    playSound("arrow_magic", false)
    sendSignal("ball1")
    wait(1)
    playAnimation("idle",true)
    sendSignal("dice")
})

onSignal("pattern2",function(){
    wait(1)
    moveTo(700,500)
    setFlipX(false)
    playAnimation("attack",true)
    playSound("arrow_magic", false)
    sendSignal("ball2")
    shake()
    wait(1)
    playAnimation("idle",true)
    sendSignal("dice")
})

onSignal("pattern3",function(){
    wait(1)
    moveTo(300,250)
    setFlipX(true)
    playAnimation("attack",true)
    playSound("arrow_magic", false)
    sendSignal("ball3")
    wait(1)
    playAnimation("idle",true)
    sendSignal("dice")
})

onSignal("pattern4",function(){
    wait(1)
    moveTo(300,500)
    setFlipX(true)
    playAnimation("attack",true)
    playSound("arrow_magic", false)
    sendSignal("ball4")
    wait(1)
    playAnimation("idle",true)
    sendSignal("dice")
})

onSignal("pattern5",function(){
    wait(1)
    moveTo(1000,250)
    setFlipX(false)
    playAnimation("attack",true)
    playSound("arrow_magic", false)
    sendSignal("ball5")
    wait(1)
    playAnimation("idle",true)
    sendSignal("dice")
})

onSignal("damaged",function(){
    global.hp1--;
    playAnimation("death",false)
    if(global.hp1==0){
        moveTo(1000,500)
        sendSignal("clear")
        kill()
    }
})







