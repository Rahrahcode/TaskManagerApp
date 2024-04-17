package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskManagerApp {
    private List<String> tasks; // List to store tasks
    private Scanner scanner;  

    //// Constructor////////
    public TaskManagerApp() {
        this.tasks = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }
    
    ///// Main //////////
    public static void main(String[] args) {
        TaskManagerApp taskManager = new TaskManagerApp(); 
        taskManager.start(); 
    }    

    ////////////////////////////
    public void start() {
        System.out.println("Task Manager App Started!");
        while (true) { ///////// Infinite loop keep running
           
            System.out.println("1. Add Task");
            System.out.println("2. List Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt(); 
            scanner.nextLine(); 

            switch (option) { 
                case 1:
                    System.out.print("Enter task: ");
                    String task = scanner.nextLine(); // Read task 
                    addTask(task); 
                    break;
                case 2:
                    listTasks(); 
                    break;
                case 3:
                    System.out.print("Enter task to delete: ");
                    String taskToDelete = scanner.nextLine(); 
                    deleteTask(taskToDelete); 
                    break;
                case 4:
                    System.out.println("Exiting Task Manager App.");
                    return; 
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }

    /////////Method to add a task//////////
    public void addTask(String task) {
        tasks.add(task); 
        System.out.println("Task added: " + task); 
    }

    ///// Method to list all tasks////////
    public void listTasks() {
        System.out.println("Tasks:"); 
        for (String task : tasks) {
        	System.out.println("- " + task); 
        }
    }

    ////// Method to delete a task/////////
    public boolean deleteTask(String task) {
        if (tasks.remove(task)) { 
            System.out.println("Task deleted: " + task); 
            return true; 
        } 
        else 
        {
            System.out.println("Task not found: " + task); 
            return false; 
        }
    }

}


