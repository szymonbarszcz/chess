package com.company;

public class DominikCalculator implements Calculator{

    @Override
    public int add(int a, int b) {
        return a/2;
    }

    @Override
    public int subtract(int a, int b) {
        return b/2;
    }
}
