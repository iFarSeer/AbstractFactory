package com.farseer.pattern.factory;

import com.farseer.pattern.material.*;

/**
 * Created by zhaosc on 16/4/18.
 */
public class McDonalMaterialFactory extends AbstractFactory {
    @Override
    public MaterialBacon createBacon() {
        System.out.println("McDonal factory prepare material Bacon");
        return new McDonalBacon();
    }

    @Override
    public MaterialVegetarian createVegetarian() {
        System.out.println("McDonal factory prepare material vegetarian");
        return new McDonalVegetarian();
    }

    @Override
    public MaterialWheat createWheat() {
        System.out.println("McDonal factory prepare material wheat");
        return new McDonalWheat();
    }
}
