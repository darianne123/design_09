package org.example.professional;

import org.example.product.Shoes;

public class ProfessionalShoes implements Shoes {

    @Override
    public void wear() {
        System.out.println("Wearing professional shoes.");
    }
}