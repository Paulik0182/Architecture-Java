package com.Lesson4;


/*
Урок 4.
Реализовать как минимум один структурный паттерн в своем домашнем приложении.
Паттерн - Фасад (Facade) - беспечивает простой интерфейс для клиента, и клиент использует интерфейс для взаимодействия с системой.
 */
public class Main {

    public static void main(String[] args) {

        System.err.println("Я паттерн - Facade");
        Facade facade = new Facade();
        facade.loadingComputer();

    }
}
