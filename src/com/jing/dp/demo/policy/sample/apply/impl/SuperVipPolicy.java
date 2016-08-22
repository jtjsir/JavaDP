package com.jing.dp.demo.policy.sample.apply.impl;

import com.jing.dp.demo.policy.sample.apply.annotation.TotalValidRegion;
import com.jing.dp.demo.policy.sample.apply.ifs.CalPrice;
/**
 * ³¬¼¶vip²ßÂÔ
 * @author hspcadmin
 *
 */
@TotalValidRegion(min=3000)
public class SuperVipPolicy implements CalPrice {

	@Override
	public Double calPrice(Double originPrice) {
		return originPrice * 0.5;
	}

}
