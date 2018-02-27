package com.jing.dp.demo.status.demo;

/**
 * ���ݴ�״̬���ڲ����ж�����״̬�ĸ�д
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
        //��������״̬
        super.context.setLiftState(Context.RUNSTATE);
        super.context.run();

    }

    @Override
    protected void stop() {
        System.err.println("the lift is stopping");
    }
}
