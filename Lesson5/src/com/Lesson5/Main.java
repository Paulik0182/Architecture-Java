package com.Lesson5;
/*
Реализовать как минимум один Поведенческий паттерн в своем домашнем приложении.

 Поведенческий паттерн - Visitor  (Посетитель) - используется для упрощения операций над группировками связанных объектов.

 */

public class Main {

    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.doJob(new ConcreteVisitor());
        Animal cat = new Cat();
        cat.doJob(new ConcreteVisitor());
    }
}

interface Animal {
    void doJob(Visitor visitor);
}

class Dog implements Animal {

    public void doJob(Visitor visitor) {
        visitor.doDog();
    }
}

class Cat implements Animal {
    public void doJob(Visitor visitor) {
        visitor.doCat();
    }
}

interface Visitor {
    void doDog();

    void doCat();
}

class ConcreteVisitor implements Visitor {
    public void doDog() {
        System.out.println("Собака - гафкает");
    }

    public void doCat() {
        System.out.println("Кот - мяукает");
    }
}
