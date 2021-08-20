
package queue;
import java.util.Scanner;
//import stack.ArrayStack;

public class QueueDemo {
    public static void printQueue(ArrayBndQueue<Integer> q1)
    {
        ArrayBndQueue<Integer> temp=new ArrayBndQueue<>(5);
        System.out.println("Q1 elements are: ");
       /* for(int i=1; i<=q1.numElements;i++)
        {
            
        }*/
        while(!q1.isEmpty())
        {
         int x=q1.dequeue();   
        System.out.println(x);
        temp.enqueue(x);
        }
        System.out.println();  
        while(!temp.isEmpty())
        {
            int x1=temp.dequeue();
        q1.enqueue(x1);
        }      
    }
    public static void removeNegatives(ArrayBndQueue<Integer> q1)
    {
       ArrayBndQueue<Integer> temp=new ArrayBndQueue<>(5);
        while(!q1.isEmpty())
        {
         int x=q1.dequeue(); 
           if(x>=0)
             temp.enqueue(x);
        }//while
        while(!temp.isEmpty())
        {
         int x1=temp.dequeue();
             q1.enqueue(x1);
        }//while2      
    }        
    public static boolean containInQueue(ArrayBndQueue<Integer> q1, int num)
    {
       ArrayBndQueue<Integer> temp=new ArrayBndQueue<>(5);
       boolean flag=false;
       while(!q1.isEmpty())
       {
           int x=q1.dequeue();
           if(x==num)
           {
               flag=true;
           }
           temp.enqueue(x);
       }
        while(!temp.isEmpty())
        {
         int x1=temp.dequeue();
             q1.enqueue(x1);
        }  
       return flag;
    }
    public static void main(String [] args)
    {
        ArrayBndQueue<Integer> q1=new ArrayBndQueue<>(5);
        //ArrayUnbndQueue<Integer> q2=new ArrayUnbndQueue<>(2);
        Scanner input= new Scanner(System.in);
        q1.enqueue(-10);
        q1.enqueue(20);
        q1.enqueue(-30);
        q1.enqueue(40);
        q1.enqueue(-100);
        System.out.println("Please enter the number");
        int num=input.nextInt(); //scanner input
        //printQueue(q1);
        //System.out.println("-------------");
        //removeNegatives(q1);
       //System.out.println("Queue after removing negatives:");
       //printQueue(q1);
        //printQueue(q1);
        //printQueue(q1);
        //printQueue(q1);
        boolean found;
        found=containInQueue(q1, num);
        if (found==true)
            System.out.println("num is in queue");
        else
            System.out.println("num is NOT in queue");   
    }  
}
