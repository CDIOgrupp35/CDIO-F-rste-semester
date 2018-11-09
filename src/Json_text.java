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
        jason.put("intro","Welcome to IOOuterActive Adventure Game (please select language) \n 1) English \n 2) Dansk");
        jason.put("enter1", "Player 1 please enter your name");
        jason.put("enter2", "Player 2 please enter your name");
        jason.put("rules","To roll the dice press 1 and enter");
        jason.put("start", " starts");
        jason.put("turn",", it's your turn, roll the dice");
        jason.put("rollP1","you rolled ");
        jason.put("rollP2"," which lead you to");
        jason.put("balance","'s balance is now ");
        jason.put("wrong", "Invalid input, to roll the dice please press 1 and enter");
        jason.put("error","An error occurred, contact our support");
        jason.put("turn",", it's your turn");
        jason.put("win",", your balance has exceeded 3000, and you have won the game");
        jason.put("sq2","The tower: You saved the princess from the tower and get 250 in reward ");
        jason.put("sq3","The Crater: You get ambushed by robbers at the Crater and lose 100");
        jason.put("sq4","The Palace Gate: You are begging by the Palace gate and manage to collect 100");
        jason.put("sq5"," The Cold Desert: You are stuck in the Cold Desert and must invest in an overpriced blanket of 20 to keep warm");
        jason.put("sq6","THe Walled City: You sneak into the Walled City and steal 180");
        jason.put("sq7","The Monastery: You temporary seek refuge in a monastery offering your free labor ");
        jason.put("sq8","The Black Cave: You get lost in the Black Cave and sacrifice 70 to the mountain god");
        jason.put("sq9","The Hut: You help cutting the wool of the sheep and are payed 60");
        jason.put("sq10","The Werewolf wall: You get infected with lycanthropy and must pay 80 to get cured , feeling rejuvenated you cary on with your quest");
        jason.put("sq11","The Pit: You fell into the pit and must pay 50 for your stupidity ");
        jason.put("sq12","The Goldmine: You tipped over some gold in the mountains and sell it for 650");

        try (FileWriter file = new FileWriter("./test.json")){
            file.write(jason.toJSONString());
            file.flush();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        jason.put("enter1", "Spiller 1, indtast venligt dit navn ");
        jason.put("enter2", "Spiller 2, indtast venligt dit navn ");
        jason.put("rules","Tyk 1 og enter for at rulle med terningerne");
        jason.put("turn",", det er din tur, slå med terningerne");
        jason.put("start", " starter");
        jason.put("rollP1","De slog ");
        jason.put("rollP2"," og landede på");
        jason.put("balance","s penge beholdning er nu ");
        jason.put("wrong", "Ugyldigt input, tyk 1 og enter for at rulle med terningerne");
        jason.put("turn",", det er din tur");
        jason.put("error","Der opstod en fejl");
        jason.put("win",", Tillykke, din pengebeholdning er har nået 3000!");
        jason.put("sq2","Tårnet: Du redder prinsessen fra Tårnet og belønnes med 250 ");
        jason.put("sq3","Krateret: Du bliver overfaldet af røvere ved Krateret og mister 100");
        jason.put("sq4","Paladsporten: Du tigger ved Paladsets Porte og formår at samle 100");
        jason.put("sq5","Den Kolde Ørken: Du er fanget i den Kolde Ørken og må investere i et tæppe til en overpris på 20 for at holde varmen ");
        jason.put("sq6","Den Murrede By: Du sniger dig ind i den Murede By og stjæler 180");
        jason.put("sq7","Klosteret: Du søger midlertidig tilflugt i et kloster mod din gratis arbejdskraft");
        jason.put("sq8","Den Sorte Grotte: Du fare vild i den Sorte Grotte og må ofre 70 til bjerg-gudinden");
        jason.put("sq9","Hytten i Bjergene: Du hjælper med at klippe fåreuld og betales 60 for din hjælp");
        jason.put("sq10","Vareulvevæggen: Du smittes med månesyge og må betale 80 for at blive kureret, og få en til chance i livet. Det er din tur igen. ");
        jason.put("sq11","Hullet: Du faldt ned i et stort hul og må betale 50 for din dumhed ");
        jason.put("sq12","Guldminen: Du faldt over noget guld i bjergene og sælger det for 650");

        try (FileWriter file = new FileWriter("./test_da.json")){
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
            System.out.println((String) jobj.get("start"));
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }catch(ParseException f){
            f.printStackTrace();
        }
    }
}