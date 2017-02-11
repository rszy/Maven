package pl.javastart;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by Rysiek on 2017-02-11.
 */
public class BubbleSortTest {

    private BubbleSort bubbleSort;

    @Before
    public void init() {
        bubbleSort = new BubbleSort();
    }

    @Test
    public void intsArrayLength1() {
        // given
        int[] ints = {2};

        //when
        int[] result = bubbleSort.sort(ints);

        //then
        assertThat(result.length, is(1));
        assertThat(result[0], is(2));
    }

    @Test
    public void intsArraySevenNumbers() {
        // given
        int[] ints = {2,1,5,4,3,0,-1};

        //when
        int[] result = bubbleSort.sort(ints);

        //then
        assertThat(result.length, is(7));
        assertThat(result[0], is(-1));
        assertThat(result[1], is(0));
        assertThat(result[2], is(1));
        assertThat(result[3], is(2));
        assertThat(result[4], is(3));
        assertThat(result[5], is(4));
        assertThat(result[6], is(5));
    }
}
