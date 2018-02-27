package com.jing.dp.demo.status.demo;

/**
 * 环境类，内部含有AbsLiftState的实例
 * <p>
 * 并且在此类定义所有的静态状态对象
 */
public class Context {

    // 定义状态对象
    public static final AbsLiftState OPENSTATE = new OpenLiftState();
    public static final AbsLiftState CLOSESTATE = new CloseLiftState();
    public static final AbsLiftState RUNSTATE = new RunLiftState();
    public static final AbsLiftState STOPSTATE = new StopLiftState();

    // 状态实例
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
