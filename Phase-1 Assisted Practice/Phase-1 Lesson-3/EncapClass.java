package APracticeL3;

public class EncapClass {

	private double Seccode;
	private String branch_name;
	private double branch_code;
	private String dept_name;
	private double dept_code;
	
	public double getSeccode() {
		return Seccode;
	}

	public void setSeccode(double seccode) {
		Seccode = seccode;
	}

	public String getBranch_name() {
		return branch_name;
	}

	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}

	public double getBranch_code() {
		return branch_code;
	}

	public void setBranch_code(double branch_code) {
		this.branch_code = branch_code;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public double getDept_code() {
		return dept_code;
	}

	public void setDept_code(double dept_code) {
		this.dept_code = dept_code;
	}

	public static void main(String[] args) {
		
		EncapClass e=new EncapClass();
		
		e.setSeccode(5);
		e.setBranch_code(10);
		e.setBranch_name("Chennai");
		e.setDept_code(12);
		e.setDept_name("ECE");
		System.out.println(e.getBranch_code());
		System.out.println(e.getBranch_name());
		System.out.println(e.getDept_code());
		System.out.println(e.getDept_name());
		System.out.println(e.getSeccode());

	}

}
