package com.jing.dp.demo.policy.sample.apply.ifs;
/**
 * 生成不同策略的接口
 * @author hspcadmin
 *返回不同折扣后的金额
 */
public interface CalPrice {

	public Double calPrice(Double originPrice) ;
}
