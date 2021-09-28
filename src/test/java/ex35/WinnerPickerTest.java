package ex35;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class WinnerPickerTest {

    @Test
    public void pickWinner()
    {
        List<String> list = Arrays.asList("Homer", "Bart", "Lisa", "Maggie", "Moe");
        String winner = WinnerPicker.pickWinner(list);
        assertEquals(true, list.contains(winner));
    }
}
