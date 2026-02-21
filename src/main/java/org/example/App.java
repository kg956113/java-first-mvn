package org.example;

import com.springcore.ref.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)
    {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("contextRef.xml");
//*****uncoment for contextRef.xml
        A temp =(A)context.getBean("aref");
        System.out.println(temp.getX());
        System.out.println(temp.getOb().getY());
        System.out.println(temp);



//***** uncomment for contextCollectionInj.xml
//       Employee Emp1= context.getBean("Emp1",Employee.class);
//        System.out.println(Emp1.getName());
//        System.out.println(Emp1.getPhones());
//        System.out.println(Emp1.getAddresses());
//        System.out.println(Emp1.getCourses());
//
       /*
       ****** uncomment for context.xml*********
       Student std1 =
                context.getBean("student1", Student.class);
        Student std2 =
                context.getBean("student2", Student.class);
        System.out.println(std1);
        System.out.println(std2);

        */



        // Database details
//      String url = "jdbc:mysql://localhost:8080/college";
//        String username = "root";
//        String password = "root@123";
//
//        try {
//            // 1. Establish connection
//            Connection con = DriverManager.getConnection(url, username, password);
//
//            // 2. Create statement
//            Statement stmt = con.createStatement();
//
//            // 3. Execute query
//            String sql = "SELECT * FROM student";
//            ResultSet rs = stmt.executeQuery(sql);
//
//            // 4. Process result
//            while (rs.next()) {
//                System.out.println(
//                        rs.getInt("id") + "  " +
//                                rs.getString("name") + "  " +
//                                rs.getInt("age")
//                );
//            }
//
//            // 5. Close resources
//            rs.close();
//            stmt.close();
//            con.close();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }
}
