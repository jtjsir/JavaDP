package com.jing.dp.demo.status.demo;

/**
 * 电梯打开状态，内部含有对其他状态的复写
 */
public class OpenLiftState extends AbsLiftState{
    @Override
    protected void closeDoor() {
        //切换状态至关闭状态
        super.context.setLiftState(Context.CLOSESTATE);
        // 调用关闭方法
        super.context.close();
    }

    @Override
    protected void openDoor() {
        System.err.println("the door is opening!") ;
    }

    @Override
    protected void run() {
        System.err.println("the lift can't run");
    }

    @Override
    protected void stop() {
        // do nothing
    }
}
