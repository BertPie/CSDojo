package pl.piesniak.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MostFrequentItemTest {

    @Test
    void test1(){
        // given
        int[] givenArray = {1, 3, 1, 3, 2, 1};
        int expected = 1;

        // when
        Integer result = MostFrequentItem.mostFreqent(givenArray);

        // then
        Assertions.assertThat(result).isEqualTo(expected);
    }
    @Test
    void test2(){
        // given
        int[] givenArray = {3, 3, 1, 3, 2, 1};
        int expected = 3;

        // when
        Integer result = MostFrequentItem.mostFreqent(givenArray);

        // then
        Assertions.assertThat(result).isEqualTo(expected);
    }
    @Test
    void test3(){
        // given
        int[] givenArray = {};

        // when
        Integer result = MostFrequentItem.mostFreqent(givenArray);

        // then
        Assertions.assertThat(result).isNull();
    }

    @Test
    void test4(){
        // given
        int[] givenArray = {0};
        int expected = 0;

        // when
        Integer result = MostFrequentItem.mostFreqent(givenArray);

        // then
        Assertions.assertThat(result).isEqualTo(expected);
    }
    @Test
    void test5(){
        // given
        int[] givenArray = {0, -1, 10, 10, -1, 10, -1, -1, -1, 1};
        int expected = -1;

        // when
        Integer result = MostFrequentItem.mostFreqent(givenArray);

        // then
        Assertions.assertThat(result).isEqualTo(expected);
    }
}