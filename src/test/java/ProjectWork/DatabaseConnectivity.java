package ProjectWork;

import org.testng.annotations.Test;
import java.sql.*;

	public class DatabaseConnectivity {
	  public void insertData(String emailId,String productTitle,float price) {

				// TODO Auto-generated method stub

				System.out.println("Connect to DB");

				try {Class.forName("com.mysql.cj.jdbc.Driver");

					Connection con =

				DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","root@123");
					Statement Orderstmt=con.createStatement();	

					ResultSet rs =Orderstmt.executeQuery("select max(order_ID) from order_details");
                     int orderId =1;
					while(rs.next())

					{
						orderId= rs.getInt(1);
						
					}
			PreparedStatement stmt=con.prepareStatement("insert into order_details(Order_ID,Customer_Email_ID,Product_Title,Product_Price) values(?,?,?,?)");
               
               stmt.setInt(1, orderId+1);
               stmt.setString(2, emailId);
               stmt.setString(3,productTitle);
               stmt.setFloat(4, price);
                

               int rowNum=stmt.executeUpdate();
               if (rowNum > 0) {
            	   System.out.println("Saved order details for Email ID : "+ emailId);
               }
				con.close();

				} catch (Exception e) {

					System.out.println("Got an exception");

					System.out.println(e);

				}

			}

		}


