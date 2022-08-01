package classandobject18522;

public class caracc {
int id ,year,price,installment;
String name,brandname,payment;
int getid() {
	return id;
}
void setId(int id) {
	
	this.id=id;
}

void setYear(int year) {
	
	this.year=year;
}
int getyear() {
	return year;
}
void setPrice(int price) {
	
	this.price=price;
}
int getprice() {
	return price;
}
void setInstallment(int installment) {
	
	this.installment=installment;
}
int getinstallment() {
	return installment;
}
void setName(String name) {
	
	this.name=name;
}
String getname() {
	return name;
}
void setbrandname(String brandname) {
	
	this.brandname=brandname;
}
String getbrandname() {
	return brandname;
}
void setPayment(String payment) {
	
	this.payment=payment;
}
String getpayment() {
	return payment;
}


public String toString() {
	
	return id+" "+name+" "+brandname+" "+year+" "+price+" "+installment+" "+payment;
}
	
}
