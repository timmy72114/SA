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

import entity.Product;
import entity.Supplier;
public abstract class ProductDAODB implements ProductDAO {
	private DataSource dataSource;
	private Connection conn = null ;
	private ResultSet rs = null ;
	private PreparedStatement smt = null ;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public List<Product> getList(){
		String sql = "SELECT * FROM Product";
		return getList(sql);
	}

	// make it a generic method for different conditions
	public List<Product> getList(String sql) {
					
		List<Product> productList = new ArrayList<Product>();
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while(rs.next()){
				Product aProduct = new Product();
				Supplier aSupplier = new Supplier();
				aProduct.setP_Id(rs.getLong("P_ID"));
				aSupplier.setSupplier_Id(rs.getLong("Supplier_ID"));
				aProduct.setP_Name(rs.getString("P_Name"));
				aProduct.setP_Description(rs.getString("P_Description"));
				aProduct.setP_Quantity(rs.getInt("P_Quantity"));
				aProduct.setP_Safe(rs.getInt("P_Safe"));
				aProduct.setP_Size(rs.getString("P_Size"));
				aProduct.setP_Color(rs.getString("P_Color"));
				aProduct.setP_Price(rs.getInt("P_Price"));
				aProduct.setP_Category(rs.getString("P_Category"));
				aProduct.setP_Discount(rs.getInt("P_Discoumt"));
				productList.add(aProduct);
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
		return productList;
	}
		  
	public void insert(Product aProduct,Supplier aSupplier) {

		// remove first parameter when Id is auto-increment
	    String sql = "INSERT INTO product (P_Name, P_Description, P_Quantity, P_Safe, P_size, P_Color, P_Price, P_Categoryr, P_Discount, Supplier_ID) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";	
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, aProduct.getP_Name());
			smt.setString(2, aProduct.getP_Description());
			smt.setInt(3, aProduct.getP_Quantity());
			smt.setInt(4, aProduct.getP_Safe());
			smt.setString(5, aProduct.getP_Size());
			smt.setString(6, aProduct.getP_Color());
			smt.setInt(7, aProduct.getP_Price());
			smt.setString(8, aProduct.getP_Category());
			smt.setInt(9, aProduct.getP_Discount());
			smt.setLong(10,aSupplier.getSupplier_Id() );
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

	public Product get(long id) {
		Product aProduct = new Product();
		Supplier aSupplier = new Supplier();
		String sql = "SELECT * FROM Product WHERE P_No = ?";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setLong(1, id);
			rs = smt.executeQuery();
			if(rs.next()){
				aProduct.setP_Id(rs.getLong("P_No"));
				aProduct.setP_Name(rs.getString("P_Name"));
				aProduct.setP_Description(rs.getString("P_Description"));
				aProduct.setP_Quantity(rs.getInt("P_Quantity"));
				aProduct.setP_Safe(rs.getInt("P_Safe"));
				aProduct.setP_Size(rs.getString("P_Size"));
				aProduct.setP_Color(rs.getString("P_Color"));
				aProduct.setP_Price(rs.getInt("P_Price"));
				aProduct.setP_Category(rs.getString("P_Category"));
				aProduct.setP_Discount(rs.getInt("P_Discount"));
				aSupplier.setSupplier_Id(rs.getLong("Supplier_Id"));
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
		return aProduct;
	}
	
	public void update(Product aProduct,Supplier aSupplier) {
		
		String sql = "UPDATE Product SET (P_Name=?, P_Description=?, P_Quantity=?, P_Safe=?, P_size=?, P_Color=?, P_Price=?, P_Categoryr=?, P_Discount=?, Supplier_ID=?"
				+ " WHERE P_No = ?";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, aProduct.getP_Name());
			smt.setString(2, aProduct.getP_Description());
			smt.setInt(3, aProduct.getP_Quantity());
			smt.setInt(4, aProduct.getP_Safe());
			smt.setString(5, aProduct.getP_Size());
			smt.setString(6, aProduct.getP_Color());
			smt.setInt(7, aProduct.getP_Price());
			smt.setString(8, aProduct.getP_Category());
			smt.setInt(9, aProduct.getP_Discount());
			smt.setLong(10, aSupplier.getSupplier_Id());
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
		
		String sql = "DELETE FROM Product WHERE P_No = ?";
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


public Product get(Product aProduct,Supplier aSupplier) {
		
		String sql = "SELECT * FROM Product WHERE P_No = ?";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setLong(1, aProduct.getP_Id());
			rs = smt.executeQuery();
			if(rs.next()){
				aProduct.setP_Id(rs.getLong("P_No"));
				aProduct.setP_Name(rs.getString("P_Name"));
				aProduct.setP_Description(rs.getString("P_Description"));
				aProduct.setP_Quantity(rs.getInt("P_Quantity"));
				aProduct.setP_Safe(rs.getInt("P_Safe"));
				aProduct.setP_Size(rs.getString("P_Size"));
				aProduct.setP_Color(rs.getString("P_Color"));
				aProduct.setP_Price(rs.getInt("P_Price"));
				aProduct.setP_Category(rs.getString("P_Category"));
				aProduct.setP_Discount(rs.getInt("P_Discount"));
				aSupplier.setSupplier_Id(rs.getLong("Supplier_Id"));
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
		return aProduct;
	}
public List<Product> getAvailableList() {
	String sql = "SELECT * FROM product WHERE Inventory > 0";
	return getList(sql);
}


public List<Product> getReorderList() {
	String sql = "SELECT * FROM product WHERE Inventory < ReorderPoint";
	return getList(sql);
}
	

}//ProductDAOBean

