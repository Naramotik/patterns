package com.patterns.naramotik.abstractFactory.gaming;

import com.patterns.naramotik.abstractFactory.ProjectManager;

public class GameProjectManager implements ProjectManager {

    @Override
    public void startManage() {
        System.out.println("im a game PM");
    }
}
