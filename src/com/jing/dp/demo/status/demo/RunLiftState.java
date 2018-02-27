package com.jing.dp.demo.status.demo;

/**
 * ���ݴ�״̬���ڲ����ж�����״̬�ĸ�д
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
