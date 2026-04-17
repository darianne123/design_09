package org.example.casual;

import org.example.product.Shoes;

public class CasualShoes implements Shoes {

    @Override
    public void wear() {
        System.out.println("Wearing casual shoes.");
    }
}