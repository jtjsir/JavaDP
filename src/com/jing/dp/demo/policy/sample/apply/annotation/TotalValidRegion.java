package com.jing.dp.demo.policy.sample.apply.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 指定注解区间
 * @author hspcadmin
 *
 */
@Target(ElementType.TYPE) // 注解应用在类上
@Retention(RetentionPolicy.RUNTIME) // 注解应用在运行中
public @interface TotalValidRegion {
	
	int max() default Integer.MAX_VALUE;//max()可以给括号传参

	int min() default Integer.MIN_VALUE;//min()可以给括号传参
}
