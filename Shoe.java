class Shoe 
{
	String brand;
	double price;
	int size;
	String type;
	String colour;
	
	Shoe(){
	}
	Shoe(String brand,double price,int size,String type,String colour){
		this.brand=brand;
		this.price=price;
		this.size=size;
		this.type=type;
		this.colour=colour;
		System.out.println("Data Member loading Sussfully.....!");
		
	}
	public void displayShoe(){
		System.out.println("Brand of Shoe: "+brand);
		System.out.println("Price of Shoe: "+price);
		System.out.println("Size Of Shoe: "+ price);
		System.out.println("Type of Shoe: "+type);
		System.out.println("Colour of Shoe"+ colour);
	}
	

}
