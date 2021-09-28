package ex37;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
public class PasswordGeneratorTest {

    @Test
    public void checkLength()
    {
        assertTrue(PasswordGenerator.makePassword( 8, 2, 2).length() >= 8);
    }

}
