package com.jefff.play;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testStreams() {
        List<Integer> list = IntStream.range(0, 10).boxed().collect(Collectors.toList());
        Assert.assertEquals(10, list.size());
    }
}
