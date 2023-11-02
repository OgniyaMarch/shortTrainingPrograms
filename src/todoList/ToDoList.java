package todoList;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        List<Task> toDoList = new ArrayList<>();

        System.out.println("\tMenu To-Do List");
        System.out.println("1. Show list of tasks.");
        System.out.println("2. Add task to To-Do list.");
        System.out.println("3. Mark task as completed");
        System.out.println("4. Show progress (%)");
        System.out.println("5. Exit");

        while (true){
            System.out.print("Enter choice: ");
            Scanner scanner = new Scanner(System.in);
            int userChoice;
            try{
                userChoice = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e){
                continue;
            }

            switch (userChoice){
                case 1 -> {
                    System.out.println("Tasks:");
                    if (toDoList.isEmpty()){
                        System.out.println("To-Do list is empty. ");
                        continue;
                    }
                    for(int i = 1; i <= toDoList.size(); i++){
                        System.out.println(i + ". " + toDoList.get(i - 1));
                    }
                }
                case 2 -> {
                    System.out.print("Enter task: ");
                    Task task = new Task(scanner.nextLine());
                    toDoList.add(task);
                    System.out.println("Task is added successfully.");
                }
                case 3 -> {
                    System.out.println("Enter the number of the task that has been completed:");
                    int completedTask = scanner.nextInt();
                    scanner.nextLine();
                    toDoList.get(completedTask - 1).markAsComplete();
                }
                case 4 -> {
                    if (toDoList.isEmpty()){
                        System.out.println("To-Do list is empty.");
                        continue;
                    }
                    long completedTasks = toDoList.stream()
                            .filter(e -> e.isCompleted())
                            .count();
                    System.out.println("To-Do list is completed: "
                            + ((double)completedTasks / toDoList.size()) * 100
                            + "%");
                }
                case 5 ->{
                    System.out.println("Program is closing....");
                    System.exit(0);
                }
                default -> System.out.println("Wrong input");
            }
        }
    }
}
