package com.jing.dp.demo.status.demo.main;

import com.jing.dp.demo.status.demo.Context;

/**
 * 切换状态走一发
 */
public class Main {

    public static void main(String[] args) {
        Context context = new Context();
        // 设置状态为关梯
        context.setLiftState(Context.CLOSESTATE);
        // 一次完整的上下电梯操作
        context.open();
        context.close();
        context.run();
        context.stop();
        context.open();
        context.close();

        /**
         * 输入结果如下
         *
         *the door is opening!
         *the door is closing
         *the lift is running
         *the lift is stopping
         *
         */
    }
}
