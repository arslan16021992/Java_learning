package Arslan.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello("world");
        Square s=new Square(5);
        System.out.println("Площадь квадрата со стороной "+ s.l + " равна "+ area(s));

        Rectangle r=new Rectangle(5,6);
        System.out.println("Площадь прямоугольника со сторонами "+r.a+" и "+r.b+" равна "+ area(r));
    }


    public static void hello(String l){
        System.out.println("Hello "+l);
    }

    public static double area(Square s){
       return s.l*s.l;
    }

    public static double area(Rectangle r){
        return r.a*r.b;
    }
}