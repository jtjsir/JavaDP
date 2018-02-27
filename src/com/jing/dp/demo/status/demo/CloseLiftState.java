package com.jing.dp.demo.status.demo;

/**
 * ���ݴ�״̬���ڲ����ж�����״̬�ĸ�д
 */
public class CloseLiftState extends AbsLiftState{
    @Override
    protected void closeDoor() {
        System.err.println("the door is closing");
    }

    @Override
    protected void openDoor() {
        // ���ÿ���״̬
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
