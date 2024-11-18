import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.example.lab10.MockedDocument;
import com.example.lab10.TimedDocument;

public class TimedDocumentTest {
    @Test
    public void testTimedDocument() {
        MockedDocument mockedDocument = new MockedDocument();
        TimedDocument document = new TimedDocument(mockedDocument);
        Assertions.assertEquals(document.parse(""), "Parse");
    }

    @Test
    public void testTimeCapture() {
        MockedDocument mockedDocument = new MockedDocument();
        TimedDocument document = new TimedDocument(mockedDocument);
        long startTime = System.nanoTime();
        document.parse("Path");
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        double durationInMilliseconds = duration / 1_000_000.0;
        Assertions.assertTrue(durationInMilliseconds > 1000);
    }
}