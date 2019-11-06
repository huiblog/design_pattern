package com.zzh.design_pattern.context;

import com.zzh.design_pattern.Strategy.Strategy;
import org.springframework.stereotype.Component;


public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }


    public Double count(Double pay){
        return strategy.count(pay);
    }
}
