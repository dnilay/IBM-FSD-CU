package comm.example.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

import lombok.Data;

@Entity
@Table(name = "STUDENT_TABLE")
@Data
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_naem")
	private String lastName;
	@Column(name = "email")
	private String email;
	@Enumerated(EnumType.STRING)
	@Column(name = "stream")
	private Stream stream;
	@Embedded
	private Address address;
	public Student(String firstName, String lastName, String email, Stream stream, Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.stream = stream;
		this.address = address;
	}

}
