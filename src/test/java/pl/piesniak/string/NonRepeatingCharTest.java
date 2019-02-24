package pl.piesniak.string;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NonRepeatingCharTest {

    @Test
    void test1(){
        // given
        String s = "abcab";
        Character expected = 'c';

        // when
        Character result = NonRepeatingChar.nonRepeating(s);

        //then
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    void nullTest(){
        // given
        String s = "abab";
        Character expected = null;

        // when
        Character result = NonRepeatingChar.nonRepeating(s);

        //then
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    void test3(){
        // given
        String s = "aabbbc";
        Character expected = 'c';

        // when
        Character result = NonRepeatingChar.nonRepeating(s);

        //then
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    void test4(){
        // given
        String s = "aabbdbc";
        Character expected = 'd';

        // when
        Character result = NonRepeatingChar.nonRepeating(s);

        //then
        Assertions.assertThat(result).isEqualTo(expected);
    }
}