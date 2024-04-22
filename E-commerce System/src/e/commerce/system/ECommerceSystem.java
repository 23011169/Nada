
package e.commerce.system;

import java.util.Scanner;
public class ECommerceSystem {
	public static void main (String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the E-Commerse System!");
        System.out.println("Please enter your id: ");
        int customerId= Math.abs(input.nextInt()
        	);
        input.nextLine();
        System.out.println("Please enter your name:");
        String name = input.nextLine();
        System.out.println("Please enter your address:");
        String address=input.nextLine();
        Customer2 customer = new Customer2(customerId,name,address);
        System.out.println("How many products do you want to add to your cart ?");
        int nProducts = Math.abs(input.nextInt());
        input.nextLine();
        Cart2 cart= new Cart2(customerId,nProducts);
        for(int i = 0; i < nProducts ; i++){
        	System.out.print("Which product would you like to add?");
        	System.out.print("1- SmartPhone");
        	System.out.print("2- T-Shirt");
        	System.out.println("3- OOP");
       int choice = input.nextInt();
       input.nextLine();
                    switch (choice) {
                        case 1:
                            {
                              ElectronicProduct2 E = new ElectronicProduct2(1,"SmartPhone",599.99f,"Samsung",1);
                                cart.addProduct( E , i);
                                break;
                            }
                        case 2:
                            {
                             ClothingProduct2 C   = new ClothingProduct2(2,"T-Shirt",19.99f,"Medium","Cotton");
                                cart.addProduct( C , i );
                                break;
                            }
                        case 3:
                            {
                              BookProduct2 B   = new BookProduct2 (3,"OOP",39.99f,"O'Reilly","X Publications");
                                cart.addProduct( B , i);
                                break;
                            }
                        default:
                            System.out.println("Invaild choice!");
                            break;
                    }
        }
        System.out.print("Your total is $"+ cart.calculatePrice()+".");
        System.out.println("  Would you like to place the Order ? 1-Yes  2-No");
        int OrderChoice = input.nextInt();
             input.nextLine();    
        cart.placeOrder(OrderChoice);   
       	}
       	}

