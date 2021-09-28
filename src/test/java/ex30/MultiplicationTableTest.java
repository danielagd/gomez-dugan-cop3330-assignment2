package ex30;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MultiplicationTableTest {

    @Test
    public void makeTable()
    {
        int[][] arr = new int[12][12];

        for (int i = 1; i < 13; i++) {
            for (int j = 1; j < 13; j++) {
                arr[i-1][j-1] = i * j;
            }
        }

        int[][] test_arr = MultiplicationTable.makeTable();

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                assertEquals(arr[i][j], test_arr[i][j]);
            }
        }
    }
}
