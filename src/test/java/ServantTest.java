import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ServantTest {
    @Test
    public void should_qinwen_get_800_when_even_month() throws Exception {
        // given
        final Servant qinwen = new Servant("Qin Wen",
                month -> {
                    return month % 2 == 0 ? 900 : 800;
                },
                month -> {
                    return 500;
                });
        // when
        int salary = qinwen.getSalary(7);
        // then
        assertThat(salary, is(800));
    }
}
