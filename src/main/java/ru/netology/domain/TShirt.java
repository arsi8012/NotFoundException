package ru.netology.domain;

import java.util.Objects;

public class TShirt extends Product{
    private String manufacturer;

    public TShirt() {
        super();
    }

    public TShirt(int id, String name, int price, String manufacturer) {
        super(id, name, price);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TShirt tShirt = (TShirt) o;
        return manufacturer.equals(tShirt.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), manufacturer);
    }

    @Override
    public String toString() {
        return "TShirt{" +
                "manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
