package test;

import data.*;
import java.util.*;
import negocio.*;

public class test {
    public static void main(String[] args) {
        
        IAccessData gameInteraction = new AccessDataImpl();
        Scanner console = new Scanner(System.in);
        int option;
        
        
        option = principalMenu(true, console);
        System.out.println("option = " + option);
        
        switch(option){
            case 1:
                System.out.println("Enter your password:");
                String passEntered = console.nextLine();
                if(gameInteraction.passwordVerification(passEntered)){
                    adminMenu();
                }else{
                    System.out.println("Incorrect Password!");
                    principalMenu(true, console);
                }
                break;
            
            
        }
            
    }
    
    public static int principalMenu(boolean correctOption, Scanner console){
        
        int option = 0;
        
        while(correctOption){
            System.out.println("**************Principal Menu**************");
            System.out.println("Select an option");
            System.out.println("1. Enter as an administrator");
            System.out.println("2. Start game with two players");
            System.out.println("3. Exit");
            System.out.println("******************************************");
            
            try{
                option = Integer.parseInt(console.nextLine());
            }catch(NumberFormatException e){
                System.out.println("Enter a number!");
            }
            if(option == 1 || option ==2){
                correctOption = false;
            }else if(option == 3){
                System.exit(0);
            }
        }
        
        return option;
    }
    
    public static void adminMenu(){
        
    }
    
    
    
    public static void test2(){
        //        CatalogoImages a = new CatalogoImages();
//        String imagePokemonIndex;
//        imagePokemonIndex = a.getImageIndex(0);
//        System.out.println("imagePokemonIndex = " + imagePokemonIndex);
//        
//        a.printImages();


        //read many lines and save them in the string x
        Scanner a = new Scanner(System.in);
        StringBuilder p = new StringBuilder();
        System.out.println("insert the image");
        String x;
        while(true){
            
            x = a.nextLine();
            if(x.equals("quit")){
               break; 
            }
            
            p.append(x).append("\n");
        }
        
        x = p.toString();
        
        System.out.println("x = " + x);
        
        System.out.println("No issues !");
        System.out.println("hellow world");
    }
    
}
