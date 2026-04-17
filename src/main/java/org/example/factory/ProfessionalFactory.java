package org.example.factory;

import org.example.product.Pants;
import org.example.product.Shoes;
import org.example.product.Top;
import org.example.professional.ProfessionalPants;
import org.example.professional.ProfessionalShoes;
import org.example.professional.ProfessionalTop;

// Concrete factory that creates professional style garments
public class ProfessionalFactory implements GarmentFactory {

    @Override
    public Top createTop() {
        return new ProfessionalTop();
    }

    @Override
    public Pants createPants() {
        return new ProfessionalPants();
    }

    @Override
    public Shoes createShoes() {
        return new ProfessionalShoes();
    }
}