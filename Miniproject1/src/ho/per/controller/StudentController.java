package ho.per.controller;

import ho.per.dto.StudentDTO;
import ho.per.service.StudentService;
import ho.per.vo.StudentVO;

public class StudentController {
	private StudentService service;

	public StudentController(StudentService service) {
		this.service=service;
		// TODO Auto-generated constructor stub
	}
	public String process(String sno,String sname,String m1,String m2,String m3) {
		StudentVO vo=new StudentVO();
		vo.setSno(sno);
		vo.setSname(sname);
		vo.setM1(m1);
		vo.setM2(m2);
		vo.setM3(m3);
		StudentDTO dto=new StudentDTO();
		dto.setSno(Integer.parseInt(vo.getSno()));
		dto.setSname(vo.getSname());
		dto.setM1(Integer.parseInt(vo.getM1()));
		dto.setM2(Integer.parseInt(vo.getM2()));
		dto.setM3(Integer.parseInt(vo.getM3()));
		String result=service.generateResult(dto);
		return result;
		
		
	}

}
