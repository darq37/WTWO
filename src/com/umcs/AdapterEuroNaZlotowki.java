package com.umcs;

public class AdapterEuroNaZlotowki implements AdapterWalut {
    @Override
    public double przelicz(double euro) {
        return euro * 4.2;
    }
}
