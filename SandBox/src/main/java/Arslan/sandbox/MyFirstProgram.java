package Arslan.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.a=5;
        r.b=6;
        System.out.println("Площадь прямоугольника со сторонами "+r.a+" и "+r.b+" равна "+ area(r));
    }

    public static double area(Rectangle r){
        return r.a*r.b;
    }

}