package strategy;

import java.util.List;

public class Strategia1 implements ListConverter{

    @Override
    public String listToString(List<String> list) {
        String listToString = "";
        for(String string : list){
            listToString += string;
        }
        return listToString;
    }
    
}
