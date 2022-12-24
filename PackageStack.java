import java.util.Scanner;
import java.util.Stack;
public class PackageStack
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        int x, a, val;
        System.out.print("Enter the number of Operations to perform on Stack Data Structure : ");
        x = scanner.nextInt();
        for(int i = 1; i <= x; i++)
        {
            System.out.print("Enter 1 to Push, 2 to Pop, 3 to Peek first element, 4 to check if the stack is empty : ");
            a = scanner.nextInt();
            switch(a)
            {
                case 1:
                System.out.print("Enter the Data to be Pushed : ");
                val = scanner.nextInt();
                stack.push(val);
                break;
                case 2:
                stack.pop();
                break;
                case 3:
                System.out.println("Top Node : "+stack.peek());
                break;
                case 4:
                System.out.println("The Stack Empty condition is : "+stack.isEmpty());
                break;
                default:
                System.out.println("Wrong Choice Entered !!");
            }
        }
        scanner.close();
    }
}