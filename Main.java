import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> myTasks = new ArrayList<>();
        myTasks.add("walk the dog");
        myTasks.add("walk the cat");
        myTasks.add("walk the fish");


        String choice = "";


        while(!(choice.equals("0"))) {

            System.out.println("\nPlease choose an option:\n" +
                    "(1) Add a task.\n" +
                    "(2) Remove a task.\n" +
                    "(3) Update a task.\n" +
                    "(4) List all tasks.\n" +
                    "(0) Exit.");
            choice = input.nextLine();

            if (choice.equals("1")) {
                System.out.println("what task you wonna add?");
                String addTask = input.nextLine();
                myTasks.add(addTask);
            }
            else if (choice.equals("2")) {
                System.out.println("what task you wonna remove? (starting from 0)");
                System.out.println(myTasks);
                String removeTask = input.nextLine();
                myTasks.remove(Integer.parseInt(removeTask));
            }
            else if (choice.equals("3")) {
                System.out.println("what task you wonna update? (starting from 0)");
                System.out.println(myTasks);
                String updateTask = input.nextLine();
                System.out.println("what do you want to replace it with?");
                String updatedTask = input.nextLine();
                myTasks.set(Integer.parseInt(updateTask), updatedTask);
            }
            else if (choice.equals("4")) {
                System.out.println(myTasks);
            }



        }



        //while(!(adding.equals("quit"))){
        //    myTasks.add(adding);
        //    System.out.println(myTasks);
        //    System.out.println("what task you wonna add?");
        //    adding = input.nextLine();
//
        //}

    }
    public static Scanner input = new Scanner(System.in);

}