package com.demo.HibernetProject;
import java.io.IOException;
import org.hibernate.Session;
import java.util.Date;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.io.FileInputStream;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	System.out.println( "Project staretd" );
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        
        Session session =factory.getCurrentSession();
        System.out.println(factory.isClosed());
        
        // StudentEntity st=new StudentEntity("Varsha","Sangli");
        //System.out.println(st);
        //session.beginTransaction();
        //session.save(st);
        //session.getTransaction().commit();
        //session.close(); 
   
FileInputStream fis = new FileInputStream("src/main/java/logo.png");
byte[] data = new byte[fis.available()];
fis.read(data);


Address add = new Address();
 add.setImage(data);
 add.setCity("Chandigadh");
 add.setHouseNo(23.33);
 add.setOpen(true);
 add.setStreet("GTB Nagar");
 add.setAdd_Date(new Date());
 
 session.beginTransaction();
 
 session.save(add);
    }
}