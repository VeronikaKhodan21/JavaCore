package moon;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Worker {
    private String surname;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String position;
    private int salary;

    public Worker(String surname, String firstName, String lastName, LocalDate birthDate, String position, int salary) {
        this.surname = surname;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.position = position;
        this.salary = salary;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(java.lang.String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthday() {
        return birthDate;
    }

    public void setBirthDate(java.time.LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public  String getString(){
        return surname+" "+firstName+" "+lastName+" "+position+" "+birthDate.format(DateTimeFormatter.ISO_LOCAL_DATE)+" salay: "+Integer.toString(salary)+" руб.";
    }

    // прототип компаратора - метод внутри класса сотрудника, сравнивающий две даты, 
    //представленные в виде трёх чисел гггг-мм-дд, без использования условного оператора.
    
    public static List<LocalDate>  dateComparator(LocalDate a, LocalDate b) {
        List<LocalDate> list = new ArrayList<LocalDate>( 2 );
        list.add(b);
        list.add(a);
        java.util.Collections.sort( list );
        // числа отсортированы в порядке возрастания
        return list;
    }  

}
