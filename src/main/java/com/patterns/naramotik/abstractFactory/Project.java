package com.patterns.naramotik.abstractFactory;

import com.patterns.naramotik.abstractFactory.Developer;
import com.patterns.naramotik.abstractFactory.ProjectManager;
import com.patterns.naramotik.abstractFactory.TeamFactory;
import com.patterns.naramotik.abstractFactory.Tester;
import com.patterns.naramotik.abstractFactory.banking.BankingTeamFactory;
import com.patterns.naramotik.abstractFactory.gaming.GameTeamFactory;


// Цель


public class Project {
    public static void main(String[] args) {

        TeamFactory bankingTeamFactory = new BankingTeamFactory();

        Developer bankingDeveloper = bankingTeamFactory.getDeveloper();
        Tester bankingTester = bankingTeamFactory.getTester();
        ProjectManager bankingProjectManager = bankingTeamFactory.getProjectManager();

        bankingDeveloper.startDevelop();
        bankingTester.startTest();
        bankingProjectManager.startManage();




        TeamFactory gameTeamFactory = new GameTeamFactory();

        Developer gameDeveloper = gameTeamFactory.getDeveloper();
        Tester gameTester = gameTeamFactory.getTester();
        ProjectManager gameProjectManager = gameTeamFactory.getProjectManager();

        gameDeveloper.startDevelop();
        gameTester.startTest();
        gameProjectManager.startManage();
    }


}
