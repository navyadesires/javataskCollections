package CollectionsCrud;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomerOperations {

	Scanner sc = new Scanner(System.in);
	ArrayList<Customer> customerList = new ArrayList<Customer>();
	Customer c = null;
	public void addCustomer(Customer c) {
		customerList.add(c);
	}
	
	public void showCustomers() {
		System.out.println("List of customers......");
		System.out.println("==================================================================");
		System.out.println("customerId" +"\t"+ "customerName"+"\t"+"customerEmail"+"\t"+"customerPhn");
		System.out.println("==================================================================");
		for(int i = 0;i<customerList.size();i++) {
				System.out.println(customerList.get(i).getCustomerId()
						+ "\t\t" + customerList.get(i).getCustomerName()
						+ "\t\t" + customerList.get(i).getCustomerEmail()
						+ "\t\t" + customerList.get(i).getCustomerPhn());
		}
	}
	public Customer readProductDetails(Customer c) {
		
		System.out.println("Enter the Customer details");
		System.out.println("Enter the Customer id");
		sc.nextLine();
		c.setCustomerId(sc.nextLine());
		System.out.println("Enter the Customer name");
		c.setCustomerName(sc.nextLine());
		System.out.println("Enter the Customer Email");
		c.setCustomerEmail(sc.nextLine());
		System.out.println("Enter the Customer Phone number");
		c.setCustomerPhn(sc.nextLine());
		return c;
		
	}
	
	public Customer findCustomerById(String cid) {
		Customer c12 = new Customer(cid, cid, cid, cid);
		for(int i = 0;i<customerList.size();i++) {
			if((customerList.get(i).getCustomerId().equals(cid))) {
				c12 = customerList.get(i);
			}
		}
		return c12;
		
	}
	
	public String removeProduct(Customer cu) {
		if(customerList.remove(cu)) {
			return "Customer removed successfully";
		}else {
			return "no customer found to remove";
		}
	}
	
	public void showProductOperations() {
		char ch = 'y';
		while (ch=='y') {
			
			System.out.println("Enter the option number .....");
			System.out.println("1.to add customer");
			System.out.println("2.list all customers");
			System.out.println("3.to delete the customer");
	
			int operation = sc.nextInt();
			switch (operation) {
			case 1:
				c = new Customer(null, null, null, null);
				addCustomer(readProductDetails(c));
				break;
			case 2:
				showCustomers();
				break;
			case 3:
				System.out.println("Enter the customer id to remove...");
				String cid = sc.next();
				Customer c1 = findCustomerById(cid);
				System.out.println(removeProduct(c1));
				break;

			default:
				break;
			}
			
			System.out.println("Enter 'y' to continue the loop....");
			ch = sc.next().charAt(0);
		}
	}
}
