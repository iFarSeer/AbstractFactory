package com.farseer.pattern.hamburg;

import com.farseer.pattern.factory.AbstractFactory;
import com.farseer.pattern.material.MaterialBacon;
import com.farseer.pattern.material.MaterialVegetarian;
import com.farseer.pattern.material.MaterialWheat;

/**
 * Created by zhaosc on 16/4/12.
 * 汉堡
 */
public abstract class Hamburg {

    private String name;
    protected MaterialBacon bacon;
    protected MaterialWheat wheat;
    protected MaterialVegetarian vegetarian;

    protected AbstractFactory factory;


    /**
     * 准备原料
     */
    public abstract void prepare();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    /**
     *
     */
    public void make() {
        System.out.println(String.format("制作[%s]...", name));
    }

    /**
     * 打包
     */
    public void box() {
        System.out.println(String.format("打包[%s]...", name));
    }
}
