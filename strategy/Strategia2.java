package strategy;

import java.util.List;

public class Strategia2 implements ListConverter {

    @Override
    public String listToString(List<String> list) {
        String listToString = "";
        for(int i = 0; i < list.size(); i++){
            listToString += list.get(i);
            if((i + 1) % 2 == 0){
                listToString += "\n";
            }
        }    
        return listToString;
    }
    
}
