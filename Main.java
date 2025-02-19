import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String input = "";
    ArrayList<String> arr = new ArrayList<String>();
   System.out.println("Say something, say STOP to end the code");
    while (!input.equals("STOP"))
    {
      input = sc.nextLine();
      if(!input.equals("STOP")) {
        arr.add(input);
      }
    }
    System.out.println(arr.size());
    System.out.println(arr);
    if(arr.size() > 2) {
      arr.set(arr.size() - 1, arr.get(0));
      arr.remove(0);
    }
    System.out.println(arr);
  }
}
