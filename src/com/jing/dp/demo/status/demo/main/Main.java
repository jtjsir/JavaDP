package com.jing.dp.demo.status.demo.main;

import com.jing.dp.demo.status.demo.Context;

/**
 * �л�״̬��һ��
 */
public class Main {

    public static void main(String[] args) {
        Context context = new Context();
        // ����״̬Ϊ���ݲ���
        context.setLiftState(Context.CLOSESTATE);
        // һ�����������µ��ݲ���
        context.open();
        context.close();
        context.run();
        context.stop();
        context.open();
        context.close();
    }
}
