package com.zzh.design_pattern.factory;

import com.zzh.design_pattern.Strategy.Strategy;
import com.zzh.design_pattern.Strategy.StrategyNormal;
import com.zzh.design_pattern.Strategy.StrstegyDiamond;
import com.zzh.design_pattern.Strategy.StrstegyPlatinum;
import com.zzh.design_pattern.emun.CustomerType;

import java.util.HashMap;
import java.util.Map;

public class StrategyFactory {
    private static Map<CustomerType, Strategy> strstegyMap = new HashMap<CustomerType,Strategy>();

    public static void register(CustomerType type, Strategy strategy){
        strstegyMap.put(type,strategy);
    }

    private StrategyFactory() {
    }

    public static  Strategy getInstance(CustomerType type){
        return strstegyMap.get(type);
    }
}
