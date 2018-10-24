package com.umcs;

public class Main {

    public static void main(String[] args) {
        Magazyn magazyn = new Magazyn();
        magazyn.dodajDoSpisu(new Ksiazka(1992, 5));
        magazyn.dodajDoSpisu(new Ksiazka(1987, 1));
        magazyn.dodajDoSpisu(new Obraz(1456));
        magazyn.dodajDoSpisu(new Obraz(997));
        magazyn.dodajDoSpisu(new Rzezba(2005, 3d));
        System.out.println(magazyn.pobierzWartoscPoOpodatkowaniu(Przedmiot::okreslWartosc));
        System.out.println(magazyn.pobierzWartoscPoOpodatkowaniu(new PodatekLiniowy()));
        System.out.println(magazyn.pobierzWartoscPoOpodatkowaniu(new PodatekProgresywny()));
    }
}
