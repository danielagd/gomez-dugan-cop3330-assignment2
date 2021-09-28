package ex33;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Magic8Test {

    @Test
    public void getPrompt()
    {
        String[] prompt = {"Yes.", "No.", "Ask again later."};
        String result = Magic8.getPrompt(prompt);
        boolean inArray = false;

        for(int i = 0; i < prompt.length; i++)
            if (prompt[i].equals(result))
                inArray = true;

        assertEquals(true, inArray);
    }

}
