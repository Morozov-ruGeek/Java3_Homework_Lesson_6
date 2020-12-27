import org.junit.Assert;
import org.junit.Test;

public class TestArray {

    @Test
    public void firstTestArrayAfter4(){
        int[] in = new int[] {2, 6, 7, 4, 8, 9, 2};
        int[] out = new int[] {8, 9, 2};
        Assert.assertArrayEquals(out, MainClass.arrayAfterFour(in));
    }

    @Test(expected = RuntimeException.class)
    public void secondTestArrayAfter4(){
        int[] in = new int[] {2, 5 ,9, 7, 6};
        MainClass.arrayAfterFour(in);
    }

    @Test
    public void firstTestArrayOnOneAndFour(){
        int[] in = new int[]{1, 2, 5, 6};
        Assert.assertFalse(MainClass.checkArrayOnOneAndFour(in));
    }

    @Test
    public void secondTestArrayOnOneAndFour(){
        int[] in = new int[] {1, 4, 4};
        Assert.assertTrue(MainClass.checkArrayOnOneAndFour(in));
    }
}
