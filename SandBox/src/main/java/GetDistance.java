public class GetDistance {
    public static void main (String args[]){
        Point p1=new Point();
        p1.x=6;
        p1.y=8;

        Point p2=new Point();
        p2.x=6;
        p2.y=7;

        System.out.println("Расстояние между точками A("+p1.x+"; "+p1.y+") и B("+p2.x+"; "+p2.y+") равно "+ distance(p1, p2));
    }
    public static double distance(Point p1, Point p2){
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }
}


