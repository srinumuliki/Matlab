package Programs;

// Write Java Program to demonstrating thread synchronization in multithreading.

import java.lang.*; 
class College
{
	public synchronized void classRoom (String fn)
	{
		for (int i=1 ; i<5 ; i++)
		{
			System.out.println(i + " class taken by " + fn); 
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){}
		}
		System.out.println(fn + " task completed\n");
	}
}
class MyThread extends Thread
{
	College c;
	String faculty;
	MyThread(College obj, String name)
	{
		c=obj; 
		faculty=name;
	}
	public void run()
	{
		c.classRoom(faculty);
	}
}
class Experiment16
{
	public static void main(String args[])
	{
		College x = new College();
		MyThread t1 = new MyThread(x,"Babuji Sir"); 
		MyThread t2 = new MyThread(x,"Kumar Sir"); 
		MyThread t3 = new MyThread(x,"Pradeep Sir"); 
		t1.start();
		t2.start();
		t3.start();
	}
}






