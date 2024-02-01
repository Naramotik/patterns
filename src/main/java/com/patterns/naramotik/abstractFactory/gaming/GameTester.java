package com.patterns.naramotik.abstractFactory.gaming;

import com.patterns.naramotik.abstractFactory.Tester;

public class GameTester implements Tester {
    @Override
    public void startTest() {
        System.out.println("im a game Tester");
    }
}
