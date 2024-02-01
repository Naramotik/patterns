package com.patterns.naramotik.abstractFactory;
import com.patterns.naramotik.abstractFactory.banking.BankingTeamFactory;
import com.patterns.naramotik.abstractFactory.gaming.GameTeamFactory;


// Цель
// Создание интерфейса для созднания сразу множества взаимосвязанных объектов,
// без жесткой привязки к конкретным классам

// Для чего
// Для создания группы связанных объектов

// Когда использовать
// - объекты должны использоваться вместе
// - необходимы объекты, но нужно раскрывать только интерфейсы, но не реализацию

public class Project {
    public static void main(String[] args) {

        // Создаем фабрику объектов
        TeamFactory bankingTeamFactory = new BankingTeamFactory();
        // Получаем с фабрики каждый объект
        Developer bankingDeveloper = bankingTeamFactory.getDeveloper();
        Tester bankingTester = bankingTeamFactory.getTester();
        ProjectManager bankingProjectManager = bankingTeamFactory.getProjectManager();
        // Работаем с объектами
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

// ОБЪЯСНЕНИЕ
// Создали интерфейсы для всех работников (Tester, Developer, ProjectManager)
// Создали интерфейс TeamFactory, с методами для возврата этих интерфейсов
// Создали группу banking со своими работниками и фабрикой, реализующими созданные выше интерфейсы
// Создали группу gaming со своими работниками и фабрикой, реализующими созданные выше интерфейсы
