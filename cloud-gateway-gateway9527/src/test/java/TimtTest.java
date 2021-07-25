import org.junit.Test;

import java.time.ZonedDateTime;
import java.util.TimeZone;

public class TimtTest {

    @Test
    public void test(){
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);
    }
}
