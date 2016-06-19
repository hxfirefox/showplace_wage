import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MasterTest {
    private Master baoyu;

    @Before
    public void setUp() throws Exception {
        baoyu = new Master((x, y) -> {
            return 8 * (x + y);
        });

    }

    @Test
    public void should_baoyu_pay_servant() throws Exception {
        // given

        // when
        int wage = baoyu.pay(1, 1);
        // then
        assertThat(wage, is(16));
    }
}
