import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {
    @Test
    public void PositiveTest(){
        Point p1= new Point(6,8);
        Point p2= new Point(1,3);
        Assert.assertEquals(p1.distance(p2), 7.0710678118654755);

    }
    @Test
    public void NegativeTest(){
        Point p1= new Point(5,6);
        Point p2= new Point(7,8);
        Assert.assertEquals(p1.distance(p2), 2) ;

    }

    @Test
    public void DifferentDataType(){
        Point p1= new Point(3.14F,9223372036854775807L);
        Point p2= new Point(7,-2147483648);
        Assert.assertEquals(p1.distance(p2), 0x1.00000001p63) ;

    }
}


