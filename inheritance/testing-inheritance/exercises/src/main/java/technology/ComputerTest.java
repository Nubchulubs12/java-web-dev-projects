package technology;







import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ComputerTest {
    @Test
    public void testTurnOn() {
        Computer computer = new Computer("dell", 78, 1999);
        assertEquals("Device is turned on.", computer.turnOn());
    }

}
