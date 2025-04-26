package org.example.testWithGroup;

import org.testng.annotations.Test;

public class TestGroup {
    @Test (groups = "testgroup")
    public void testGroup1(){
        System.out.println("test group 1");
    }
    @Test (groups = "testgroup")
    public void testGroup12(){
        System.out.println("test group 12");
    }
    @Test (groups = "testgroup")
    public void testGroup13(){
        System.out.println("test group 13");
    }
}
