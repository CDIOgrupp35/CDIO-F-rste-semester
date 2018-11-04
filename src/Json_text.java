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
        Dice dice = new Dice();
        JSONObject jason = new JSONObject();
        JSONParser parser = new JSONParser();
        jason.put("intro","Welcome to IOOuterActive Adventure Game (please select language) \n 1) English \n 2) Dansk");
        jason.put("enter1", "Player 1 please enter your name");
        jason.put("enter2", "Player 2 please enter your name");
        jason.put("rules","To roll the dice press 1 and enter");
        jason.put("turn",", it's your turn, roll the dice");
        jason.put("roll","you rolled"+ dice.sum() + "and landed on ");
        jason.put("balance","'s balance is now ");
        jason.put("wrong", "Invalid input, to roll the dice please press 1 and enter");
        jason.put("error","An error occurred, contact our support");
        jason.put("win",", your balance has exceeded 3000, and you have won the game");
        jason.put("sq2","You saved the princess from the tower and get 250 in reward ");
        jason.put("sq3","You get ambushed by robbers at the Crater and lose 100");
        jason.put("sq4","You are begging by the Palace gate and manage to collect 100");
        jason.put("sq5","You are stuck in the Cold Desert and must invest in an overpriced blanket of 20 to keep warm");
        jason.put("sq6","You sneak into the Walled City and steal 180");
        jason.put("sq7","You temporary seek refuge in a monastery offering your free labor ");
        jason.put("sq8","You get lost in the Black Cave and sacrifice 70 to the mountain god");
        jason.put("sq9","You help cutting the wool of the sheep and are payed 60");
        jason.put("sq10","You get infected with lycanthropy and must pay 80 to get cured , feeling rejuvenated you cary on with your quest");
        jason.put("sq11","You fell into the pit and must pay 50 for your stupidity ");
        jason.put("sq12","You tipped over some gold in the mountains and sell it for 650");

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