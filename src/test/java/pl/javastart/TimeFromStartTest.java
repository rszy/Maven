package pl.javastart;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Rysiek on 2017-02-07.
 */
public class TimeFromStartTest {


    @Test
    public void shouldDisplaySeconds() {
        // given
        long ms = 15006;
        TimeFromStart timeFromStart = new TimeFromStart();

        // when
        String result = timeFromStart.timeFormat(ms);

        // then
        assertThat(result, CoreMatchers.is("15 sekund"));
    }

    @Test
    public void shouldDisplayMinutes() {
        // given
        long ms = 70000;
        TimeFromStart timeFromStart = new TimeFromStart();

        // when
        String result = timeFromStart.timeFormat(ms);

        // then
        assertThat(result, CoreMatchers.is("1 minuta 10 sekund"));
    }

    @Test
    public void shouldDisplayDays() {
        // given
        long ms = 86400000;
        TimeFromStart timeFromStart = new TimeFromStart();

        // when
        String result = timeFromStart.timeFormat(ms);

        // then
        assertThat(result, CoreMatchers.is("1 dzień 0 godzin 0 minut 0 sekund"));
    }

    @Test
    public void shouldDisplayYears() {
        // given
        long ms = 31536001000L;
        TimeFromStart timeFromStart = new TimeFromStart();

        // when
        String result = timeFromStart.timeFormat(ms);

        // then
        assertThat(result, CoreMatchers.is("1 rok 0 dni 0 godzin 0 minut 1 sekunda"));
    }

}