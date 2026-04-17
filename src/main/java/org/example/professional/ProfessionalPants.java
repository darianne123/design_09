package org.example.professional;

import org.example.product.Pants;

public class ProfessionalPants implements Pants {

    @Override
    public void wear() {
        System.out.println("Wearing professional pants.");
    }
}