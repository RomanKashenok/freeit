package com.freeit.lesson9;

public class BoxingUnboxing {
    public static void main(String[] args) {

        Integer a = 100;
        Integer b = 100;
        Integer c = 150;
        Integer d = 150;
        Integer e = -0;
        Integer f = 0;
                                        // Ilya     //Marina
        System.out.println(a == b);     // true     true
        System.out.println(c == d);     // true     true
        System.out.println(e == f);     // false    true

        System.out.println(a.equals(b)); // true     true
        System.out.println(c.equals(d)); // true     true
        System.out.println(e.equals(f)); // false    true



//        int a = 1;
//        Integer b = 1;
//
//// not atomic operations
//        System.out.println(a == b);
//        Integer res = b + a;
//        b++;
//        a++;

//        SalaryCalculator GALINA = new SalaryCalculator();
//
//        int vasinRazrad = 4;
//
//        double vasinaSlary = GALINA.calculateSalary(vasinRazrad, true);
//        System.out.println(vasinaSlary);
    }
}

class SalaryCalculator {
    int baseSalary = 1000;
    Double koef; //null

    public SalaryCalculator() {
    }

    public SalaryCalculator(double koef) {
        this.koef = koef;
    }

    public double calculateSalary(int razrad, boolean isPromoted) {
        return (baseSalary * koef * (razrad > 1 ? 3 : razrad < 5 ? 6 : 1)) * (isPromoted ? 1.3 : 1);
    }
}