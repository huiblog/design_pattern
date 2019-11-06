package com.zzh.design_pattern.Strategy;

import com.zzh.design_pattern.emun.CustomerType;
import com.zzh.design_pattern.factory.StrategyFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("StrategyNormal")
public class StrategyNormal implements Strategy, InitializingBean{

    @Override
    public Double count(Double pay) {
        return pay ;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        StrategyFactory.register(CustomerType.NORMAL,this);
    }
}
