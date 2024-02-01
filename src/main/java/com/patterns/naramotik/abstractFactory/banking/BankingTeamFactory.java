package com.patterns.naramotik.abstractFactory.banking;

import com.patterns.naramotik.abstractFactory.Developer;
import com.patterns.naramotik.abstractFactory.ProjectManager;
import com.patterns.naramotik.abstractFactory.TeamFactory;
import com.patterns.naramotik.abstractFactory.Tester;

public class BankingTeamFactory implements TeamFactory {

    @Override
    public BankingDeveloper getDeveloper() {
        return new BankingDeveloper();
    }

    @Override
    public BankingTester getTester() {
        return new BankingTester();
    }

    @Override
    public BankingProjectManager getProjectManager() {
        return new BankingProjectManager();
    }
}
