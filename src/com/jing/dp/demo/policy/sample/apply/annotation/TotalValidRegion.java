package com.jing.dp.demo.policy.sample.apply.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ָ��ע������
 * @author hspcadmin
 *
 */
@Target(ElementType.TYPE) // ע��Ӧ��������
@Retention(RetentionPolicy.RUNTIME) // ע��Ӧ����������
public @interface TotalValidRegion {
	
	int max() default Integer.MAX_VALUE;//max()���Ը����Ŵ���

	int min() default Integer.MIN_VALUE;//min()���Ը����Ŵ���
}
