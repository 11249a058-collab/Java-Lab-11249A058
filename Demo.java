interface A
{
  void showA();
}
interface B extends A
{
  void showB();
}
interface C extends A
{
  void showC();
}
interface D extends B,C
{
  void showD();
}
class Demo implements D
{
  public void showA()
  {
    System.out.println("Interface A");
  }
  public void showB()
  {
    System.out.println("Interface B");
  }
  public void showC()
  {
    System.out.println("Interface C");
  }
  public void showD()
  {
    System.out.println("Interface D");
  }
  public static void main(String[] args)
  {
    Demo obj= new Demo();
    obj.showA();
    obj.showB();
    obj.showC();
    obj.showD();
  }
}