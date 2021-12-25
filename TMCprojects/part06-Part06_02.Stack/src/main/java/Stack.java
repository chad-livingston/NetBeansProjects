
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chad
 */
public class Stack {
    private ArrayList<String> stack = new ArrayList<>();
    
    public Stack(){
        
    }
    
    
    public boolean isEmpty(){
        if (stack.size() <= 0){
            return true;
        }
        return false;
    }
    
    public void add(String value){
        stack.add(value);
    }
    public String take(){
        String topMostValue = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return topMostValue;
    }
    
    public ArrayList<String> values(){
        return stack;
    }
}
