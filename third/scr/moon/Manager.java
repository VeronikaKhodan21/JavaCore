package moon;

import java.time.LocalDate;

public class Manager extends Worker {

    
    public Manager(String surname, String firstName, String lastName, LocalDate birthDate, String position,int salary) {
        super(surname, firstName, lastName, birthDate, position, salary);
    }

    
    public static void upgradeGroup(Worker[] employees, int salarySupplement) {
        for (Worker employee : employees) {
            if (!(employee instanceof Manager)) {
                int currentSalary = employee.getSalary(); //прошлая зарплата
                int newSalary = currentSalary+salarySupplement; //новая зарпалата
                employee.setSalary(newSalary); // добавили зарплату
            }
        }
    }

}