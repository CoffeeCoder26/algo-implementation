/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priorityqueues;

/**
 *
 * @author YN
 */


    /**
     * @param args the command line arguments
     */
 


class Pqueue
{
    int rear  =0 ;//add
    int front =0 ;//delete
    int [] arr = new int [30];
    public void Enqueue(int value)
    {       
            int i;
            int k;
            for( i=0;i<=rear;i++)
            {
                if(value < arr[i])
                {
                    break;
                }
            }
            for(  k=rear;k>i;k--)
            {
                arr[k]=arr[k-1];
            }
            arr[k]=value;
            rear++;
            
        
 
        
    }
    public int Dequeue()
    {
        return arr[front++];
    }
    public int peek()
    {
        return arr[front];
    }
    public void display()
    {
        for(int i= front; i<rear; i++)
        {
            System.out.print(arr[i]+"  ");
        }
    }

}

public class PriorityQueues {

    public static void main(String[] args) {
        Pqueue pq= new Pqueue();
        pq.Enqueue(2);
        pq.Enqueue(22);
        pq.Enqueue(1);
        pq.Enqueue(9);
        pq.Enqueue(8);
        pq.Enqueue(7);
        pq.Enqueue(25);
        pq.Enqueue(20);
        pq.Enqueue(0);
        
        pq.display();

    }

}
