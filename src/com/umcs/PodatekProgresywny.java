package com.umcs;

/**
 * PodatekProgresywny 18% od kwoty do 10 tys. włącznie, i 32% od kwoty powyżej 10 tys..
 */
public class PodatekProgresywny implements Podatek {
    @Override
    public double execute(Przedmiot przedmiot) {
        double podatek;
        if (przedmiot.okreslWartosc() <= 10000) {
            podatek = 18.0 / 100;
        } else {
            podatek = 32.0 / 100;
        }
        return przedmiot.okreslWartosc() - przedmiot.okreslWartosc() * podatek;
    }

}
