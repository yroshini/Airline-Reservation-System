package Airline_Example;

public class Passenger {
	private String pass_id;
	private String name;
	private String email;
	private String phone;
	public Passenger(String pass_id, String name, String email, String phone) {
		super();
		this.pass_id = pass_id;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	public String getPass_id() {
		return pass_id;
	}
	public void setPass_id(String pass_id) {
		this.pass_id = pass_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Passenger [pass_id=" + pass_id + ", name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}
	
}