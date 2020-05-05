package home.ss.bo;

import home.ss.dao.ProfileDao;

public class Profile {
	
	private int sno;
	private String name;
	private int phone;
	
	public Profile() {}
	
	
	public int getSno() {
		return sno;
	}

	public String getName() {
		return name;
	}

	public int getPhone() {
		return phone;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	
}
