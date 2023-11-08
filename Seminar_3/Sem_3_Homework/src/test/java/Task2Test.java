import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task2Test {
    @Test
    public void numberInIntervalTest(){
        Task2 t = new Task2();
        Assertions.assertTrue(t.numberInInterval(56));

    }    @Test
    public void numberNotInIntervalTest(){
        Task2 t = new Task2();
        Assertions.assertFalse(t.numberInInterval(21));

    }
}
