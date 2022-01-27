package com.gb.base_1919_lesson_3;

public class Counter {

    public void setCounterOne(int counterOne) {
        this.counterOne = counterOne;
    }

    public void setCounterTwo(int counterTwo) {
        this.counterTwo = counterTwo;
    }

    public void setCounterThree(int counterThree) {
        this.counterThree = counterThree;
    }

    public int getCounterOne() {
        return counterOne;
    }

    public int getCounterTwo() {
        return counterTwo;
    }

    public int getCounterThree() {
        return counterThree;
    }

    public void incCounterOne() {
        counterOne++;
    }

    public void incCounterTwo() {
        counterTwo++;
    }

    public void incCounterThree() {
        counterThree++;
    }

    private int counterOne = 0;
    private int counterTwo = 0;
    private int counterThree = 0;
}
