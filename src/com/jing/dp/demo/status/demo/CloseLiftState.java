package com.jing.dp.demo.status.demo;

/**
 * 电梯打开状态，内部含有对其他状态的复写
 */
public class CloseLiftState extends AbsLiftState{
    @Override
    protected void closeDoor() {
        System.err.println("the door is closing");
    }

    @Override
    protected void openDoor() {
        // 设置开启状态
        super.context.setLiftState(Context.OPENSTATE);
        super.context.open();
    }

    @Override
    protected void run() {
        super.context.setLiftState(Context.RUNSTATE);
        super.context.run();
    }

    @Override
    protected void stop() {
        super.context.setLiftState(Context.STOPSTATE);
        super.context.stop();
    }
}
