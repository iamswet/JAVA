package E229;

public class variables {
	String name;
	String des;
	int quantity;
	double price;
	
	variables(String a, String b,int c, double d){
		name=a;
		des=b;
		quantity=c;
		price=d;
	}
	
	void set_name(String x) {
		this.name=x;
		
	}
	
	String get_name(){
		return name;
	}
	void set_des(String x) {
		this.des=x;
		
	}
	
	String get_des(){
		return name;
	}
	void set_quantity(int x) {
		this.quantity=x;
		
	}
	
	int get_quantity(){
		return quantity;
	}
	
	void set_price(double x) {
		this.price=x;
		
	}
	
	double get_price(){
		return price;
	}
	
	double getInvoiceAmount(int quantity, double price) {
		if(quantity<0) {
			return 0.0;
		}
		
		double amount = quantity*price;
		return amount;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		variables in=new variables("Mayank","Agarwal",10,52.4);
		
	}

}
