package Connector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Db_Database.DbConnection;

public class DbSample {
	Connection con;
	public DbSample(){
		con=DbConnection.db();
	}
	

	public void insert(int id,String name,String Phone_No,String age){
		try{
			PreparedStatement pd=con.prepareStatement("Insert into student1(id,name,Phone_No,age)values(?,?,?,?)");
		pd.setInt(1, id);
		pd.setString(2, name);
		pd.setString(3,Phone_No);
		pd.setString(4,age);
		pd.executeUpdate();
		
		
		}catch(Exception e){
			System.out.println(e);
		}
		
	}
	public void select(String name,String age){
		try{
			PreparedStatement pd=con.prepareStatement("select * from student1 where name = '" + name + "' " + "and age = '" + age + "' ");
			ResultSet rs= pd.executeQuery();
			while(rs.next()){
				int id=rs.getInt(1);
				String name1=rs.getString(2);
				String Ph_n=rs.getString(3);
				String a=rs.getString(4);
				System.out.println("values are:"+id);
				
			}
		}catch (Exception e){
			System.out.println(e);
		} 
	}
	public void delete(int id){
		try{
			PreparedStatement pd=con.prepareStatement("delete from student1 where id='"+id+ "'");
			pd.executeUpdate();
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public void update(int id,String Phone_No){
		try {
			PreparedStatement pd = con.prepareStatement("update student1 set Phone_No='"+Phone_No+"' "
															+"where id='"+id+"' ");
			int i = pd.executeUpdate();

			if(i>0) {
				System.out.println("Successful");
			}else {
				System.out.println("check with your query");
			}

		}catch (Exception e) {
			System.out.println(e);
		}
}}
