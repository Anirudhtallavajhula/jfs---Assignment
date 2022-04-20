package main.Q5;

import java.sql.SQLException;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Q5")
public class Q5main {
	EmployeeDB n = new EmployeeDB();
	// Get All Employees : 
	 @RequestMapping("/all")
	 public List<Employee> getemployee() throws Exception  {
		 List<Employee> i = n.getDetails();
		 return  i ;
	}
	
	 @RequestMapping("/employees/{id}") 
	 public Employee getEmp(@PathVariable int id) throws SQLException {
		 return n.getEmp(id);
	 }
		  
	 @RequestMapping(value="/addemployee", method=RequestMethod.POST)
	 //@PostMapping("/addemployee")
	 public Employee addEmployee(@RequestBody Employee emp) throws SQLException{
		 return n.addEmployee(emp);
     }
	 
	 @RequestMapping(value="/employee/{id}", method=RequestMethod.DELETE)
	 //@DeleteMapping("/employee/{id}")
	 public void deleteEmployee(@PathVariable int id) throws Exception{
		 n.deleteEmployee(id);
	 }

	 @RequestMapping(value="/employee", method=RequestMethod.PUT)
	 //@PutMapping("/employee")
	 public  Employee updateEmployee(@RequestBody Employee emp) throws SQLException{
		 return n.updateEmployee(emp);
	 } 
}