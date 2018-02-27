package com.jing.dp.demo.status.demo.main;

import com.jing.dp.demo.status.demo.Context;

/**
 * �л�״̬��һ��
 */
public class Main {

    public static void main(String[] args) {
        Context context = new Context();
        // ����״̬Ϊ����
        context.setLiftState(Context.CLOSESTATE);
        // һ�����������µ��ݲ���
        context.open();
        context.close();
        context.run();
        context.stop();
        context.open();
        context.close();

        /**
         * ����������
         *
         *the door is opening!
         *the door is closing
         *the lift is running
         *the lift is stopping
         *
         */
    }
}
