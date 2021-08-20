
package stack;


public class StackDemo {
    public static void deleteLowerHalf(ArrayStack<Integer> s)
    {
        ArrayStack<Integer> temp= new ArrayStack<>(4);
        while(!s.isEmpty())
        {
            temp.push(s.top());
            s.pop();
        }
            for (int i=0; i<2; i++)
                temp.pop();
        
        while(!temp.isEmpty())
      {
          s.push(temp.top());
          temp.pop();
      }  
    }
    public static void printStack(ArrayStack<Integer> s)
    {
      ArrayStack<Integer> temp= new ArrayStack<>(4);
      while(!s.isEmpty())
      {
          System.out.println(s.top());
          temp.push(s.top());
          s.pop();
      }
      while(!temp.isEmpty())
      {
          s.push(temp.top());
          temp.pop();
      }
    }
     public static int sumStack(ArrayStack<Integer> s)
    {
        ArrayStack<Integer> temp= new ArrayStack<>(4);
        int sum=0;
        while(!s.isEmpty())
      {
          sum=sum+s.top();
          temp.push(s.top());
          s.pop();
      }
        while(!temp.isEmpty())
      {
          s.push(temp.top());
          temp.pop();
      } 
        return sum;
    }
    public static void delOdd(ArrayStack<Integer> s)
    {
     ArrayStack<Integer> temp= new ArrayStack<>(4);
       while(!s.isEmpty())
       {
           if(s.top()%2==0) //if even
             temp.push(s.top());
             s.pop(); // if odd
       }
       while(!temp.isEmpty())
      {
          s.push(temp.top());
          temp.pop();
      }  
    }
    public static int maxStack(ArrayStack<Integer> s)
    {
        ArrayStack<Integer> temp= new ArrayStack<>(4);
        int max;
        max=s.top();
        temp.push(s.top());
        s.pop();
        while(!s.isEmpty())
        {
          if(s.top()>max)
          {
              max=s.top();
          }
          temp.push(s.top());
          s.pop();
        }
         while(!temp.isEmpty())
      {
          s.push(temp.top());
          temp.pop();
      }  
        return max;
    }
    public static void main(String [] args)
    {
        //create stack object
        ArrayStack<Integer> s= new ArrayStack<>(4);
        s.push(110);
        s.push(200);
        s.push(100);
        s.push(300);
        System.out.println("Stack elements are:");
        //printStack(s);
        System.out.println("----------");
        System.out.println("sum of stack elements are "+sumStack(s));
        System.out.println("----------");
        printStack(s);
        System.out.println("----------");
        printStack(s);
        delOdd(s);
        printStack(s); 
        System.out.println("----------------");
        System.out.println("Max in stack is "+maxStack(s));
        System.out.println("----------------");
        deleteLowerHalf(s);
        printStack(s);
    }
    
}
