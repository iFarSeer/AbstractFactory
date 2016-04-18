package com.farseer.pattern.factory;

import com.farseer.pattern.material.MaterialBacon;
import com.farseer.pattern.material.MaterialVegetarian;
import com.farseer.pattern.material.MaterialWheat;

/**
 * Created by zhaosc on 16/4/18.
 */
public abstract class AbstractFactory {

    public abstract MaterialBacon createBacon();
    public abstract MaterialVegetarian createVegetarian();
    public abstract MaterialWheat createWheat();

}
