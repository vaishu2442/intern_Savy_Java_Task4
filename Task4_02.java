package java_task;

import java.util.Scanner;

public class Task4_02 extends Task1 {
	Task4 t4;
	Scanner sc=new Scanner(System.in);
	public void create()
	{
		if(t4==null)
		{
			System.out.println("enter id");
			int id=sc.nextInt();
			System.out.println("enter name");
			String name=sc.next();
			System.out.println("enter age");
			int age=sc.nextInt();
			System.out.println("enter mob");
			long mob=sc.nextLong();
			t4=new Task4(id,name,age,mob);
			System.out.println("User added succesfully......");
		}
		else
		{
			System.out.println("user alrady added");
		}
	}
	public void read()
	{
		if(t4!=null)
		{
			System.out.println(t4.getId());
			System.out.println(t4.getName());
			System.out.println(t4.getAge());
			System.out.println(t4.getMob());
			
		}
		else
		{
			System.out.println("user already added");
		}
	}
	public void update()
	{
		if(t4!=null)
		{
	System.out.println("1.id 2.name 3.age 4.mob");
	switch(sc.nextInt())
	{
	case 1:System.out.println("enter new id");
	int id=sc.nextInt();
	t4.setId(id);
	System.out.println("id updated succesfully");
	break;
	case 2:System.out.println("enter new name");
	String name=sc.next();
	t4.setName(name);
	System.out.println("name updated succesfully");
	break;
	case 3:System.out.println("enter new age");
	int age=sc.nextInt();
	t4.setAge(age);
	System.out.println("name updated succesfully");
	break;
	case 4:System.out.println("enter new name");
	int mob=sc.nextInt();
	t4.setMob(mob);
	System.out.println("mob updated succesfully");
	break;
	default:
		System.out.println("invalid choice");
	}
		}
		else
		{
			System.out.println("add user first");
		}
	}
	public void delete()
	{
		if(t4!=null)
		{
			t4=null;
			System.out.println("user is deleted");
		}
		else
		{
			System.out.println("user already deleted");
		}
		
	}
	

}
