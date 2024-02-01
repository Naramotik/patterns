package com.patterns.naramotik.abstractFactory.gaming;

import com.patterns.naramotik.abstractFactory.Developer;

public class GameDeveloper implements Developer {
    @Override
    public void startDevelop() {
        System.out.println("im a game developer");
    }
}
