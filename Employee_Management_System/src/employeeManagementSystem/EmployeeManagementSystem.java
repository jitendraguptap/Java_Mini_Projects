package employeeManagementSystem;
import java.util.*;

public class EmployeeManagementSystem {
	  private ArrayList<Employee> employees = new ArrayList<Employee>();

	  public void addEmployee(Employee e) {
	    employees.add(e);
	  }

	  public void removeEmployee(int id) {
	    for (int i = 0; i < employees.size(); i++) {
	      Employee e = employees.get(i);
	      if (e.getId() == id) {
	        employees.remove(i);
	        break;
	      }
	    }
	  }

	  public void displayEmployees() {
	    for (Employee e : employees) {
	      System.out.println(e);
	    }
	  }
	}
