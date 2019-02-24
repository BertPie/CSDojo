package pl.piesniak.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class RotationArrayTest {

    int[] array1 = {1, 2, 3, 4, 5, 6, 7};

    @Test
    void false1(){
        // given
        int[] array2 = {4, 5, 6, 7, 8, 1, 2, 3};
        boolean expected = false;

        // when
        Boolean result = RotationArray.isRotation(array1, array2);

        // then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void true1(){
        // given
        int[] array2 = {4, 5, 6, 7, 1, 2, 3};
        boolean expected = true;

        // when
        Boolean result = RotationArray.isRotation(array1, array2);

        // then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void false2(){
        // given
        int[] array2 = {4, 5, 6, 9, 1, 2, 3};
        boolean expected = false;

        // when
        Boolean result = RotationArray.isRotation(array1, array2);

        // then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void false3(){
        // given
        int[] array2 = {4, 6, 5, 7, 1, 2, 3};
        boolean expected = false;

        // when
        Boolean result = RotationArray.isRotation(array1, array2);

        // then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void false4(){
        // given
        int[] array2 = {4, 5, 6, 7, 0, 2, 3};
        boolean expected = false;

        // when
        Boolean result = RotationArray.isRotation(array1, array2);

        // then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void true2(){
        // given
        int[] array2 = {1, 2, 3, 4, 5, 6, 7};
        boolean expected = true;

        // when
        Boolean result = RotationArray.isRotation(array1, array2);

        // then
        assertThat(result).isEqualTo(expected);
    }
}