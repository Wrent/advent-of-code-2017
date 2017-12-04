package com.akucera.codeadvent.advent04;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class PassPhraseCheckerTest {

    private PassPhraseChecker passPhraseChecker;

    @Before
    public void setUp() throws Exception {
        passPhraseChecker = new PassPhraseChecker();
    }

    @Test
    public void testProvidedValues() throws Exception {
        assertThat(passPhraseChecker.checkNumberOfValidPassPhrases("aa bb cc dd ee\naa bb cc dd aa\naa bb cc dd aaa"), is(2));
    }

    @Test
    public void testProvidedAnagrams() throws Exception {
        assertThat(passPhraseChecker.checkNumberOfNonAnagrams("abcde fghij\nabcde xyz ecdab\na ab abc abd abf abj\niiii oiii ooii oooi oooo\noiii ioii iioi iiio"), is(3));
    }
}
