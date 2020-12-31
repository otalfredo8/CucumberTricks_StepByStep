package c07_parameterType.step_definitions;

import c07_parameterType.Tab;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;

import java.util.Arrays;
import java.util.List;

public class ParameterType_stepDef {

    @ParameterType(".*")
    public List<String> role(String roleType1){
        return Arrays.asList(roleType1.split(","));
    }

    @Given("I have the following roles {role}")
    public void i_have_the_following_roles(List<String> roles) {
        System.out.println(roles.get(0));
    }

    @ParameterType(".*")
    public Tab tab(String tabName){
        return new Tab(tabName);
    }
    @Given("our app has these tabs {tab}")
    public void our_app_has_these_tabs(Tab tab) {
        System.out.println(tab.tab);
    }
}
