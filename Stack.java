import java.util.Scanner;
public class Stack
{
    public class Node
    {
        public int data;
        public Node next;
        public Node(int val)
        {
            this.data = val;
            this.next = null;
        }
    }
    Node top;
    
    public void Push(int value)
    {
        Node n = new Node(value);
        if(top == null)
        {
            top = n;
            n.next = null;
            return;
        }
        n.next = top;
        top = n;
        return;
    }
    
    public void Display()
    {
        Node temp = top;
        System.out.print("Top -> ");
        while(temp.next != null)
        {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println(temp.data);
        return;
    }

    public void Pop()
    {
        if(top == null)
        {
            System.out.println("Underflow Condition !!");
            return;
        }
        top = top.next;
        return;
    }

    public boolean EmptyStack()
    {
        if(top == null)
            return true;
        return false;
    }

    public void StackSize()
    {
        Node temp = top;
        int count = 0;
        while(temp != null)
        {
            temp = temp.next;
            count++;
        }
        System.out.println("The Size of the Stack is : "+count);
        return;
    }

    public void DestroyStack()
    {
        top = null;
        System.out.println("The Stack has been completely destroyed !!");
        return;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack();
        int x, a, d;
        System.out.print("Enter the number of Operations to perform on the Stack : ");
        x = scanner.nextInt();
        for(int i = 0; i < x; i ++)
        {
            System.out.print("Enter 1 to push, 2 to display, 3 to pop, 4 to check if empty, 5 to stack size, 6 to destroy stack : ");
            a = scanner.nextInt();
            if (a == 1)
            {
                System.out.print("Enter the data to be pushed : ");
                d = scanner.nextInt();
                stack.Push(d);
            }
            else if(a == 2)
                stack.Display();
            else if(a == 3)
                stack.Pop();
            else if(a == 4)
            {
                boolean b = stack.EmptyStack();
                if ( b == true)
                    System.out.println("The Stack is currently Empty !!");
                if ( b != true)
                    System.out.println("Ts STack is currently not empty !!");
            }
            else if(a == 5)
                stack.StackSize();
            else if(a == 6)
                stack.DestroyStack();
        }
        scanner.close();
    }
}