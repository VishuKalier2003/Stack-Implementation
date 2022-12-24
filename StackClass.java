//! Stack Implementation using Linked List Data Structure...
import java.util.Scanner;
//! Main Stack class...
public class StackClass
{
    //! Static Class thus, outer class need not to be instantiated or initialised...
    static class Node            //? Node Class Created...
    {
        int data;
        Node next;
        public Node(int value)
        {
            this.data = value;
            next = null;
        }
    }

    //! Static Class thus, outer class need not to be instantiated or initialised...
    static class Stack            //? Stack Class Created for performing Stack Operations...
    {
        //! The Top Pointer is single for a given Stack hence static keyword is used...
        public static Node top;

        //? Method to check if Stack is Empty... O(1) time...
        public static boolean Empty()
        {
            return top == null;
        }

        //? Pushing a Node into the Stack... O(1) time...
        public static void Push(int value)
        {
            Node n = new Node(value);
            if(Empty() == true)
            {
                top = n;
                return;
            }
            n.next = top;
            top = n;
            return;
        }

        //? Popping a Node from the Stack... O(1) time...
        public static void Pop()
        {
            if(Empty() != true)
            {
                top = top.next;
                return;
            }
            System.out.println("Underflow Condition !!");
        }

        //? Traversing the Stack... O(n) time...
        public static void Display()
        {
            Node temp = top;
            System.out.println("The Current Stack => ");
            while(temp != null)
            {
                System.out.print(temp.data+" -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }

        //? Getting the Top Node value of the Stack... O(1) time...
        public static int Peek()
        {
            return top.data;
        }
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int x, a, val;
        System.out.print("Enter the number of Operations to perform on Stack Data Structure : ");
        x = scanner.nextInt();
        Stack stack = new Stack();
        for(int i = 1; i <= x; i++)
        {
            System.out.print("Enter 1 to Push, 2 to Pop, 3 to Print, 4 to get Top Node data : ");
            a = scanner.nextInt();
            switch(a)
            {
                case 1:
                System.out.print("Enter the Data to be Pushed : ");
                val = scanner.nextInt();
                stack.Push(val);
                break;
                case 2:
                stack.Pop();
                break;
                case 3:
                stack.Display();
                break;
                case 4:
                int t = stack.Peek();
                System.out.println("The Top Node data is : "+t);
                break;
                default:
                System.out.println("Wrong Choice Entered !!");
            }
        }
        scanner.close();
    }
}