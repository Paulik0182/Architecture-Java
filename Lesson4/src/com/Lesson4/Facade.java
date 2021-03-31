package com.Lesson4;
//Паттерн - Facade
public class Facade {

    PowerComputer power = new PowerComputer();
    OSwindow oSwindow = new OSwindow();
    HDD loadingOS = new HDD();

    void loadingComputer() {
        power.on();
        oSwindow.load(); //ОС (true)
//        oSwindow.unLoad(); //ОС отсутствует (false)
        loadingOS.loadingOS(oSwindow);
        if (oSwindow.hasOS()) {
            System.out.println("Система загружена, можно приступать к работе!");
        } else power.off();
    }
}

class PowerComputer {
    void on() {
        System.out.println("Питание ВКЛючено.");
    }

    void off() {
        System.out.println("Питание ВЫКЛючено!");
    }
}

class OSwindow {
    private boolean OS = false;

    public boolean hasOS() {
        return OS;
    }

    void load() {
        OS = true;
    }

    /**
     * отсутствует ОС (нет загрузки)
     */
    void unLoad() {
        OS = false;
    }
}

class HDD {
    void loadingOS(OSwindow oSwindow) {
        if (oSwindow.hasOS()) {
            System.out.println("Идет загрузка ОС.");
        } else {
            System.out.println("Операционная система отсутствует!");
        }
    }
}
