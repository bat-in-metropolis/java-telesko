package dev.manas.learning.enums;

/** Enum constants are objects and can own immutable data and behavior. */
public enum LaptopModel {
    MACBOOK(2200),
    XPS(2400),
    SURFACE(1500),
    THINKPAD(1200);

    private final int priceInDollars;

    LaptopModel(int priceInDollars) {
        this.priceInDollars = priceInDollars;
    }

    public int getPriceInDollars() {
        return priceInDollars;
    }
}
