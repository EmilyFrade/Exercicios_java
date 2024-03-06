package entities;

public class Employee {
	private Integer ID;
	private String name;
	private Double salary;
	
	public Employee(Integer iD, String name, Double salary) {
		ID = iD;
		this.name = name;
		this.salary = salary;
	}

	public Integer getID() {
		return ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}
	
	public void increaseSalary(double percentage) {
		this.salary += salary * percentage / 100;
	}
}
