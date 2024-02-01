package com.patterns.naramotik.singleton;

// Цель
// Гарантировать что у класса будет только единственный экземпляр с глобальной точкой доступа

// Для чего
// Для создания единственного экземпляра

// Когда использовать
// - Необходим 1 экземпляр класса

public class ProgramStarter {
    public static void main(String[] args) {
        // Получаем экземпляр класса
        ProgramLogger programLogger = ProgramLogger.getProgramLogger();
        // Работаем с приватным полем
        programLogger.addLogInfo("fdsfd");
        programLogger.shoLogFile();

        // При повторном получении объекта, выводится тот же экземпляр
        ProgramLogger programLogger1 = ProgramLogger.getProgramLogger();
        programLogger1.addLogInfo("111");
        programLogger1.shoLogFile();
    }
}


