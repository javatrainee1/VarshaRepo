package Configure;

import java.util.Scanner;

import Connector.DbSample;
import Db_Database.DbConnection;

public class MainClass {

	public static void main(String[] args) {
		int id;
		String name;
		String Phone_No;
		String age;
		Scanner sn=new Scanner(System.in);
		DbConnection.db();
		DbSample obj=new DbSample();
		System.out.println("1.for insert values in table");
		System.out.println("2.for select query");
		System.out.println("3.for delete:");
		System.out.println("4.for update:");
		System.out.println("5.Exit");
		System.out.println("Enter your choice:");
		int select=sn.nextInt();
		
		switch(select){
		
		case 1:
			System.out.println("Enter id:");
			id=sn.nextInt();
			System.out.println("Enter name:");
			name=sn.next();
			System.out.println("Enter Phone number:");
			Phone_No=sn.next();
			System.out.println("Enter age:");
			age=sn.next();
			
			obj.insert(id, name, Phone_No, age);
			break;
			
		case 2:
			System.out.println("Enter name:");
			name=sn.next();
			System.out.println("Enter age:");
			age=sn.next();
			
			obj.select(name,age);
			break;
			
		case 3:
			System.out.println("Enter id:");
			id=sn.nextInt();
			
			obj.delete(id);
			break;
			
		case 4:
			System.out.println("enter id:");
			id=sn.nextInt();
			System.out.println("Enter Phone number:");
			Phone_No=sn.next();
			
			obj.update(id, Phone_No);
			break;
		
		case 5:
			System.out.println("thank you.....");
		}
		
		// TODO Auto-generated method stub

	}

}
