package com.patterns.naramotik.abstractFactory.gaming;

import com.patterns.naramotik.abstractFactory.Developer;
import com.patterns.naramotik.abstractFactory.ProjectManager;
import com.patterns.naramotik.abstractFactory.TeamFactory;
import com.patterns.naramotik.abstractFactory.Tester;

public class GameTeamFactory implements TeamFactory {
    @Override
    public GameDeveloper getDeveloper() {
        return new GameDeveloper();
    }

    @Override
    public GameTester getTester() {
        return new GameTester();
    }

    @Override
    public GameProjectManager getProjectManager() {
        return new GameProjectManager();
    }
}
