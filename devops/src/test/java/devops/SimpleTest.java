package devops;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SimpleTest {
    @Test
    void testGet() {
    	int a=5;
    	int b=88;
        assertEquals(7, UserService.AddTwoNumbers(a, b));
    }

}
