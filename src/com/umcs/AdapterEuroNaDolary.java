package com.umcs;

public class AdapterEuroNaDolary implements AdapterWalut {

    @Override
    public double przelicz(double euro) {
        return euro * 3.8 / 3;
    }
}
