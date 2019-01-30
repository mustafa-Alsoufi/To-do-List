package to_do_list;

import java.util.ArrayList;
import java.util.Scanner;

public class toDo {
	public static void main(String[] args) 
{
	    ArrayList<String> list = new ArrayList<String>();

		System.out.println("Main Menu\n\n0. Exit the program.\n1. Display the to-do list.\n2. Add item to to-do list.\n3. Remove item from to-do list.\n4. Update to");
		System.out.print("Enter a choice: ");
	    Scanner num = new Scanner(System.in);
		int i = num.nextInt();
		while(i != 0)
		{
			
			switch (i)
			{
			case 1:
			{
				if(list.size() == 0)
				{
					System.out.println("To-do List:\n");
					break;
				}
				else
				{
				System.out.println("To-do List:\n");

				for (int j=1;j<list.size()+1;j++)
				{
				    System.out.println(j +". "+ list.get(j-1));
		
				}
				System.out.println();
			    break;
				}
			}
			case 2:
			{
				System.out.print("\nAdd New Task: ");
				Scanner s = new Scanner(System.in);
			    String input = s.nextLine();
			    list.add(input);
			    break;
			}
			case 3:
			{
				System.out.println("To-do List:\n");

				for (int j=1;j<list.size()+1;j++)
				{
				System.out.println(j +". "+ list.get(j-1));
				}
			    System.out.println();
				System.out.print("Which task you want to remove? ");
			    Scanner rm = new Scanner(System.in);
				int rmNumber = rm.nextInt();
				list.remove(rmNumber-1);
				break;
			}
			default:
				{
					System.err.println("Invalid option\n");
					break;
				}
				
			}
			System.out.println("Main Menu\n\n0. Exit the program.\n1. Display the to-do list.\n2. Add item to to-do list.\n3. Remove item from to-do list.");
			System.out.print("Enter a choice: ");
			i = num.nextInt();
		}		
}
}
