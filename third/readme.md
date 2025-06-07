# Homwork №3
*Задания:*
1. Написать прототип компаратора - метод внутри класса сотрудника, сравнивающий две даты, представленные в виде трёх чисел гггг-мм-дд, без использования условного оператора.
2. Опишите класс руководителя, наследник от сотрудника. Перенесите статический метод повышения зарплаты в класс руководителя, модифицируйте метод таким образом, чтобы он мог поднять заработную плату всем, кроме руководителей. В основной программе создайте руководителя и поместите его в общий массив сотрудников. Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата руководителя не повысилась.

## Решение:
1. Этод метод реализован в классе [Worker](https://github.com/VeronikaKhodan21/JavaCore/blob/main/third/scr/moon/Worker.java#L80)
```
public static List<LocalDate>  dateComparator(LocalDate a, LocalDate b) {
        List<LocalDate> list = new ArrayList<LocalDate>( 2 );
        list.add(b);
        list.add(a);
        java.util.Collections.sort( list );
        // числа отсортированы в порядке возрастания
        return list;
    }
````

2. Специально для этого реализован класс Mamager. В классе есть [метод](https://github.com/VeronikaKhodan21/JavaCore/blob/main/third/scr/moon/Manager.java#L13)
```
public static void upgradeGroup(Worker[] employees, int salarySupplement) {
        for (Worker employee : employees) {
            if (!(employee instanceof Manager)) {
                int currentSalary = employee.getSalary(); //прошлая зарплата
                int newSalary = currentSalary+salarySupplement; //новая зарпалата
                employee.setSalary(newSalary); // добавили зарплату
            }
        }
    }
```
