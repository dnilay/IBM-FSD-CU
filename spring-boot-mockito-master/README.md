# spring-boot-mockito
Sample spring mockito to demonstrate test methods for Controllers, Service and Repository

## About project
Test cases are present under src/test/java.
There are test cases for controllers, service and repository under resective folders.

## Requirements

* Starter web

```
<dependency>
   <groupId>org.springframework.boot</groupId>
   <artifactId>spring-boot-starter-web</artifactId>
</dependency>
    
```
* starter JPA for Hibernate
```
<dependency>
   <groupId>org.springframework.boot</groupId>
   <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
```

* starter test for junit

```
<dependency>
   <groupId>org.springframework.boot</groupId>
   <artifactId>spring-boot-starter-test</artifactId>
   <scope>test</scope>
</dependency>
```

* H2 database for saving test data in Inmemory database -- for repository test cases

```
<dependency>
   <groupId>com.h2database</groupId>
   <artifactId>h2</artifactId>
   <scope>test</scope>
   <version>1.4.194</version>
</dependency>
```

## Explanation

use @Autowired to test the current class and use @Mockbean to mock dependencies

```
public class EmployeeServiceImplIntegrationTest {

 @Autowired
 private EmployeeService employeeService;

  @MockBean
  private EmployeeRepository employeeRepository;
}
```


