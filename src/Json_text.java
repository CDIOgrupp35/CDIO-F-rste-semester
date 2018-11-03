import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.io.FileReader;
public class Json_text {
    public static void main(String[] args){
        JSONObject jason = new JSONObject();
        JSONParser parser = new JSONParser();
        jason.put("name","Gustav");
        jason.put("age", 22);
        try (FileWriter file = new FileWriter("./test.json")){
            file.write(jason.toJSONString());
            file.flush();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        try{
            Object obj = parser.parse(new FileReader("./test.json"));
            JSONObject jobj = (JSONObject) obj;
            System.out.println(jobj);
            String name = (String) jobj.get("name");
            System.out.println(name);
            long age = (long) jobj.get("age");
            System.out.println(age);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }catch(ParseException f){
            f.printStackTrace();
        }
    }
}