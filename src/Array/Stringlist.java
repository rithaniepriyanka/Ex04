/*****
 * To create a program for String List
 * created by Rositha V
 * rosithav1@gmail.com
 */


package Array;


import java.util.*;



public class Stringlist {

public static void main(String[] args) {
int option;
String n;
int index;
int i;
String a;
Scanner sc=new Scanner(System.in);
ArrayList<String> nums;


nums=new ArrayList();

while(true)
{
System.out.println("1. To add an String at the end");
System.out.println("2. To insert an String at particular index");
System.out.println("3. To search for a String");
System.out.println("4. To display with letter");
System.out.println("5. display all");
System.out.println("6. Exit");
System.out.print("Enter your choice:");

option=sc.nextInt();
switch(option)
{
case 1:
System.out.print("Enter a String:");
n=sc.next();
nums.add(n);
System.out.println("The given String is added at the end");
break;
case 2:
System.out.print("Enter a String:");
n=sc.next();
System.out.print("Enter the index:");
index=sc.nextInt();
nums.add(index,n);
System.out.println("The given String is added at the given index");
break;
case 3:
System.out.print("Enter a String:");
n=sc.next();
index=nums.indexOf(n);
if(index<0)
{
System.out.println("The given String is not available in the list");
}else
{
System.out.printf("The String %s is found at the index %s\n",n,index);
}
break;
case 4:
System.out.println("Enter a letter");
a=sc.next();

for(i=0;i<nums.size();i++)
{
  if(nums.get(i).startsWith(a))
{
System.out.println(nums.get(i));
}

}
break;
case 5:
System.out.println("The available strings are:");
for(i=0;i<nums.size();i++)
{
System.out.println(nums.get(i));
}
break;


case 6:
System.out.println("Thankyou for using number list application !!!");
break;
default:
System.out.println("Please enter a valid Sting!!!");
}

if(option==6)
{
break;
}
}

}


}