package com.patterns.naramotik.abstractFactory.banking;

import com.patterns.naramotik.abstractFactory.Developer;

public class BankingDeveloper implements Developer {

    @Override
    public void startDevelop() {
        System.out.println("Im developing");
    }
}
