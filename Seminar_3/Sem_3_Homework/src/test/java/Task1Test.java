import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class Task1Test {
    @Test
    public void evenNumberTest(){
        Task1 t = new Task1();
        Assertions.assertTrue(t.evenOddNumber(4));
    }
    @Test
    public void oddNumberTest(){
        Task1 t = new Task1();
        Assertions.assertFalse(t.evenOddNumber(5));
    }
}
