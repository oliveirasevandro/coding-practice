package com.evandro.oliveira.strings;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class AnagramsTest {

    @Parameterized.Parameter
    public String str1;

    @Parameterized.Parameter(1)
    public String str2;

    @Parameterized.Parameter(2)
    public boolean expected;

    @Parameterized.Parameters(name = "{index}: when checking if \"{0}\" and \"{1}\" are anagrams, it should return {2}")
    public static Collection<Object[]> data() {

        return Arrays.asList(new Object[][]{
                {"olar", "alor", true},
                {"abcd", "dcba", true},
                {"xurupita", "puruxita", true},
                {"pato", "sapo", false}
        });
    }

    @Test
    public void anagramas() {

        assertThat(new Anagrams().areAnagrams(str1, str2), is(expected));
    }


}