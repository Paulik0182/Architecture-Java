package com.Lesson6;

/*
1. Для всех объектов, которые непосредственно хранятся в БД, реализовать шаблон Data Mapper.

2. Проконтролировать получение объектов из БД, используя шаблон Identity Map.

P/S Я понял, что шаблон Data Mapper используют для того, чтобы обращения в БД происходили не напрямую,
    а, например, через интерфейс, который будет вытягивать информацию во временную память для последующей работы с ней.
    Но, честно говоря, у меня возникают большие трудности с написанием кода. Считаю, что GeekBrains слишком рано дал
    данный курс, я всего лишь прослушал 14 уроков на яве, при этом мой уровень на начало обучения нулевой, а данные задания, я так понимаю,
    рассчитаны уже для тех, кто реализует свои маленькие проекты.
    Оправдываться не хочу, но изучая материал в разных источниках, разобраться в чужом коде для меня сложно. Все найденные мной примеры Data Mapper на гидхабе и других источниках очень массивные,
    сотни строк кода, а бездумно переписывать чужое не очень хочется. Поэтому, ничего лучшего я не нашёл, как написать так, как понял, очень кратко.
   Второе задание не делал, подразумеваю, что нужно писать проверку с исключениями, например, если обращаемся к файлу, а,если его нет, то бросаем исключение.
 */
public class Main {
    static DataMapper dataMapper = new Files();
    static DataMapper dataMapper1 = new Bd();

    public static void main(String[] args) {

        System.out.println(dataMapper.getDataMapper());
        System.out.println(dataMapper1.getDataMapper());
    }
}

interface DataMapper {
    String getDataMapper();
}

class Bd implements DataMapper {
    String getFromBd() {
        return "User from BD";
    }

    @Override
    public String getDataMapper() {
        return getFromBd();
    }
}

class Files implements DataMapper {
    String getFilesFromBd() {
        return "File from BD";
    }

    @Override
    public String getDataMapper() {
        return getFilesFromBd();
    }
}
