package com.jing.dp.demo.status.demo;

/**
 * 电梯打开状态，内部含有对其他状态的复写
 */
public class StopLiftState extends AbsLiftState {
    @Override
    protected void closeDoor() {
        // do nothing
    }

    @Override
    protected void openDoor() {
        // do nothing
    }

    @Override
    protected void run() {
        //设置启动状态
        super.context.setLiftState(Context.RUNSTATE);
        super.context.run();

    }

    @Override
    protected void stop() {
        System.err.println("the lift is stopping");
    }
}
