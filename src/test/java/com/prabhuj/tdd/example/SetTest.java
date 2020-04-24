package com.prabhuj.tdd.example;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.*;

public class SetTest {

    private SetInterface set;

    @Before
    public void setUp() {
        set = new Set();
    }

    @Test
    public void testSize() {
        set.add(2);
        set.add(7);
        int result = set.size();
        assertEquals(result, 2);
    }

    @Test
    public void testIsEmpty() {
        set.add(5);
        set.add(8);
        boolean result = set.isEmpty();
        assertFalse(result);
    }

    @Test
    public void testContains() {
        //given
        set.add(2);
        set.add(8);
        //when
        boolean result = set.contains(8);
        //then
        assertEquals(true, result);
    }

    @Test
    public void testAdd_Duplicate_value() {
        //given
        set.add(2);
        set.add(8);
        set.add(8);
        //when
        int result = set.size();
        //then
        assertEquals(2, result);
    }

    @Test
    public void testAdd_Object() {
        set.add("string");
        boolean result = set.contains("string");
        assertEquals(true, result);
    }

    @Test
    public void testAdd_One_Element() {
        set.add(100);
        boolean result = set.contains(100);
        assertEquals(true, result);
    }


    @Test
    public void testRemove() {
        set.add(100);
        set.add(200);
        set.add(500);
        set.remove(200);
        int result = set.size();
        assertEquals(2, result);
    }

    @Test
    public void testGrowArray() {
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("five");
        set.add("six");
        set.add("on");
        set.add("tw");
        set.add("thre");
        set.add("fou");
        set.add("fiv");
        set.add("si");
        int result = set.size();
        assertEquals(12, result);

    }

}
