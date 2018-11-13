public class GetDistance {
    public static void main (String args[]){
        Point p1=new Point(6,8);
        //p1.x=6;
       //p1.y=8;

        Point p2=new Point(1,3);
        //p2.x=6;
        //p2.y=7;

        System.out.println("Расстояние между точками A("+p1.x+"; "+p1.y+") и B("+p2.x+"; "+p2.y+") равно "+ p1.distance(p2));
    }

}


