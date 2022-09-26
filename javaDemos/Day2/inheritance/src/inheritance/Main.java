package inheritance;

public class Main {

	public static void main(String[] args) {
		// Inheritance = miras
		
		Customer customer = new Customer();
		Employee employee = new Employee();
		
		CustomerManager customerManager = new CustomerManager();
		EmployeeManager employeeManager = new EmployeeManager();
		customerManager.List();
		employeeManager.BestEmployee();
	}

}
