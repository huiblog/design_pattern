package com.zzh.design_pattern.Strategy;

import com.zzh.design_pattern.emun.CustomerType;
import com.zzh.design_pattern.factory.StrategyFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("StrstegyPlatinum")
public class StrstegyPlatinum  implements Strategy, InitializingBean {

    @Override
    public Double count(Double pay) {
        return pay * 0.98;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        StrategyFactory.register(CustomerType.PLATINUM,this);
    }

}
