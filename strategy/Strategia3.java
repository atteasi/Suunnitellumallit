package strategy;

import java.util.List;

public class Strategia3 implements ListConverter{

    @Override
    public String listToString(List<String> list) {
        String listToString = "";

        String[] strings = new String[list.size()];
        strings = list.toArray(strings);

        for(int i = 0; i<strings.length; i++){
            listToString += strings[i];
            if((i + 1) % 3 == 0){
                listToString += "\n";
            }
        }
        return listToString;
    }
    
}
