package c08_docstringtype.step_definitions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.DocStringType;
import io.cucumber.java.en.Given;

public class DocStringType_stepDef {

    private static ObjectMapper objectMapper = new ObjectMapper();

    @DocStringType
    public JsonNode json(String docString) throws JsonProcessingException {
        return objectMapper.readValue(docString, JsonNode.class);
    }
    @Given("Json node data is")
    public void json_node_data_is(JsonNode jsonNode) {
        System.out.println(jsonNode.get("identification"));
        System.out.println(jsonNode.get("identification").get("name"));
    }
}