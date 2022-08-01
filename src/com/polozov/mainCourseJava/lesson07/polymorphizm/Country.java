package com.polozov.mainCourseJava.lesson07.polymorphizm;

public class Country {

    private String capital;
    private int population;

    public Country(String capital, int population) {
        this.capital = capital;
        this.population = population;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getMainInformation() {
        return "Не выбрана страна";
    }
}
