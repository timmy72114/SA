/**
 * sample program for web programming written by Ben Wu
 * reference: http://www.mkyong.com/spring/maven-spring-jdbc-example/
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import entity.Customer;
import entity.Product;

public class CustomerDAODB implements CustomerDAO {
	private DataSource dataSource;
	private Connection conn = null ;
	private ResultSet rs = null ;
	private PreparedStatement smt = null ;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public List<Customer> getList(){
		String sql = "SELECT * FROM Customer";
		return getList(sql);
	}

	// make it a generic method for different conditions
	public List<Customer> getList(String sql) {
					
		List<Customer> CustomerList = new ArrayList<Customer>();
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while(rs.next()){
				Customer customer = new Customer();
				customer.setC_Id(rs.getInt("C_No"));			
				customer.setC_Name(rs.getString("C_Name"));
				customer.setC_Phone(rs.getString("C_Phone"));
				customer.setC_Cellphone(rs.getString("C_Cellphone"));
				customer.setC_Email(rs.getString("C_Email"));
				customer.setC_Address(rs.getString("C_Address"));
				customer.setC_Account(rs.getString("C_Account"));
				customer.setC_Password(rs.getString("C_Password"));
				CustomerList.add(customer);
			}
			rs.close();
			smt.close();
 
		} catch (SQLException e) {
			throw new RuntimeException(e);
 
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
		return CustomerList;
	}
		  
	public void insert(Customer customer) {

		// remove first parameter when Id is auto-increment
	    String sql = "INSERT INTO customer (C_Name, C_Phone, C_Cellphone, C_Email, C_Address, C_Account, C_Password) VALUES(?, ?, ?, ?, ?, ?, ?)";	
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, customer.getC_Name());
			smt.setString(2, customer.getC_Phone());
			smt.setString(3, customer.getC_Cellphone());
			smt.setString(4, customer.getC_Email());
			smt.setString(5, customer.getC_Address());
			smt.setString(6, customer.getC_Account());
			smt.setString(7, customer.getC_Password());
			smt.executeUpdate();			
			smt.close();
 
		} catch (SQLException e) {
			throw new RuntimeException(e);
 
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
		
	}

	public Customer get(long id) {
		Customer customer = new Customer();
		String sql = "SELECT * FROM Customer WHERE C_No = ?";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setLong(1, id);
			rs = smt.executeQuery();
			if(rs.next()){
				customer.setC_Id(rs.getInt("C_No"));
				customer.setC_Name(rs.getString("C_Name"));
				customer.setC_Phone(rs.getString("C_Phone"));
				customer.setC_Cellphone(rs.getString("C_Cellphone"));
				customer.setC_Email(rs.getString("C_Email"));
				customer.setC_Address(rs.getString("C_Address"));
				customer.setC_Account(rs.getString("C_Account"));
				customer.setC_Password(rs.getString("C_Password"));
			}
			rs.close();
			smt.close();
 
		} catch (SQLException e) {
			throw new RuntimeException(e);
 
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
		return customer;
	}
	public Customer get(String name) {
		Customer customer = new Customer();
		String sql = "SELECT * FROM Customer WHERE C_Name = ?";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, name);
			rs = smt.executeQuery();
			if(rs.next()){
				customer.setC_Id(rs.getInt("C_No"));
				customer.setC_Name(rs.getString("C_Name"));
				customer.setC_Phone(rs.getString("C_Phone"));
				customer.setC_Cellphone(rs.getString("C_Cellphone"));
				customer.setC_Email(rs.getString("C_Email"));
				customer.setC_Address(rs.getString("C_Address"));
				customer.setC_Account(rs.getString("C_Account"));
				customer.setC_Password(rs.getString("C_Password"));
			}
			rs.close();
			smt.close();
 
		} catch (SQLException e) {
			throw new RuntimeException(e);
 
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
		return customer;
	}
	
	public void update(Customer customer) {
		
		String sql = "UPDATE product SET C_Name=?, C_Phone=?, C_Cellphone=?, C_Email=?, C_Address=?, C_Account=?, C_Password=? "
				+ "WHERE customerID = ?";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, customer.getC_Name());
			smt.setString(2, customer.getC_Phone());
			smt.setString(3, customer.getC_Cellphone());
			smt.setString(4, customer.getC_Email());
			smt.setString(5, customer.getC_Address());
			smt.setString(6, customer.getC_Account());
			smt.setString(7, customer.getC_Password());
			smt.executeUpdate();			
			smt.close();
 
		} catch (SQLException e) {
			throw new RuntimeException(e);
 
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
		
	}
	
	public void delete(long id) {
		
		String sql = "DELETE FROM Customer WHERE C_No = ?";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setLong(1, id);
			smt.executeUpdate();			
			smt.close();
 
		} catch (SQLException e) {
			throw new RuntimeException(e);
 
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
	}

	public int count(){
		return 0; //no longer needed
	}

}//

