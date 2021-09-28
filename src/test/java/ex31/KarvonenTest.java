package ex31;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class KarvonenTest {

    @Test
    public void getRate()
    {
        int[] results = {138, 145, 151, 158, 165, 171, 178, 185, 191};
        int index = 0;
        for (int i = 55; i < 100; i = i + 5)
        {
            double rate = Karvonen.getRate(22, i, 65);
            assertEquals(results[index], rate);
            index++;
        }
    }
}
