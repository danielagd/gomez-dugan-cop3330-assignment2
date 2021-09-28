package ex38;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FilteringValuesTest {

    @Test
    public void filterEvenNumbers(){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] even_arr = {2, 4, 6, 8};

        for (int i = 0; i < even_arr.length; i++)
            assertEquals(even_arr[i], FilteringValues.filterEvenNumbers(arr)[i]);
    }
}
