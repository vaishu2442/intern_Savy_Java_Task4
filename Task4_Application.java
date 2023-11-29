package java_task;

import java.util.Scanner;

public class Task4_Application {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Task4_02 task=new Task4_02();
		for(;;)
		{
		System.out.println("1.create 2.read 3.update 4.delete 5.end");
		switch(sc.nextInt())
		{
		case 1:task.create();
		break;
		case 2:task.read();
		break;
		case 3:task.update();
		break;
		case 4:task.delete();
		break;
		case 5:System.exit(0);
		break;
		default:
			System.out.println("invalid choice......");
		}
		}

	}

}
