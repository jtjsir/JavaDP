package com.jing.dp.demo.status.demo;

/**
 * �����࣬�ڲ�����AbsLiftState��ʵ��
 * <p>
 * �����ڴ��ඨ�����еľ�̬״̬����
 */
public class Context {

    // ����״̬����
    public static final AbsLiftState OPENSTATE = new OpenLiftState();
    public static final AbsLiftState CLOSESTATE = new CloseLiftState();
    public static final AbsLiftState RUNSTATE = new RunLiftState();
    public static final AbsLiftState STOPSTATE = new StopLiftState();

    // ״̬ʵ��
    private AbsLiftState liftState;

    public void open() {
        this.liftState.setContext(this);
        this.liftState.openDoor();
    }

    public void close() {
        this.liftState.setContext(this);
        this.liftState.closeDoor();
    }

    public void run() {
        this.liftState.setContext(this);
        this.liftState.run();
    }

    public void stop() {
        this.liftState.setContext(this);
        this.liftState.stop();
    }

    public AbsLiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(AbsLiftState liftState) {
        this.liftState = liftState;
    }
}
