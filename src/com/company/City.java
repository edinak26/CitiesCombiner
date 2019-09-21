package com.company;

import java.util.Objects;

public class City {
    private char firstLetter;
    private char lastLetter;
    private String name;
    City(String name){
        this.name = name;
        firstLetter = Character.toLowerCase(name.charAt(0));
        lastLetter = name.charAt(name.length()-1);
    }

    public char getFirstLetter() {
        return firstLetter;
    }

    public char getLastLetter() {
        return lastLetter;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
