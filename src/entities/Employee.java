package entities;

public class Employee {
	
	private String name;
	protected Integer hours;
	protected Double value;
	
	public Employee() {
		super();
		
	}
	
	public Employee (String name, Integer hours, Double value) {
		super();
		this.name = name;
		this.hours = hours;
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
		
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
	public Double payment() {
		return this.value * this.hours;
	}

}
