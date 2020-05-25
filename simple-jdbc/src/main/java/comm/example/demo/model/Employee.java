package comm.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Employee {

	private String employeeID;
	private String firstName;
	private String lastName;
	private String email;
	public Employee(String employeeID, String firstName, String lastName, String email) {
		super();
		this.employeeID = employeeID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	public String getDetails()
	{
		return "id: "+employeeID+" first_name: "+firstName+" last_name: "+lastName+" email:"+email;
	}
}
