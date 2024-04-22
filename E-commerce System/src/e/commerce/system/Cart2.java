
package e.commerce.system;

public class Cart2 {
    private int customerId;
    private int nProducts;
    private Product2[] products;

    public Cart2(int customerId, int nProducts) {
        this.customerId = Math.abs(customerId);
        this.nProducts = Math.abs(nProducts);
        this.products = new Product2[nProducts];
    }

    public int getcustomerId() {
        return customerId;
    }

    public void setcustomerId(int customerId) {
        this.customerId = Math.abs(customerId);
    }

    public int getnProducts() {
        return nProducts;
    }

    public void setnProducts(int nProducts) {
        this.nProducts = Math.abs(nProducts) ;
    }

    public Product2[] getproducts() {
        return products;
    }

    public void setproducts(Product2[] products) {
        this.products = new Product2[nProducts];
    }
public void addProduct (Product2 product , int index){
	 if ( index >=0 && index < nProducts ){
	products[index]=product ;
} else {
	System.out.println(" Invaild index.please enter vaild index!") ;
}
}
public void removeProduct ( int index ){
	if (index >=0 && index < nProducts ){
	products[index]=null ;
	} else {
	System.out.println(" Invaild index.please enter vaild index! ") ; 
	}
}

public float calculatePrice () {
    float totalPrice = 0;
    for (int i = 0; i < nProducts ; i++) {
            totalPrice += products[i].getPrice(); 
    }
    return totalPrice;
}
public void placeOrder (int choice) {
	Order2 order = new Order2(customerId,1,products,calculatePrice());
	switch(choice)
	 {
		case 1:
		order.printOrderInfo();
		break ;
		case 2:
		System.out.println("Order not placed.Thank you for using our E-Commerce System.");
		break ; 
	 }
	 }
	 }
