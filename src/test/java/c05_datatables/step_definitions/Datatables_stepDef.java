package c05_datatables.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;
import org.junit.Ignore;

import java.util.*;

public class Datatables_stepDef {

    @Given("I have the following data")
    public void iHaveTheFollowingData(DataTable dataTable) {

        List<List<String>> data = dataTable.asLists();

        System.out.println("***** specific cell *****");
        System.out.println(data.get(0).get(2));
        System.out.println(data.get(2).get(1));
        System.out.println(dataTable.cell(0,2));
        System.out.println(dataTable.cell(2,1));

        System.out.println("***** specific row *****");
        System.out.println(data.get(0));
        System.out.println(dataTable.row(0));

        System.out.println("***** specific column asList *****");
        System.out.println(dataTable.column(0));

        System.out.println("***** rowByrow & cellBycell *****");
        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i));
        }

        for (int i = 0; i < data.size(); i++) {
            for (int j = 0; j < data.size(); j++) {
                System.out.println(data.get(i).get(j));
            }
        }

        System.out.println("***** NewDataTableChoppingColumns (from column #)*****");
        System.out.println(dataTable.columns(1));
    }

    @Given("I have this data :")
    public void iHaveThisData(io.cucumber.datatable.DataTable dataTable) {
        Map<String,String> m =  dataTable.asMap(String.class,String.class);
        System.out.println("\nFilling form with below data\n");
        for( String k : m.keySet())
        {
            System.out.println(k + " : " + m.get(k));
        }
    }

    @Given("I have more data :")
    public void iHaveMoreData(DataTable dataTable) {

        List<Map<String, String>> mapList = dataTable.asMaps();

        for (Map<String, String> map : mapList) {
            for (String key : map.keySet()) {
                String value = map.get(key);
                System.out.println(key + ":" + value);
            }
            System.out.println("*****Set Of Data*****");
        }
    }
}
