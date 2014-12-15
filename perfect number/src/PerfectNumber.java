import java.io.*;

class PerfectNumber
{
  public static void main(String args[]) throws Exception
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
    
    
    int number = Integer.parseInt(br.readLine());
    if(isPerfectNumber(number))
    {
      System.out.println(number+" is a perfect number.");
    }
    else
    {
      System.out.println(number+" is not a perfect number.");
    }
  }
  public static boolean isPerfectNumber(int number)
  {
    int sum = 0;
    for(int i=1; i<=number; i++)
    {
      if(number%i == 0)
      {
        sum += i;
      }
    }
    if(sum/2 == number)
    {
      return true;
    }
    return false;
  }
}