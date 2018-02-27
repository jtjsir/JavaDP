package com.jing.dp.demo.status.demo;

/**
 * 电梯打开状态，内部含有对其他状态的复写
 */
public class RunLiftState extends AbsLiftState{
    @Override
    protected void closeDoor() {
        // do nothing
    }

    @Override
    protected void openDoor() {
        System.err.println("door can't open");
    }

    @Override
    protected void run() {
        System.err.println("the lift is running");
    }

    @Override
    protected void stop() {
        super.context.setLiftState(Context.STOPSTATE);
        super.context.stop();
    }
}
