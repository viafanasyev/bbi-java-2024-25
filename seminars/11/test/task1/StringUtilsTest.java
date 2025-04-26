package task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilsTest {
    @Test
    public void testReverse_emptyString() {
        assertEquals("", StringUtils.reverse(""));
    }

    @Test
    public void testReverse_nonEmptyString() {
        assertEquals("абырвалг", StringUtils.reverse("главрыба"));
    }

    @Test
    public void testChangeCase_emptyString() {
        assertEquals("", StringUtils.changeCase(""));
    }

    @Test
    public void testChangeCase_nonEmptyString() {
        assertEquals("hELLO, wORLD! пРИВЕТмИР.", StringUtils.changeCase("Hello, World! ПриветМир."));
    }
}