import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ServantWageTest {
    private ServantWage wage;

    @Before
    public void setUp() throws Exception {
        wage = new ServantWage();
        Servant qw = new Servant("Qin Wen",
                month -> {
                    return month % 2 == 0 ? 800 : 900;
                },
                month -> {
                    return 500;
                });
        Master jz = new Master("Jia Zhen", (x, y) -> {
            return x * 4 + y * 2;
        });

        wage.addServant(qw);
        wage.addMaster(jz);
    }

    @Test
    public void should_4200_when_qinwen_server_jiazheng_in_oct() throws Exception {
        // given

        // when
        int money = wage.select("Qin Wen").match("Jia Zhen").calcWage(10);
        // then
        assertThat(money, is(4200));
    }
}
