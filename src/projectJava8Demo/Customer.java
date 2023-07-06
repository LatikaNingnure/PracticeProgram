package projectJava8Demo;

import java.util.Objects;

public class Customer {
	private int Id;
	private String Name;
	private String Email;
	
	public Customer(int id, String name, String email) {
		this.Id=id;
		this.Name=name;
		this.Email=email;
	}
	
	public int getcID() {
		return Id;
	}
	
	public void setcId(int Id) {
		this.Id=Id;
	}
	
	public String getcName() {
		return Name;
	}
	
	public void setName(String Name) {
		this.Name=Name;
	}
	
	public String getcEmail() {
		return Email;
	}
	
	public void setEmail(String Email) {
		this.Email=Email;
	}	

}
class CustomerDTO {
	private int cId;
	private String cName;
	private String cEmail;
	
	public CustomerDTO(int CId, String CName, String CEmail) {
		this.cId=CId;
		this.cName=CName;
		this.cEmail=CEmail;
	}
	
	public int getcId() {
		return cId;
	}
	
	public void setcId(int cid) {
		this.cId=cid;
	}
	
	public String getcName() {
		return cName;
	}
	
	public void setcName(String cName) {
		this.cName=cName;
	}
	
	public String getEmail() {
		return cEmail;
	}
	
	public void setcEmail(String cEmail) {
		this.cEmail=cEmail;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cEmail, cId, cName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerDTO other = (CustomerDTO) obj;
		return Objects.equals(cEmail, other.cEmail) && cId == other.cId && Objects.equals(cName, other.cName);
	}
}