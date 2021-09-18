package com.example.demo2;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
@Mapper
public interface StudentMapper {

	@Results(id = "MapStudent",value={
		@Result(property = "id",column = "id",id = true),
		@Result(property = "name",column = "name"),
		@Result(property = "age",column = "age"),
		@Result(property="addr",column="addr"),
		@Result(property = "password",column="password")})
	@Select(value = "select name,id,age,addr from student where id=#{id}")
	
	public Student SelectStudentBYId(int id);
	@ResultMap(value = "MapStudent")
	@Select(value="select id,name,age,addr,password from student where name=#{name}")
	public Student selectStudentByName(String name);
@Insert(value="insert into student(id,name,password) values (seq.nextval,#{name},#{password})")
public int saveStudent(Student student);
@Update(value="update student set addr=#{addr} where id =#{id}")
public int updateStudent(Student student);
}
