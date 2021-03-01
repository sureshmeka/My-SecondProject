package exceptions;

import java.util.Scanner;

public class UserDefineException extends Exception
{

	public UserDefineException(String string) 
	{
		super(string);
	}

	public static void main(String[] args) 
	{
		String str;
		Scanner sc = new Scanner(System.in);
		
		
		while (true) 
		{
			System.out.println("Enter the 10 character String : ");
			str = sc.next();
			try 
			{
				if (str.length() != 10) 
				{
					throw new UserDefineException("It should be 10 character String...");
				}
				else
				{
					System.out.println(str);
					break;
				}
			} 
			catch (UserDefineException e) 
			{
				e.printStackTrace();
			} 
		}

	}

}
