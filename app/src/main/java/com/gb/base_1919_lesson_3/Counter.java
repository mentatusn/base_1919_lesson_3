package com.gb.base_1919_lesson_3;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class Counter implements Parcelable {

    Counter(){}

    protected Counter(Parcel in) {
        counterOne = in.readInt();
        counterTwo = in.readInt();
        counterThree = in.readInt();
    }

    public static final Creator<Counter> CREATOR = new Creator<Counter>() {
        @Override
        public Counter createFromParcel(Parcel in) {
            return new Counter(in);
        }

        @Override
        public Counter[] newArray(int size) {
            return new Counter[size];
        }
    };

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(counterOne);
        parcel.writeInt(counterTwo);
        parcel.writeInt(counterThree);
    }
}
