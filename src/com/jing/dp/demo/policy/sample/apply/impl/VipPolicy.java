package com.jing.dp.demo.policy.sample.apply.impl;

import com.jing.dp.demo.policy.sample.apply.annotation.TotalValidRegion;
import com.jing.dp.demo.policy.sample.apply.ifs.CalPrice;
/**
 * vip²ßÂÔ
 * @author hspcadmin
 *
 */
@TotalValidRegion(min=1000,max=3000)
public class VipPolicy implements CalPrice {

	@Override
	public Double calPrice(Double originPrice) {
		return originPrice * 0.7;
	}

}
