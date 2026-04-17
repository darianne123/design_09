package org.example.casual;


import org.example.product.Pants;

public class CasualPants implements Pants {

    @Override
    public void wear() {
        System.out.println("Wearing casual pants.");
    }
}