package github.hxfirefox.servant;

import github.hxfirefox.servant.Servant;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ServantTest {
    Servant qinwen;

    @Before
    public void setUp() throws Exception {
        qinwen = new Servant("Qin Wen",
                month -> {
                    return month % 2 == 0 ? 800 : 900;
                },
                month -> {
                    return 500;
                });
    }

    @Test
    public void should_qinwen_get_800_salary_and_500_bonus_when_odd_month() throws Exception {
        // given

        // when
        int salary = qinwen.getSalary(6);
        int bonus = qinwen.getBonus(6);
        // then
        assertThat(salary, is(800));
        assertThat(bonus, is(500));
    }

    @Test
    public void should_qinwen_get_900_salary_and_500_bonus_when_even_month() throws Exception {
        // given

        // when
        int salary = qinwen.getSalary(7);
        int bonus = qinwen.getBonus(7);
        // then
        assertThat(salary, is(900));
        assertThat(bonus, is(500));
    }
}
