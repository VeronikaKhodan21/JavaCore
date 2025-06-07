package moon;

import java.time.LocalDate;

public class Manager extends Employees {

    
    public Manager(String surname, String firstName, String lastName, LocalDate birthDate, String position,int salary) {
        super(surname, firstName, lastName, birthDate, position, salary);
    }

    
    public static void upgradeGroup(Employees[] employees, int salarySupplement) {
        for (Employees employee : employees) {
            if (!(employee instanceof Manager)) {
                int currentSalary = employee.getSalary(); //прошлая зарплата
                int newSalary = currentSalary+salarySupplement; //новая зарпалата
                employee.setSalary(newSalary); // добавили зарплату
            }
        }
    }

}