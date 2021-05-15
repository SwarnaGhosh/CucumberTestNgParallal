package stepdef;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import runner.Runner;
import util.WebHelper;

public class Hooks {
    @Before
    public void setup() throws Throwable {
        System.out.println("Before cucumber step def");

    }

    @After
    public void tearDown() throws Throwable {
        System.out.println("After cucumber step def");

    }
}
