import org.junit.Test;
import com.example.lab10.MockedDocument;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

public class MockedDocumentTest {

    @Test
    public void testParseExecutionTime() {
        MockedDocument mockedDocument = new MockedDocument();
        assertTimeoutPreemptively(Duration.ofSeconds(2), () -> {
            String result = mockedDocument.parse("dummy/path");
            assertEquals("Parse", result);
        });
    }
    @Test
    public void testParseReturnsCorrectResult() {
        MockedDocument mockedDocument = new MockedDocument();
        String result = mockedDocument.parse("dummy/path");
        assertEquals("Parse", result);
    }
}