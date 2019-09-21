package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Cities {
    private List<City> cities;

    Cities(List<String> citiesNames) {
        cities = new ArrayList<>(citiesNames.size());
        for (String name : citiesNames) {
            cities.add(new City(name));
        }
    }

    Cities(Cities cities) {
        this.cities = new ArrayList<>(cities.cities);
    }

    public List<City> values(){
        return cities;
    }

    public Cities cloneAndRemove(City city) {
        Cities newCities = new Cities(this);
        newCities.cities.remove(city);
        return newCities;
    }


    public List<City> getNextCities(City searchCity) {
        List<City> nextCities = new LinkedList<>();
        char searchLetter = searchCity.getLastLetter();
        for (City city : cities) {
            if (searchLetter == city.getFirstLetter()) {
                nextCities.add(city);
            }
        }
        return nextCities;
    }
}
