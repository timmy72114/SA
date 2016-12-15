package entity;

public class Product {
	private long P_id;         //產品編號
	private String P_Name;     // 產品名稱
	private String P_Description;     // 產品說明
	private int P_Quantity;    // 產品數量
	private int P_Safe;		 // 安全庫存量
	private String P_Size;	 // 產品尺寸
	private String P_Color;	 // 顏色
	private int P_Price;		 // 價格
	private String P_Category; 	 //產品種類
	private int P_Discount;    //產品折扣後價格
	public long getP_Id() {
		return P_id;
	}
	public void setP_Id(long P_id) {
		this.P_id = P_id;
	}
	public String getP_Name() {
		return P_Name;
	}
	public void setP_Name(String p_Name) {
		P_Name = p_Name;
	}
	public String getP_Description() {
		return P_Description;
	}
	public void setP_Description(String p_Description) {
		P_Description = p_Description;
	}
	public int getP_Quantity() {
		return P_Quantity;
	}
	public void setP_Quantity(int p_Quantity) {
		P_Quantity = p_Quantity;
	}
	public int getP_Safe() {
		return P_Safe;
	}
	public void setP_Safe(int p_Safe) {
		P_Safe = p_Safe;
	}
	public String getP_Size() {
		return P_Size;
	}
	public void setP_Size(String p_Size) {
		P_Size = p_Size;
	}
	public String getP_Color() {
		return P_Color;
	}
	public void setP_Color(String p_Color) {
		P_Color = p_Color;
	}
	public int getP_Price() {
		return P_Price;
	}
	public void setP_Price(int p_Price) {
		P_Price = p_Price;
	}
	public String getP_Category() {
		return P_Category;
	}
	public void setP_Category(String p_Category) {
		P_Category = p_Category;
	}
	public int getP_Discount() {
		return P_Discount;
	}
	public void setP_Discount(int p_Discount) {
		P_Discount = p_Discount;
	}


}
