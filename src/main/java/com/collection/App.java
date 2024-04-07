package com.collection;
import java.util.*;


public class App {
    public static void main(String[] args) {
    }

    public static void ex1() {

        List<String> daysOfWeek = new ArrayList<>();
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        System.out.println(daysOfWeek);
    }

    public static void ex2() {
        List<String> daysOfWeek = new ArrayList<>();
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");


        for (String day : daysOfWeek) {

            System.out.println(day);

        }
    }

    public static void ex3() {
        List<String> daysOfWeek = new ArrayList<>();
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        daysOfWeek.add(3, "Thursday");

        System.out.println(daysOfWeek);

    }

    public static void ex4() {
        List<String> daysOfWeek = new ArrayList<>();
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        List<String> firstThreeDays = daysOfWeek.subList(0,3);

        System.out.println(firstThreeDays);

    }

    public static void ex5() {
        Set<String> daysOfWeek = new HashSet<>();
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");


        System.out.println(daysOfWeek);

    }

    public static void ex6() {
        Set<String> daysOfWeekSet = new HashSet<>();
        daysOfWeekSet.add("Monday");
        daysOfWeekSet.add("Tuesday");
        daysOfWeekSet.add("Wednesday");
        daysOfWeekSet.add("Thursday");
        daysOfWeekSet.add("Friday");
        daysOfWeekSet.add("Saturday");
        daysOfWeekSet.add("Sunday");


        List<String> daysOfWeekList = new ArrayList<>(daysOfWeekSet);

        System.out.println(daysOfWeekList);
    }

    public static void ex7() {
        Set<String> nameSet = new HashSet<>();
        nameSet.add("Albert");
        nameSet.add("Bailey");
        nameSet.add("Camila");
        nameSet.add("Demi");


        List<String> nameList = new ArrayList<>(nameSet);
        Collections.sort(nameList);

        System.out.println(nameList);

    }

    public static void ex8() {
        Set<String> nameSet = new HashSet<>();
        nameSet.add("Albert");
        nameSet.add("Bailey");
        nameSet.add("Camila");
        nameSet.add("Demi");


        Set<String> sortedNameSet = new TreeSet<>(nameSet) ;

        System.out.println("Sorted name:");
        for (String name : sortedNameSet) {
            System.out.println(name);
        }
    }

    public static void ex9() {
        Map<Integer, String> carBrands = new HashMap<>();
        carBrands.put(1,"ford");
        carBrands.put(2,"Toyota");
        carBrands.put(3,"Chevrolet");

        System.out.println(carBrands);
    }

    public static void ex10() {
        Map<Integer, String> carBrands = new HashMap<>();
        carBrands.put(1,"ford");
        carBrands.put(2,"Toyota");
        carBrands.put(3,"Chevrolet");

        System.out.println(carBrands.keySet());
    }

    public static void ex11() {
        Map<Integer, String> carBrands = new HashMap<>();
        carBrands.put(1,"ford");
        carBrands.put(2,"Toyota");
        carBrands.put(3,"Chevrolet");

        System.out.println(carBrands.values());
    }

}