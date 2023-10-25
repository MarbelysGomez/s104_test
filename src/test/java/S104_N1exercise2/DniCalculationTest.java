package S104_N1exercise2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

public class DniCalculationTest {
    private static Stream<Arguments> enterDni() {
        return Stream.of(
                Arguments.of(12345678, 'Z'),
                Arguments.of(23456781, 'R'),
                Arguments.of(34567812, 'P'),
                Arguments.of(45678123, 'P'),
                Arguments.of(56781234, 'F'),
                Arguments.of(67812345, 'L'),
                Arguments.of(78123456, 'T'),
                Arguments.of(81234567, 'Q'),
                Arguments.of(90123456, 'A'),
                Arguments.of(10234567, 'G')
        );
    }

    @ParameterizedTest
    @MethodSource("enterDni")
    public void testCalculateLetter(int dni, char expectedLetter) {
        char actualLetter = DniCalculation.calculateLetter(dni);
        assertEquals(expectedLetter, actualLetter);
    }
}