package stringcollection;


	import java.util.*;



	public class stringlist {

		public static void main(String[] args) {
			int option;
			int index,i;
			String n;
			Scanner sc=new Scanner(System.in);
			ArrayList<String> str;
			
			
	
		str=new ArrayList<String>();

	while(true)
	{
		System.out.println("1. To add an string  at the end");
		System.out.println("2. To insert an string  at particular index");
		System.out.println("3. To search for a string");
		System.out.println("4. To display all the string");
		System.out.println("5. List all string starts with given letter");
		System.out.println("6. Exit");
		System.out.print("Enter your choice:");
		
		option=sc.nextInt();
		switch(option)
		{
		case 1:
			System.out.print("Enter a string:");
			n=sc.next();
			str.add(n);
			System.out.println("The given string is added at the end");
			break;
		case 2:
			System.out.print("Enter a string:");
			n=sc.next();
			System.out.print("Enter the index:");
			index=sc.nextInt();				
			str.add(index,n);
			System.out.println("The given string is added at the given index");				
			break;
		case 3:
			System.out.print("Enter a string:");
			n=sc.next();
			index=str.indexOf(n);
			if(index<0)
			{
				System.out.println("The given string is not available in the list");
			}else
			{
				System.out.printf("The string %d is found at the index %d\n",n,index);
			}
			break;
		case 4:
			System.out.println("The available string are:");
			for(i=0;i<str.size();i++)
			{
				System.out.println(str.get(i));
			}
			break;
		case 5:
			System.out.println("Enter the first letter character");
			n=sc.next();
			for(i=0;i<str.size();i++)
			{
				if(str.get(i).startsWith(n));
				{
					System.out.println(str.get(i));
				}
			}
			break;
		case 6:
			System.out.println("Thankyou for using string list application !!!");
			break;
		default:
			System.out.println("Please enter a valid string !!!");
		}
		
		if(option==5)
		{		
			break;
		}
	}

}

}


