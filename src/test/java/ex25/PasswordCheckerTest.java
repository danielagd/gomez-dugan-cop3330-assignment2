package ex25;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordCheckerTest {

    @Test
    public void passwordValidator() {
        assertEquals(1, PasswordChecker.passwordValidator("12345"));
        assertEquals(2, PasswordChecker.passwordValidator("abcdef"));
        assertEquals(7, PasswordChecker.passwordValidator("abc123xyz"));
        assertEquals(10, PasswordChecker.passwordValidator("1337h@xor!"));
    }
}
