package entities;

public class OutsourcedEmployee extends Employee{
	
	private Double additionalCharge;
	
	public OutsourcedEmployee() {
		super();
	}
	
	public OutsourcedEmployee(String name, Integer hours, Double value, Double addDouble) {
		super(name, hours, value);
		this.additionalCharge = addDouble;
	}

	public Double getAddCharge() {
		return additionalCharge;
	}

	/*Disable the SET method to ensure data integrity
	 public void setAddCharge(Double addCharge) {
		this.addCharge = addCharge;}
	*/
	
	@Override
	public Double payment() {
		return (this.value * this.hours) + (additionalCharge += additionalCharge * 0.10);

	}
	
	@Override
	public String toString() {
		return super.toString() + " | Additional Charge: " + additionalCharge + " (((OUTSOURCED EMPLOYEE)))";
	}

}
