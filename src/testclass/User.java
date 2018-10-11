package testclass;

import java.util.List;

public class User {
	
	private String firstname;
	private String lastname;
	private Integer age;
	private Address address;
	private List<PhoneNumber> phoneNumber;
	
	
	public String getfirstname()
	{
		return firstname;
	}
	public String getlastname()
	{
		return lastname;
	}
	
	public Integer getage()
	{
		return age;
	}
	
	public Address getaddress()
	{
		return address;
	}
	
	public List<PhoneNumber> getphoneNumber()
	{
		return phoneNumber;
	}
	

}
