package c09_hooks.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {

    @Before (value = "@db")
    public void setupDataBase(){
        System.out.println("Hooks - @Before setupDataBase() - @db scenario");
    }
    @Before (order = 0)
    public void startServer(){
        System.out.println("Hooks - @Before startServer() order=0");
    }
    @Before (order = 1)
    public void setupScenario(){
        System.out.println("Hooks - @Before setupScenario() order=1");
    }
    @BeforeStep
    public void setupStep(){
        System.out.println("Hooks - @BeforeStep setupStep()");
    }
    @AfterStep
    public void teardownStep(){
        System.out.println("Hooks - @AfterStep teardownStep()");
    }
    @After (order = 1)
    public void teardownScenario1(){
        System.out.println("Hooks - @After teardownScenario1() order = 1");
    }
    @After (order = 0)
    public void turnOffServer(){
        System.out.println("Hooks - @After turnOffServer() order = 0");
    }
    @After ("@db") //or value = "@db"
    public void teardownScenario(){
        System.out.println("Hooks - @After teardownScenario() order = none - @db Scenario");
    }
}
