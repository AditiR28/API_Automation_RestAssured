package API_automation.Restassured;

public class basicinfomation {
	private String firstname;
	private String lastname;
	private String id;
    private Addressinformation address;
    private  Designationinformation designation[];

		public Designationinformation[] getDesignation() {
		return designation;
	}

	public void setDesignation(Designationinformation[] designation) {
		this.designation = designation;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public Addressinformation getAddress() {
		return address;
	}

	public void setAddress(Addressinformation address) {
		this.address = address;
	}

}
