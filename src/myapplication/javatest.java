package myapplication;

// steps to create jnunit 5 test setup

// 1. add junit5 dependency in your pom.xml file
// 2. create a new java class with @Test annotation
// 3. create a new instance of the class and call the methods you want to test
// 4. use assertEquals method to assert the expected and actual results
// 5. run the test class using JUnit5 runner

//  Assertion : Expectation vs actual output '
//  Asseertion static method  EX: assertEquals( expected, actual);
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class javatest {
    @Test // this annotation applies over methods as test ./ present inside the
          // org.junit.jupiter.api package which is JUNIT5.
          // the diffrence between the junit 4 and ujunit 5 is we dont have make the test
          // public , it can be public ,static or defoult ,any of them

    void test() {
        reverstring reverstring = new reverstring();

        assertEquals("ayruahs", reverstring.reverse("shaurya"));
        // assertEquals("expectedoutput".actualoutput);
        System.out.println(reverstring.reverse("shaurya"));
    }

    @Test
    void test2() {
        divide divided = new divide();
        assertEquals(5, divided.values(10, 2));
    }
}
