package com.jing.dp.demo.status.demo;

/**
 * ���ݴ�״̬���ڲ����ж�����״̬�ĸ�д
 */
public class OpenLiftState extends AbsLiftState{
    @Override
    protected void closeDoor() {
        //�л�״̬���ر�״̬
        super.context.setLiftState(Context.CLOSESTATE);
        // ���ùرշ���
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
