package c06_datatabletype.step_definitions;
import c06_datatabletype.Component;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;

import java.util.List;
import java.util.Map;

public class DataTableType_stepDef {

    @DataTableType
     public Component converter (Map<String, String> mapEntry){
        return new Component(mapEntry.get("electronic"), mapEntry.get("organic"));
    }
    @Given("I have datatable :")
    public void i_have_datatable(DataTable dataTable) {

        //Throws UndefinedDataTableTypeException.
        //To fix: Since Cucumber-JVM 5, use @DataTableType, @ParameterType, @DocsString
        /*List<Component> components = dataTable.asList(Component.class);
        for(Component component : components){
            System.out.println(component.electronic);
            System.out.println(component.organic);
        }*/

        List<Component> components = dataTable.asList(Component.class);
        for (Component component : components) {
            System.out.println("***** A Set Of Data*****");
            System.out.println(component.electronic);
            System.out.println(component.organic);

        }
    }
}
