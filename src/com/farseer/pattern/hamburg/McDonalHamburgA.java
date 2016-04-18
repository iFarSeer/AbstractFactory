package com.farseer.pattern.hamburg;

import com.farseer.pattern.factory.AbstractFactory;

/**
 * Created by zhaosc on 16/4/12.
 * 培根汉堡
 */
public class McDonalHamburgA extends Hamburg {

    public McDonalHamburgA(AbstractFactory factory) {
        this.factory = factory;
        setName("I'm McDonal hamburg A");
    }

    @Override
    public void prepare() {
        bacon = factory.createBacon();
        //注意,麦当劳的汉堡是全麦的哦~
        wheat = factory.createWheat();
    }
}
