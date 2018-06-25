import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CombinationsTest {

    @Test
    public void returns1111WhenGiven1111() {
        assertEquals(1111, combinations.returnCombinations(1111));
    }
}