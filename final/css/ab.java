import java.io.*;
import java.util.*;
class queue
{
	int[] arr;
	int front,rear;
	queue()
	{
		arr=new int[100];
		front=rear=-1;
	}
	void enqeue(int x)
	{
		if(rear==arr.length-1)
		{
			System.out.println("overflow");
			return;
		}
		rear++;
		arr[rear]=x;
		if(rear==0)
			front=0;
	}
	void dequeue()
	{
		if(front==-1)
		{
			System.out.println("underflow");
		}
		//int x=arr[front];
		if(front==rear)
			front=rear=-1;
		else
			front++;
		//return x;
	}
	void display()
	{
		for(int i=front;i<=rear;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void main(String args[])
	{
		queue q=new queue();
		q.enqeue(80);
		q.enqeue(50);
		q.enqeue(65);
		q.enqeue(13);
		q.enqeue(35);
		q.display();
		System.out.println("after poping the first element");
		q.dequeue();
		q.display();
	} 
}