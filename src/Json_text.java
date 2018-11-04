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
        jason.put("intro","intro");
        jason.put("roll","");
        jason.put("score","");
        jason.put("error","");
        jason.put("sq2","");
        jason.put("sq3","");
        jason.put("sq4","");
        jason.put("sq5","");
        jason.put("sq6","");
        jason.put("sq7","");
        jason.put("sq8","");
        jason.put("sq9","");
        jason.put("sq10","");
        jason.put("sq11","");
        jason.put("sq12","");

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
            System.out.println((String) jobj.get("name"));
            System.out.println((long) jobj.get("age"));
            System.out.println((String) jobj.get("intro"));
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }catch(ParseException f){
            f.printStackTrace();
        }
    }
}