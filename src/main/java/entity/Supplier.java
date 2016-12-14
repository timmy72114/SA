package entity;

public class Supplier {
private long Supplier_Id;		//供應商編號
private String Supplier_Name;	//供應商名稱
private String Supplier_Phone;	//供應商電話
private String Supplier_Address;//供應商地址
private String Supplier_Email;	//供應商信箱
public long getSupplier_Id() {
	return Supplier_Id;
}
public void setSupplier_Id(long supplier_Id) {
	Supplier_Id = supplier_Id;
}
public String getSupplier_Name() {
	return Supplier_Name;
}
public void setSupplier_Name(String supplier_Name) {
	Supplier_Name = supplier_Name;
}
public String getSupplier_Phone() {
	return Supplier_Phone;
}
public void setSupplier_Phone(String supplier_Phone) {
	Supplier_Phone = supplier_Phone;
}
public String getSupplier_Address() {
	return Supplier_Address;
}
public void setSupplier_Address(String supplier_Address) {
	Supplier_Address = supplier_Address;
}
public String getSupplier_Email() {
	return Supplier_Email;
}
public void setSupplier_Email(String supplier_Email) {
	Supplier_Email = supplier_Email;
}
}