package com.entertainment;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TelevisionTest {
    private Television tv;
    private Television tv1;
    private Television tv2;

    @Before
    public void setUp() {
        tv = new Television();
        tv1 = new Television("LG", 30, DisplayType.LED);
        tv2 = new Television("LG", 30, DisplayType.LED);
    }

    @Test
    public void setVolume_shouldStoreVolume_validInput_lowerBound() {
        try{
            tv.setVolume(101);
        }
        catch(IllegalArgumentException e){
            assertEquals("Invalid volume: 101, Allowed range: [0,100]", e.getMessage());
        }
    }

    @Test
    public void setVolume_shouldThrowIllegalArgumentException_invalidInput_upperBound() {
        tv.setVolume(-1);
    }

    @Test
    public void setVolume_validInput_lowerBound() {
        tv.setVolume(0);
        assertEquals(0, tv.getVolume());
    }

    @Test
    public void setVolume_shouldStoreVolume_validInput_upperBound() {
        tv.setVolume(100);
        assertEquals(100, tv.getVolume());
    }
}