package ex36;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class ComputingStatisticsTest {

    @Test
    public void computingStatistics(){
        List<Integer> list = Arrays.asList(100, 200, 1000, 300);
        assertEquals(400.0, ComputingStatistics.average(list));
        assertEquals(100, ComputingStatistics.min(list));
        assertEquals(1000, ComputingStatistics.max(list));
        assertEquals(353.55, ComputingStatistics.std(list));
    }

}
