package S104_N1exercise3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Array_ExceptionTest {

    @Test
    public void testThrowException() {
        Array_Exception arrayException = new Array_Exception();
        int invalidIndex = 6;

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> arrayException.throwException(invalidIndex));
    }
}