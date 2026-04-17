package org.example.factory;

import org.example.product.Pants;
import org.example.product.Shoes;
import org.example.product.Top;

// Abstract factory interface for creating a matching set of garments
public interface GarmentFactory {
    Top createTop();
    Pants createPants();
    Shoes createShoes();
}