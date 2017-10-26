import java.util.Scanner;
public class myproject {
public static void main(String[] args)
{
Scanner pr = new Scanner(System.in);
System.out.println("vvedit text:");
String[] text = pr.nextLine().split(" ");
String result = "";
for (int i = text.length - 1; i >= 0; i--)
{
     for (int j = text[i].length() - 1; j >= 0; j--)
     {
           result += text[i].substring(j, j+1); 
     }
     result += " ";
}
 
System.out.println("perevernute slovo:" + result);
}
}