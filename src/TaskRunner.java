import java.util.Scanner;

import static task1.Task1.runTask1;
import static task2.Task2.runTask2;
import static task3.Task3.runTask3;
import static task4.Task4.runTask4;

public class TaskRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String currentTask;

        while(true) {
            System.out.println("Write \"exit\" if you want to finish");
            System.out.println("Select the number of the task you want to run (1, 2, 3, 4): ");
            currentTask = scanner.nextLine();

            if(currentTask.equals("exit")) break;

            switch (currentTask){
                case "1":
                    runTask1();
                    break;

                case "2":
                    runTask2();
                    break;

                case "3":
                    runTask3();
                    break;

                case "4":
                    runTask4();
                    break;

                default:
                    System.out.println("Incorrect input");
                    break;
            }
        }
    }
}
