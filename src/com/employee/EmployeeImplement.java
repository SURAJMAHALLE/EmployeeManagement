package com.employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeImplement implements EmployeeInterface {
	Connection con;

    @Override
    public void AddEmployee(Employee emp) {
       con =EmployeeDB.createDBConnetion();
       String query="insert into employee values(?,?,?,?)";
       try{
           PreparedStatement pstm=con.prepareStatement(query);
           pstm.setInt(1,emp.getId());
           pstm.setString(2,emp.getName());
           pstm.setDouble(3,emp.getSalary());
           pstm.setInt(4,emp.getAge());
           pstm.setString(5, getCity());
          int cnt= pstm.executeUpdate();
          if(cnt!=0)
              System.out.println("Employee Inserted Successfully !!!");


       }catch (Exception ex){
           ex.printStackTrace();
       }

    }

    private String getCity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
    public void ShowEmployee() {
        con=EmployeeDB.createDBConnetion();
        String query="select * from employee";
        System.out.println("Employee Details :");
        System.out.println("---------------------------------------------");

        System.out.format("%s\t%s\t%s\t%s\n","ID","Name","Salary","age");
        System.out.println("---------------------------------------------");

        try{
            Statement stmt=con.createStatement();
            ResultSet result= stmt.executeQuery(query);
            while (result.next()){
                System.out.format("%d\t%s\t%f\t%d\n",
                        result.getInt(1),
                        result.getString(2),
                        result.getDouble(3),
                        result.getInt(4),
                        result.getString(5));
                System.out.println("---------------------------------------------");

            }

        }catch (Exception ex){
            ex.printStackTrace();
        }

    }

    @Override
    public void ShowEmployeeBasedOnId(int id11) {
        con=EmployeeDB.createDBConnetion();
        String query="select * from employee where id="+id11;
        try{
            Statement stmt=con.createStatement();
           ResultSet result= stmt.executeQuery(query);
            while (result.next()){
                System.out.format("%d\t%s\t%f\t%d\n",
                        result.getInt(1),
                        result.getString(2),
                        result.getDouble(3),
                        result.getInt(4),
                        result.getString(5));
            }

        }
        catch (Exception ex){
            ex.printStackTrace();
        }

    }

    @Override
    public void UpdateEmployee(int id111, String name1, String city1, int age1, double salary1, long phoneNo1) {
        con=EmployeeDB.createDBConnetion();
        String query="update employee set name=? where id=?";
        try{
            PreparedStatement pstm=con.prepareStatement(query);
            pstm.setString(1,name1);
            pstm.setInt(2,id111);
            int cnt=pstm.executeUpdate();
            if(cnt!=0)
                System.out.println("Employee Details updated successfully !!");

        }catch (Exception ex){
            ex.printStackTrace();
        }

    }

    @Override
    public void DeleteEmployee(int id1111) {
        con=EmployeeDB.createDBConnetion();
        String query="delete from employee where id=?";
        try{
            PreparedStatement pstm=con.prepareStatement(query);
            pstm.setInt(1,id1111);
           int cnt= pstm.executeUpdate();
           if(cnt!=0)
               System.out.println("Employee Deleted Successfully!!! "+id1111);

        }catch (Exception ex){
            ex.printStackTrace();
        }


    }

	@Override
	public void UpdateEmployee(int id111, String name1, String city1, int age1, double salary1) {
		// TODO Auto-generated method stub
		
	}
}
