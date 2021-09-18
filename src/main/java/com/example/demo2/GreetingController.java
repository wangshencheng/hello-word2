package com.example.demo2;

import java.util.concurrent.atomic.AtomicLong;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.slf4j.Log4jLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class GreetingController {
	@Autowired
	private StudentService studentService;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
private Logger logger=LogManager.getLogger(GreetingController.class);
@Autowired
private StudentMapper studentMapper;
@GetMapping(value="/greeting",produces = MediaType.APPLICATION_XML_VALUE)
	@ResponseBody
	public Student greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
	try {
		studentService.test();
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
		logger.info("欢迎啊啊啊啊啊======");
		System.out.println(studentMapper.selectStudentByName("王慧"));
return studentMapper.selectStudentByName("王慧");
	}
//@ResponseBody
	@RequestMapping("/hello")
	public String helloWorld(@RequestParam(value = "name",defaultValue = "world") String name) {
		return "index";}
	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
	  @GetMapping("/login")
	    String login() {
	        return "login";
	    }
	  
	  @RequestMapping("/register")
	  public String register() {
		  return "register";
	  }
		  @RequestMapping("/save")
		  public String save(Student student) {
			  student.setPassword(bCryptPasswordEncoder.encode(student.getPassword()));
			  int n=studentMapper.saveStudent(student);
			  return "index";
		  
	  }
	
}
