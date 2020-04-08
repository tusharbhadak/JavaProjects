/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcapp;

import java.sql.*;
/**
 *
 * @author root
 */
public class JdbcApp {
    
    Connection con;
    
    public JdbcApp()
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
        
        JdbcApp app = new JdbcApp();
      //  app.addEmployee(14,"Vimal Patel",9000.50);
      app.removeEmployee(14);
        app.getAllEmployees();
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
          
            String insert = "insert into employee values ("+ empno+",'"+ ename+ "',"+sal+")"; 
           
            Statement st = con.createStatement();
             st.executeUpdate(insert);
            
            
            
        }
        catch(SQLException sq)
        {
            sq.printStackTrace();
        }
        
        
        
        
    }
    
     void removeEmployee(int empno)      
    {
        try{
          
            String del = "delete from employee where empno="+empno; 
           
            Statement st = con.createStatement();
             st.executeUpdate(del);
            
            
            
        }
        catch(SQLException sq)
        {
            sq.printStackTrace();
        }
        
        
        
        
    }
    
    
    
}
