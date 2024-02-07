package entities;

public class OutsourcedEmployee extends Employee{
	
	private Double addCharge;
	
	public OutsourcedEmployee() {
		super();
	}
	
	public OutsourcedEmployee(String name, Integer hours, Double value, Double addDouble) {
		super(name, hours, value);
		this.addCharge = addDouble;
	}

	public Double getAddCharge() {
		return addCharge;
	}

	/*Disable the SET method to ensure data integrity
	 public void setAddCharge(Double addCharge) {
		this.addCharge = addCharge;}
	*/
	
	@Override
	public Double payment() {
		return (this.value * this.hours) + (addCharge += addCharge * 0.10);

	}

}
