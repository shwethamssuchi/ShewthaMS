package Com.gl.emailapp.service;

import Com.gl.emailapp.model.Employee;

public interface credentialservice {
	
	public String passwordGreneartor();
	
	public String emailGeneartor(Employee employee, String depatment);
	
	public void displayCredentials(Employee emp, String department);
	
	
	
	

}
