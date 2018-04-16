package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GirlRepository extends JpaRepository<Girl, Integer> {
	//方法名有要求
	public List<Girl> findByAge(Integer age);
}
