package com.jing.dp.demo.policy.sample.apply.impl;

import com.jing.dp.demo.policy.sample.apply.annotation.TotalValidRegion;
import com.jing.dp.demo.policy.sample.apply.ifs.CalPrice;
/**
 * ÆÕÍ¨²ßÂÔ
 * @author hspcadmin
 *
 */
@TotalValidRegion( max = 1000)
public class CommonPolicy implements CalPrice {

	@Override
	public Double calPrice(Double originPrice) {
		return originPrice;
	}

}
