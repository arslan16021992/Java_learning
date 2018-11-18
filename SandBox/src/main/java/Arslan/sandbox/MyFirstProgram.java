package Arslan.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        Rectangle r=new Rectangle(5,6 );
        System.out.println("Площадь прямоугольника со сторонами "+r.a+" и "+r.b+" равна "+ r.area());

        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной "+s.l+" равна "+ s.area());

    }

}