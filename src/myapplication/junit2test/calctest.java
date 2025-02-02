package myapplication.junit2test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class calctest {
    @Test
    void test() {
        calc calc = new calc();
        assertEquals(10, calc.add(5, 5));
    }
    @Test
    void test2() {
    
        assertEquals(" expected but not get your answer sorryyy try to fix it as sona s possible thakuy !!!",5, calc.subtract(5, 10));  // this msg will show only when the output is failed .
    }

}
