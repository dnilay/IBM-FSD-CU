package comm.example.delegate;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StudentServiceDelegate {
	
	RestTemplate restTemplate;
	
	@Autowired
	public StudentServiceDelegate(RestTemplate restTemplate) {
		super();
		this.restTemplate = restTemplate;
	}

	public String callStudentServiceAndGetData(String schoolname) {
		System.out.println("Consul Demo - Getting School details for " + schoolname);
		String response = restTemplate.exchange("http://localhost:8010/getStudentDetailsForSchool/{schoolname}", HttpMethod.GET, null, new ParameterizedTypeReference<String>() {
		}, schoolname).getBody();
		

		System.out.println("Response Received as " + response + " -  " + new Date());

		return "School Name -  " + schoolname + " :::  Student Details " + response + " -  " + new Date();
	}
		

			
	
	
}
