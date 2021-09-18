package com.example.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.MANDATORY,isolation = Isolation.DEFAULT,timeout = 30)
public class StudentService {

	@Autowired
	private StudentMapper studentMapper;
	public int test () {
		
		Student s1=new Student();
		s1.setName("王艳");
		s1.setPassword("qaz");
		studentMapper.saveStudent(s1);
		Student s2=new Student();
		s2.setAddr("纽约");
		s2.setId(3);
		studentMapper.updateStudent(s2);
		return 1;
	}
}
