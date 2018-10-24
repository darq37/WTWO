package com.umcs;

public class PodatekLiniowy implements Podatek {
    /**
     * Mająć przedmiot, podaj wartość przedmiotu po opodatkowaniu
     *
     * @param przedmiot
     * @return wartość przedmiotu po opodatkowaniu
     */
    @Override
    public double execute(Przedmiot przedmiot) {
        return przedmiot.okreslWartosc() - przedmiot.okreslWartosc() * 19.0 / 100;
    }
}
