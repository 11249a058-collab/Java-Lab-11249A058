class FirstThread extends Thread
{
public void run()
{
for(int i=1;i<=5;i++)
{
System.out.println("first thread:"+i);
}
}
}
class SecondThread extends Thread
{
public void run()
{
for (int i=1;i<5;i++)
{
System.out.println("second thread:"+i);
}
}
}
public class MultiThreadDemo
{
public static void main(String[] args)
{
FirstThread t1=new FirstThread();
SecondThread t2=new SecondThread();
t1.start();
t2.start();
}
}