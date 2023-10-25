package S104_N2exercise1;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

public class LengthMatcherTest {

    @Test
    public void testLengthMatcher() {
        String testString = "Mordor";
        LengthMatcher lengthMatcher = new LengthMatcher(Matchers.equalTo(6),
                "a string of length", "was");
        MatcherAssert.assertThat(testString, lengthMatcher);
    }
}