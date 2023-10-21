package com.kirkwood.contribution2;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Map2Test_Michael {

    @Test
    void firstSwap_Michael_oneSwap() {
        String[] strings1 = {"ab", "ac"};
        String[] strings2 = {"ac", "ab"};
        System.out.println(strings1.toString());
        System.out.println(strings2.toString());
        assertTrue(Arrays.equals(strings2, Map2.firstSwap_Michael(strings1)));
    }

    @Test
    void firstSwap_Michael_multiswap1() {
        String[] strings1 = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
        String[] strings2 =  {"ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz"};
        assertTrue(Arrays.equals(strings2, Map2.firstSwap_Michael(strings1)));
    }

    @Test
    void firstSwap_Michael_realWords() {
        String[] strings1 = {"easy", "does", "it", "every", "ice", "eaten"};
        String[] strings2 = {"every", "does", "ice", "easy", "it", "eaten"};
        assertTrue(Arrays.equals(strings2, Map2.firstSwap_Michael(strings1)));
    }

    @Test
    void firstSwap_Michael_singleValue(){
        String[] strings1 = {"aaa"};
        String[] strings2 = {"aaa"};
        assertTrue(Arrays.equals(strings2, Map2.firstSwap_Michael(strings1)));
    }

    @Test
    void firstswap_Michael_emptyArray(){
        String[] strings1 = {};
        String[] strings2 = {};
        assertTrue(Arrays.equals(strings2, Map2.firstSwap_Michael(strings1)));
    }
}