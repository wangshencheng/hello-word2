package com.example.demo2;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
	
	@Autowired
	private StudentMapper studentMapper;

	@Bean
	public BCryptPasswordEncoder bcryEncod() {
		return new BCryptPasswordEncoder();
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Student s=studentMapper.selectStudentByName(username);
		System.out.println("同学====="+s);
		if(s==null) {
			
			return null;
		}else {
			Collection<GrantedAuthority>authorities=new ArrayList<GrantedAuthority>();
			authorities.add(new SimpleGrantedAuthority("admin"));
			User user=new User(s.getName(),s.getPassword() , authorities);
			return user;
		}
	
	}
}
