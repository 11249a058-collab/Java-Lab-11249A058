import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class SimpleFileStream{
public static void main(String[] args) throws
IOException{
String data="hello,java streams!";
FileOutputStream fos = new FileOutputStream("test.txt");
fos.write(data.getBytes());       
fos.close();                     
FileInputStream fis = new FileInputStream("test.txt");
int i;
while ((i = fis.read()) != -1) {
System.out.print((char) i); 
}
fis.close();               
}
}