package com.company.design;

import com.company.design.aop.AopMain;
import com.company.design.decorator.DecoratorMain;
import com.company.design.facade.FacadeMain;
import com.company.design.observer.ObserverMain;
import com.company.design.singleton.AClazz;
import com.company.design.singleton.BClazz;
import com.company.design.singleton.SigletonMain;
import com.company.design.singleton.SocketClient;
import com.company.design.strategy.StrategyMain;

public class Main {

    public static void main(String[] args) {
        StrategyMain strategyMain = new StrategyMain();
        strategyMain.main();
    }
}
