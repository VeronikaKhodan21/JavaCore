

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import moon.*;

public class Main {
    public static void main(String[] args) {
        Worker vika = new Worker("Патина", "Вика", "Матросовна", LocalDate.of(1988, 12, 15), "Повар", 900);
        Worker danil = new Worker("Круть", "Даниил", "Петрович", LocalDate.of(2005, 9, 22), "Официант", 110);
        Worker vladim = new Worker("Пупкин", "Владимир", "Сергеевич", LocalDate.of(1987, 8, 23), "Бармен", 320);
        Worker maksim = new Worker("Кошкин", "максим", "Никтошный", LocalDate.of(1992, 4, 8), "Повар холодного цеха", 980);
        Worker roman = new Worker("Воробьев", "Роман", "Максимович", LocalDate.of(1999, 3, 8), "Дизайнер", 450);
        

// Задача 1. Сравнение с использованием компаратора
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.parse("2019-05-15");
        System.out.println("Числа: "+ date2.format(DateTimeFormatter.ISO_LOCAL_DATE)+", "+date1.format(DateTimeFormatter.ISO_LOCAL_DATE));
        List<LocalDate> a = vika.dateComparator(date1, date2);
        System.out.println("Отформатированы. Число "+ a.get(1).format(DateTimeFormatter.ISO_LOCAL_DATE)+" больше числа "+ a.get(0).format(DateTimeFormatter.ISO_LOCAL_DATE));

// Задача 2. Пример использования в основной программе
 
        Manager stepin = new Manager("Пушной", "Сергей", "Попович", LocalDate.of(1999, 3, 9), "Главарь", 100000);

        // Все сотрудники 
        Worker[] employees = {vika, danil, vladim, roman, maksim, stepin};

        System.out.println("==============");
        System.out.println("\nВсе сотрудники до повышения зарптаты: \n");
        for (Worker employee : employees) {
            System.out.println(employee.getString());
            System.out.println("-----------------");
        }
        System.out.println("=======================");


       
        Manager.upgradeGroup(employees, 1000);

        System.out.println("\nВсе сотрудники после повышения зарплаты: \n");
        for (Worker employee : employees) {
            System.out.println(employee.getString());
            System.out.println("-----------------");
        }}
}


