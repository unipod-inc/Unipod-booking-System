import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testArray {
    @Test
    public void test_array_with_positive_numbers(){
        int[] sum = {2,4,6};
        assertEquals(12, minimum.sumArray(sum));
    }

    @Test
    public void test_array_with_negative_numbers(){
        int[] sum = {-2,-4,-6};
        assertEquals(-12, minimum.sumArray(sum));

    }
    @Test
    public void An_empty_array(){
        int[] sum = { };
        assertEquals(12, minimum.sumArray(sum));

    }
    @Test
    public void An_array_with_zeros(){
        int[] sum = {0,0,0};
        assertEquals(0, minimum.sumArray(sum));

    }
    @Test
    public void An_array_with_the_same_number(){
        int[] sum = {2,2,2};
        assertEquals(6, minimum.sumArray(sum));

    }
    @Test
    public void An_array_with_large_numbers(){
        int[] sum = {200,400,600};
        assertEquals(1200, minimum.sumArray(sum));

    }
}
