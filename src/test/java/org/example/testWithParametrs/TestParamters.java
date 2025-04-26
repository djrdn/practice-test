package org.example.testWithParametrs;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParamters {
    @Parameters({"param"})
    @Test
    public void testWithParameter(@Optional("default value") String param){
        System.out.println("test with parameter = " + param);
    }
}
