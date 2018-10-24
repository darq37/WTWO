package com.umcs;

public class Rzezba implements Przedmiot {
    private Integer rokWykonania;
    private Double rozmiarRzezby;

    public Rzezba(Integer rokWykonania, Double rozmiarRzezby) {
        this.rokWykonania = rokWykonania;
        this.rozmiarRzezby = rozmiarRzezby;
    }

    public Integer getRokWykonania() {
        return rokWykonania;
    }

    public void setRokWykonania(Integer rokWykonania) {
        this.rokWykonania = rokWykonania;
    }

    /**
     * wartość Rzeźb to 2020 minus rok wykonania, pomnożone przez rozmiar rzeźby w metrach sześciennych, pomnożone razy 2.
     *
     * @return
     */
    @Override
    public Double okreslWartosc() {
        return (2020 - rokWykonania) * rozmiarRzezby * 2;
    }

    public void setRozmiarRzezby(Double rozmiarRzezby) {
        this.rozmiarRzezby = rozmiarRzezby;
    }
}
