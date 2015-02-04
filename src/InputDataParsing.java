/**
 * Created by Богдан on 04.02.2015.
 */
public class InputDataParsing {
    private String input;
    public InputDataParsing(String currentString){
        this.input = currentString;
    }
    public int parse(){
        String digValid = input.substring(0,input.indexOf("+"));
        if(digValid.contains("r") || digValid.contains("R")){


        }
    }
}
