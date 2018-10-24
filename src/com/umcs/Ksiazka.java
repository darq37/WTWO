package com.umcs;

public class Ksiazka implements Przedmiot {
    private String name; //deklarujemy atrybuty
    private Integer nrWydania;
    private Integer rokWydania;

    public Ksiazka(String name, Integer rokWydania, Integer nrWydania) {
        this.name = name;
        this.rokWydania = rokWydania;
        this.nrWydania = nrWydania;
    }

    public Ksiazka() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRokWydania() {
        return rokWydania;
    }

    public void setRokWydania(Integer rokWydania) {
        this.rokWydania = rokWydania;
    }

    public Integer getNrWydania() {
        return nrWydania;
    }

    public void setNrWydania(Integer nrWydania) {
        this.nrWydania = nrWydania;
    }

    /**
     * Wartość Książek to 2050 minus rok wydania, podzielone przez numer wydania książki.
     *
     * @return wartość książki
     */
    @Override
    public Double okreslWartosc() {
        return (2050d - rokWydania) / nrWydania;
    }
}




