package home.ss.controller;

import home.ss.bo.Profile;
import home.ss.dao.ProfileDao;

public class ProfileController {
	
	
	ProfileDao dao=null;

	public ProfileController(ProfileDao dao) {
		
		this.dao = dao;
	}
	
	public void process(int sno1,String name1,int phone1)
	{
		Profile bo=new Profile();
		bo.setSno(sno1);
		bo.setName(name1);
		bo.setPhone(phone1);
		int result=dao.inserrt(bo);
		if(result==0)
			System.out.println("Registration Failed");
		else
			System.out.println("Registered");
		
	}
}
