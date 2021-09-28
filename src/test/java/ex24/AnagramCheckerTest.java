package ex24;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnagramCheckerTest {

    @Test
    public void checkAnagram() {
        assertEquals(true, AnagramChecker.checkAnagram("note", "tone"));
        assertEquals(false, AnagramChecker.checkAnagram("yellows", "yellow"));
        assertEquals(false, AnagramChecker.checkAnagram("tomorrow", "hello"));
    }

}