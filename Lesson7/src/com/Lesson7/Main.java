package com.Lesson7;

/*
1. Реализовать паттерн MVC, и/или.
2. Реализовать уровень представления с использованием одного из распространенных MVC фреймворков.
 */
public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.execute();
    }
}

interface ModelLyaerBd {
    Employee getEmployee();
}

interface View {

    void showEmployee(Employee employee);
}

class Controller {
    ModelLyaerBd modelLyaerBd = new BdLyaer();
    View view = new ConsoleView();

    void execute() {

        Employee employee = new Employee("Павел", 25, "+79995476587");
        Employee employee2 = new Employee("Сергей", 30, "+7-888-654-33-14");
        view.showEmployee(employee);
        view.showEmployee(employee2);
    }
}

class Employee {
    private String name;
    private int age;
    private String tel;

    public Employee(String name, int age, String tel) {
        this.name = name;
        this.age = age;
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}

class BdLyaer implements ModelLyaerBd {

    @Override
    public Employee getEmployee() {
        return null; //тут должен быть код который будет обращатся в БД.
    }
}

class ConsoleView implements View {
    @Override
    public void showEmployee(Employee employee) {
        System.out.println("Роботник: " + employee.getName() + ", Возраст: " + employee.getAge() + " лет, Тел.: " + employee.getTel());
    }
}
