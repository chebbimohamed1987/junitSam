package exception;

import org.junit.Test;

public class NoFormatNameExceptionTest {
    @Test(expected = NoFormatNameException.class)
    public void noFormatName() throws Exception {
        throw new NoFormatNameException("Test");
    }
}