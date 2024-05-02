import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CheckIsAdultTest {

    private final int age;
    private final boolean result;

    public CheckIsAdultTest(int age, boolean result) {
        this.age = age;
        this.result = result;
    }

    @Parameterized.Parameters
 public static Object[] getTestData() {
    return new Object[] {
        new Object[] {17, false}, // 
        new Object[] {18, true},  //  (  )
        new Object[] {20, true},  //  (  )
        new Object[] {21, true}   //  (  )
    };
}

    @Test
    public void checkIsAdultWhenAgeThenResult() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(age);
        assertEquals("  " + age + "  " + result, result, isAdult);
    }
}
