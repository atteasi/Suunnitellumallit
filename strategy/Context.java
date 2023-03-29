package strategy;

import java.util.ArrayList;
import java.util.List;

public class Context {
    private ListConverter strategy;
    
    public Context(){

    }

    public void setConverter(ListConverter strategy){
        this.strategy = strategy;
    }

    public void print(){
        List<String> strings = new ArrayList<>();

        for(int i = 1; i <= 8; i++){
            strings.add( i + ". Lause ");
        }
        System.out.println(strategy.listToString(strings));
    }
}
