package com.codegym;

import java.util.List;

public class RandomListFacade {
    private static final RandomListFacade INSTANCE = new RandomListFacade();
    private RandomList randomList;
    private ListPrinter listPrinter;
    private ListFilter listFilter;

    public RandomListFacade() {
        randomList = new RandomList();
        listPrinter = new ListPrinter();
        listFilter = new ListFilter();
    }

    public static RandomListFacade getInstance() {
        return INSTANCE;
    }

    public RandomListFacade(RandomList randomList, ListPrinter listPrinter, ListFilter listFilter) {
        this.randomList = randomList;
        this.listPrinter = listPrinter;
        this.listFilter = listFilter;
    }

    public void printRandomEvenList(int size, int min, int max) {
        List<Integer> numbers = randomList.generateList(size, min, max);
        List<Integer>filterodd = listFilter.filterOdd(numbers);
        listPrinter.printList(filterodd);

    }
}
