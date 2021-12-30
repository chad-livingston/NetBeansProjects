
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chad
 */


public class UserInterface {
    
    private Scanner scanner;
    private TodoList todoList;
    public UserInterface(TodoList todoList, Scanner scanner){
        this.scanner = scanner;
        this.todoList = todoList;
    }
    public void start(){
        
        while(true){
            System.out.print("Command: ");
            String userInput = this.scanner.nextLine();
            if (userInput.equals("stop")){
                
                break;
            }
            
            if (userInput.equals("add")){
                System.out.print("To add: ");
                String userInputToAdd = this.scanner.nextLine();
                todoList.add(userInputToAdd);
                continue;
            }
            if (userInput.equals("remove")){
                System.out.print("Which one is removed? ");
                int userValueToRemove = Integer.valueOf(this.scanner.nextLine());
                todoList.remove(userValueToRemove);
                continue;
            }
            if (userInput.equals("list")){
                todoList.print();
            }
                
        }
        
    }
}
