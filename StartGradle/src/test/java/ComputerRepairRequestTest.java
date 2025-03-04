import model.ComputerRepairRequest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ComputerRepairRequestTest {
    @Test
    @DisplayName("First Test")
    public void testExample(){
        ComputerRepairRequest crr=new ComputerRepairRequest();
        assertEquals("",crr.getOwnerName());
        assertEquals("",crr.getOwnerAddress());
    }


    @Test
    @DisplayName("Test Example")
    public void testExample2(){
        assertNotEquals(2,3,"Numerele ar trebui sa nu fie egale");
        assertEquals(2, 2, "Numerele ar trebui sa fie egale");
    }
}
