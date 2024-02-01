package com.patterns.naramotik.factoryMethod;


// Цель
// Создание интерфейса, который создает объект. Выбор экземплера какого класса создавать
// остается за классами, которые имплементируют даный интерфейс

// Для чего
// Для делегирования создания экземпляров другому классу

// Когда использовать
// - Заранее не известно, экземпляр какого класса нужно будет создавать


public class FactoryMethod {

    public static void main(String[] args) {

        // Создаем объект фабрики, нужную нам
        DeveloperFactory developerFactory = new JavaDeveloperFactory();
        // Создаем developer с помощью фабрики
        Developer developer1 = developerFactory.createDeveloper();
        // Работаем с полученным классом
        developer1.typing();

        DeveloperFactory developerFactory1 = new CppDeveloperFactory();
        Developer developer2 = developerFactory1.createDeveloper();
        developer2.typing();
    }
}

// Объяснение
// Создали Interface Developer [+ метод typing]
// 2 реализации интерфейса Developer (CppDeveloper и JavaDeveloper)
// Создали Interface DeveloperFactory, возвращающий Developer
// 2 реализации этого интерфейса (JavaDeveloperFactory и CppDeveloperFactory), возвращающие JavaDeveloper и CppDeveloper
