package ödevDört;

public class Customer {
	
	private String name;
	private String lastName;
	private String tc;
	private String birthday;
	
	public Customer() {
		
	}
	
	public Customer(String name, String last, String tc, String birthday) {
		this.name = name;
		this.lastName = last;
		this.tc = tc;
		this.birthday = birthday;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLast(String lastName) {
		this.lastName = lastName;
	}
	public String getTc() {
		return tc;
	}
	public void setTc(String tc) {
		this.tc = tc;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
}
