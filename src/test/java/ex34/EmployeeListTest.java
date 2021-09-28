package ex34;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeListTest {

    @Test
    public void removeEmployee() {
        List<String> list = new ArrayList<String>();
        list.add("John Smith");
        list.add("Jackie Johnson");
        list.add("Chris Jones");
        list.add("Amanda Cullen");
        list.add("Jeremy Goodwin");

        assertEquals(false, EmployeeList.removeEmployee(list, "John Smith").contains("John Smith"));
        assertEquals(false, EmployeeList.removeEmployee(list, "Jackie Johnson").contains("Jackie Johnson"));
        assertEquals(false, EmployeeList.removeEmployee(list, "Chris Jones").contains("Chris Jones"));
        assertEquals(false, EmployeeList.removeEmployee(list, "Amanda Cullen").contains("Amanda Cullen"));
        assertEquals(false, EmployeeList.removeEmployee(list, "Jeremy Goodwin").contains("Jeremy Goodwin"));

    }
}
