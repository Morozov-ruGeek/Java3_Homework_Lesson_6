import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MassTestArray {
    private int[] in;
    private int[] out;

    @Parameterized.Parameters
    public static Collection <Object[]> data(){
        return Arrays.asList(new Object[][]{
                {new int[]{3, 6, 7, 4, 9}, new int[]{9}},
                {new int[]{2, 5, 9, 4}, new int[]{}},
                {new int[]{2, 9, 10, 4, 6, 3, 1}, new int[]{6, 3, 1}},
                {new int[]{7, 5, 4}, new int[]{}}
        });
    }
    public MassTestArray(int[] in, int[] out){
        this.in = in;
        this.out = out;
    }

    @Test
    public void MassTestArrayAfterFour(){
        Assert.assertArrayEquals(out, MainClass.arrayAfterFour(in));
    }
}
