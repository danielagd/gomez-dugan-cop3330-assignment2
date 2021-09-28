package ex27;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class ValidatingInputsTest {

    @Test
    public void validateInput(){
        String wrong = "The first name must be at least 2 characters long.\n";
        wrong += "The last name must be at least 2 characters long.\n";
        wrong += "The last name must be filled in.\n";
        wrong += "The employee ID must be in format of AA-1234.\n";
        wrong += "The zipcode must be a 5 digit number.\n";
        assertEquals(wrong, ValidatingInputs.validateInput("J", "", "ABCDE", "A12-1234"));

        String right = "There were no errors found.";
        assertEquals(right, ValidatingInputs.validateInput("John", "Johnson", "55555", "TK-4321"));
    }

}
