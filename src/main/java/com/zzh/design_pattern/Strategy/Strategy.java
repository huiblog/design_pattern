package com.zzh.design_pattern.Strategy;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;


public interface Strategy   {

    public Double count(Double pay);
}
