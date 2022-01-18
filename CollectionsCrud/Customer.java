package CollectionsCrud;

public class Customer {

	private String customerId;
	private String customerName;
	private String customerEmail;
	private String customerPhn;
	public Customer(String customerId, String customerName, String customerEmail, String customerPhn) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerPhn = customerPhn;
	}
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerPhn() {
		return customerPhn;
	}
	public void setCustomerPhn(String customerPhn) {
		this.customerPhn = customerPhn;
	}
	@Override
	public String toString() {
		return "CustomerOperations [customerId=" + customerId + ", customerName=" + customerName + ", customerEmail="
				+ customerEmail + ", customerPhn=" + customerPhn + "]";
	}
	
}
