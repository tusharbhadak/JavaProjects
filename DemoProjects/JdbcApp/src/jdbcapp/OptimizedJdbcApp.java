/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcapp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author root
 */
public class OptimizedJdbcApp {
  
        
    Connection con;
    
    public OptimizedJdbcApp()
    {
        
        try{
            // loading the driver
            Class.forName("com.mysql.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root","ompandey");
             
        }
        catch(ClassNotFoundException cnf)
        {
          System.out.println("No Driver class found");
        }
        catch(SQLException se)
        {
            System.out.println("Could not connect to the database");
        }
        
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        OptimizedJdbcApp app = new OptimizedJdbcApp();
      //  app.addEmployee(14,"Vimal Patel",9000.50);
//          app.removeEmployee(14);
//        app.getAllEmployees();

        System.out.println("Gross Sal = "+ app.getGrossSal());
        System.out.println("Max Sal = "+ app.getMaxSal());

    }
    
    
    void getAllEmployees()
    {
        try{
        Statement stmt = con.createStatement();
        
        String query = "select * from employee";
        
        ResultSet rs = stmt.executeQuery(query);
        
        ResultSetMetaData meta = rs.getMetaData();
        
        for(int i=1;i<=meta.getColumnCount();i++)
           System.out.print( meta.getColumnName(i)+"\t");
    System.out.print("\n");
        
        while(rs.next())
        {
            System.out.println(rs.getString(1)+"\t"+ rs.getString(2)+ "\t"+ rs.getString(3));
            
        }
                
        }
        catch(SQLException se)
        {
            
        }
        
    }
    
   
    void addEmployee(int empno, String ename, double sal)      
    {
        try{
          
            String insert = "insert into employee values (?,?,?)";
            PreparedStatement pst = con.prepareStatement(insert);
            pst.setInt(1, 14);
            pst.setString(2, ename);
            pst.setDouble(3, sal);
          
             pst.executeUpdate();
            
            
            
        }
        catch(SQLException sq)
        {
            sq.printStackTrace();
        }
        
        
        
        
    }
    
     void removeEmployee(int empno)      
    {
        try{
          
            String del = "delete from employee where empno=?"; 
           
            PreparedStatement st = con.prepareStatement(del);
             
            st.setInt(1, empno);
            st.executeUpdate();
            
            
            
        }
        catch(SQLException sq)
        {
            sq.printStackTrace();
        }
        
        
        
        
    }
     
     
   double getGrossSal()
           
   {
       double grosssal=0.0;
       try{
          
           String callproc = "{call gross_sal(?)}";
           
           CallableStatement csmt = con.prepareCall(callproc);
           csmt.registerOutParameter(1, java.sql.JDBCType.DOUBLE);
           csmt.execute();
           
           grosssal = csmt.getDouble(1);
           
           
           
           
       }
       
      catch(SQLException sq)
      {
          sq.printStackTrace();
      }
       return grosssal;
       
   }
     
    double getMaxSal()
   {
       double maxsal =0.0;
       try{
              String callfunc = "{?=call maxsal()}";
           
           CallableStatement csmt = con.prepareCall(callfunc);
            csmt.registerOutParameter(1, java.sql.JDBCType.DOUBLE);
           csmt.execute();
           
           maxsal = csmt.getDouble(1);
         
           
       }
       
      catch(SQLException sq)
      {
          sq.printStackTrace();
      } 
   
   return maxsal;
   }
     
}
