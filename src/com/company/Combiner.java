package com.company;

import java.util.LinkedList;
import java.util.List;

public class Combiner {
    public static List<String> combineCities(Cities cities){
        List<String> resultCombination = new LinkedList<>();
        for(City city: cities.values()){
            List<String> combination = combine(city,cities.cloneAndRemove(city));
            if(combination.size()>resultCombination.size()){
                resultCombination = combination;
            }
        }
        return resultCombination;
    }

    private static List<String> combine(City city, Cities cities) {
        List<String> result = new LinkedList<>();
        result.add(city.getName());
        result.addAll(getLongestCombination(city,cities));
        return result;
    }

    private static List<String> getLongestCombination(City city, Cities cities){
        List<String> resultCombination = new LinkedList<>();
        List<City> nextCities = cities.getNextCities(city);
        for (City nextCity : nextCities) {
            List<String> combination = combine(nextCity, cities.cloneAndRemove(nextCity));
            if (combination.size() > resultCombination.size()) {
                resultCombination = combination;
            }
        }
        return resultCombination;
    }
}
