package entities;

import java.sql.SQLOutput;

public class Triangle {
    private double a, b, c;
    private double p;
    private double area;

   public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
        double p = (a + b + c)/2;
        this.p = p;
        this.area =  Math.sqrt(  p*(p-a)*(p-b)*(p-c) );
    }

    public void print(){
        System.out.printf("Lado A : %.3fuc%n", this.a);
        System.out.printf("Lado B : %.3fuc%n", this.b);
        System.out.printf("Lado C : %.3fuc%n", this.c);
        System.out.printf("Área : %.3fua", this.area);
    }
}
