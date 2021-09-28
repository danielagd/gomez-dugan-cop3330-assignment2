package ex26;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PaymentCalculatorTest {

    @Test
    public void calculateMonthsUntilPaidOff()
    {
        assertEquals(70, PaymentCalculator.calculateMonthsUntilPaidOff(5000.0, (12/100.0), 100.0 ));
    }

}
