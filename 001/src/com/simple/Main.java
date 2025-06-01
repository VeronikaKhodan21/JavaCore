package com.simple;

import com.regular.Decorator;
import com.regular.OtherClass;

public class Main {
    /**
    * Точка входа в программу. С неё всегда всё начинается.
    *
    * @param args стандартные аргументы командной строки
    * */
    public static void main(String[] args) {
        
        int result = OtherClass.add(3, 3);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.sub(3, 3);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.mul(3, 3);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.div(3, 3);
        System.out.println(Decorator.decorate(result));
    }
}
