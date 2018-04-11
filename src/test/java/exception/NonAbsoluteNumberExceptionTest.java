package exception;

import org.junit.Test;

public class NonAbsoluteNumberExceptionTest {
    @Test(expected = NonAbsoluteNumberException.class)
    public void nonAbsoluteNumber() throws Exception {
        throw new NonAbsoluteNumberException("test");
    }
}