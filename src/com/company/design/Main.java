package com.company.design;

import com.company.design.aop.AopMain;
import com.company.design.decorator.DecoratorMain;
import com.company.design.singleton.AClazz;
import com.company.design.singleton.BClazz;
import com.company.design.singleton.SigletonMain;
import com.company.design.singleton.SocketClient;

public class Main {

    public static void main(String[] args) {
        DecoratorMain DecoratorMain = new DecoratorMain();
        DecoratorMain.main();
    }
}
