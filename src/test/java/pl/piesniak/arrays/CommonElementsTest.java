package pl.piesniak.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CommonElementsTest {

    @Test
    void test1() {
        // given
        int[] array1 = {1, 3, 4, 6, 7, 9};
        int[] array2 = {1, 2, 4, 5, 9, 10};
        Integer[] expected = {1, 4, 9};

        // when
        Integer[] result = CommonElements.commonElements(array1, array2);

        // then
        assertThat(result).containsExactly(expected);
    }

    @Test
    void test2() {
        // given
        int[] array1 = {1, 2, 9, 10, 11, 12};
        int[] array2 = {0, 1, 2, 3, 4, 5, 8, 9, 10, 12, 14, 15};
        Integer[] expected = {1, 2, 9, 10, 12};

        // when
        Integer[] result = CommonElements.commonElements(array1, array2);

        // then
        assertThat(result).containsExactly(expected);
    }

    @Test
    void test3() {
        // given
        int[] array1 = {0, 1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10, 11};
        Integer[] expected = {};

        // when
        Integer[] result = CommonElements.commonElements(array1, array2);

        // then
        assertThat(result).containsExactly(expected);
    }
}