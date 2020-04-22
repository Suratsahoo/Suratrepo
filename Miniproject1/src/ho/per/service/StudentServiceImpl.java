package ho.per.service;

import ho.per.bo.StudentBO;
import ho.per.dao.StudentDAO;
import ho.per.dto.StudentDTO;

public class StudentServiceImpl implements StudentService {
	private StudentDAO dao;

	public StudentServiceImpl(StudentDAO dao) {
		this.dao=dao;
				
	}

	@Override
	public String generateResult(StudentDTO dto) {
		int total=dto.getM1()+dto.getM2()+dto.getM3();
		float avg=(float)total/3.0f;
		String result=null;
		if(avg<35)
			result="Fail";
		else
			result="Pass";
		StudentBO bo=new StudentBO();
		bo.setSno(dto.getSno());
		bo.setSname(dto.getSname());
		bo.setTotal(total);
		bo.setAvg(avg);
		bo.setResult(result);
		int cnt=dao.insert(bo);
		if(cnt==0)
			return "Result:"+bo.getResult()+" "+bo.getSno()+" "+"Average-->:"+bo.getAvg()+" "+" Registration failed";
		else
			return "Result:"+bo.getResult()+" "+bo.getSno()+" "+"Average-->:"+bo.getAvg()+" "+" Registration succeeded";
		
		
	}

}
