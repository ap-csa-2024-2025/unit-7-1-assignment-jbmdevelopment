import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String input = "";
    ArrayList<String> arr = new ArrayList<String>();

    while (!input.equals("STOP"))
    {
      input = sc.nextLine();
      arr.add(input);
      System.out.println("infinite loop! replace with your code");
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
