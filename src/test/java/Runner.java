import org.json.JSONException;

import java.io.IOException;

public class Runner {

    public static void main(String[] args) throws IOException, JSONException {

        JsonToPojoConverter jsonConvert = new JsonToPojoConverter();
        jsonConvert.generatePojo();

        //Getting data from Pojo
        /*String jsonText = new String(Files.readAllBytes(Paths.get("src/main/resources/input.json")));
        //System.out.println(jsonText);
        int j = jsonText.indexOf("{");
        jsonText = jsonText.substring(j);
        JSONObject jsonFile = new JSONObject(jsonText);
        //System.out.println("Input JSON data: "+ jsonFile.toString());
        Object result = jsonFile.get("content");
        //System.out.println("Result array Data: "+ result.toString());
        List<Content> contentDetails = new ArrayList<Content>();
        ObjectMapper map = new ObjectMapper();
        Content[] contentArr = map.readValue(result.toString(), Content[].class);
        System.out.println("In F Number : " + contentArr[0].getInMot().getFNum().getValue());
        System.out.println("Out F Number : " + contentArr[0].getOutMot().getFNum().getValue());*/
    }
}
