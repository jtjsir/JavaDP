package com.jing.dp.demo.status.demo;

/**
 * @jingsir 以广为流传的<b>电梯</b>作为状态模式的应用例子
 * <p>
 * 创建抽象基类，供子类的状态复写;内部也持有对Context环境类的引用供状态切换
 */
public abstract class AbsLiftState {

    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    /**
     * 定义关闭动作
     */
    abstract protected void closeDoor();

    /**
     * 开启动作
     */
    abstract protected void openDoor();

    /**
     * 启动动作
     */
    abstract protected void run();

    /**
     * 停止动作
     */
    abstract protected void stop();
}
