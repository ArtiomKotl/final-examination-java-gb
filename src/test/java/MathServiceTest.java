import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MathServiceTest {

    @Test
    void testPositiveAnswer() throws NotFoundAnswerException {
        MathService mathService = new MathService();
        assertEquals("Answer{first=2.0, second=-16.0}",mathService.getAnswer(-1,7,8).toString());
    }
    @Test
    void testDiscriminantPositive() {
        MathService mathService = new MathService();
        assertEquals(81,mathService.getD(-1,7,8));
    }
    @Test
    void testDiscriminantZero()  {
        MathService mathService = new MathService();
        assertEquals(0,mathService.getD(1,0,0));
    }
    @Test
    void testDiscriminantNegative(){
        MathService mathService = new MathService();
        assertEquals(-24, mathService.getD(1,0,6));
    }

    @ParameterizedTest
    @CsvSource({
            "9, -6, 2",
            "1, 4, 29",
            "1, -1, 56"
    })
    void testParameterizedNegative(int a,int b, int c)  {
        MathService mathService = new MathService();
        assertThrows(NotFoundAnswerException.class, () -> {
            mathService.getAnswer(a,b,c);
        }, "Корни не могут быть найдены");
    }
}