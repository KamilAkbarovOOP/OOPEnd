import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TodoList todoList = new TodoList();

        while (true) {
            System.out.println("------To-Do List------");
            System.out.println(todoList);
            System.out.println("----------------------");
            System.out.println("1. Add task");
            System.out.println("2. Mark as Done");
            System.out.println("3. Delete task");
            System.out.println("4. Close");

            System.out.print("Enter: ");
            int c = input.nextInt();

            if (c == 1) {
                System.out.print("Enter the task: ");
                String task = input.next();
                Item todoItem = new Item(task);
                todoList.Add(todoItem);
                System.out.println("Task Added!");
            }
            else if (c == 2){
                System.out.print("Enter number to mark: ");
                int i = input.nextInt() - 1;
                todoList.MarkDone(i);
                System.out.println("Done!");
            }
            else if (c == 3){
                System.out.print("Enter number to delete: ");
                int removeIndex = input.nextInt() - 1;
                todoList.Delete(removeIndex);
                System.out.println("Deleted!");
            }
            else if (c == 4){
            return;
            }
            else{
                System.out.println("****** Try Again ******");
            }
            }
        }
    }

