package com.zzh.design_pattern;

import com.zzh.design_pattern.Strategy.Strategy;
import com.zzh.design_pattern.context.Context;
import com.zzh.design_pattern.emun.CustomerType;
import com.zzh.design_pattern.factory.StrategyFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignPatternApplication.class, args);
        strategy();
    }

    private static void strategy() {
        Double pay = 100.00D;

        Strategy strategyNormal = StrategyFactory.getInstance(CustomerType.NORMAL);
        Context contextNormal  = new Context(strategyNormal);
        System.out.println(CustomerType.NORMAL.toString() + "应付：" + contextNormal.count(pay));

        Strategy strategyPlatinum = StrategyFactory.getInstance(CustomerType.PLATINUM);
        Context contextPlatinum  = new Context(strategyPlatinum);
        System.out.println(CustomerType.PLATINUM.toString() + "应付：" +contextPlatinum.count(pay));


        Strategy strategyDuamond = StrategyFactory.getInstance(CustomerType.DUAMOND);
        Context contextDuamond  = new Context(strategyDuamond);
        System.out.println(CustomerType.DUAMOND.toString() + "应付："+contextDuamond.count(pay));
    }

}
