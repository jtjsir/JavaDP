package com.jing.dp.demo.status.demo;

/**
 * @jingsir �Թ�Ϊ������<b>����</b>��Ϊ״̬ģʽ��Ӧ������
 * <p>
 * ����������࣬�������״̬��д;�ڲ�Ҳ���ж�Context����������ù�״̬�л�
 */
public abstract class AbsLiftState {

    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    /**
     * ����رն���
     */
    abstract protected void closeDoor();

    /**
     * ��������
     */
    abstract protected void openDoor();

    /**
     * ��������
     */
    abstract protected void run();

    /**
     * ֹͣ����
     */
    abstract protected void stop();
}
