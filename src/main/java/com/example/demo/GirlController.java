package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GirlController {
	
	@Autowired
	private GirlRepository girlRepository;
	
	/**
	 * 操作女生列表
	 * @return
	 */
	//查看女生列表
	@GetMapping(value="/girls")
	public List<Girl> girlList(){
		return girlRepository.findAll();
	}
	
	//插入新女生
	@PostMapping(value="/girls")
	public Girl girlAdd(@RequestParam(value="cupSize", required=false) String cupSize,
						@RequestParam(value="age", required=false) Integer age) {
		Girl girl = new Girl();
		girl.setCupSize(cupSize);
		girl.setAge(age);
		return girlRepository.save(girl);
	}
	
	//通过id查询女生
	@GetMapping(value="/girls/{id}")
	public Girl girlFindOne(@PathVariable(value="id") Integer id) {
		return girlRepository.findById(id).get();
	}
	
	//通过id更新女生信息
	@PutMapping(value="/girls/{id}")
	public Girl girlUpdate(@PathVariable(value="id") Integer id,
						   @RequestParam(value="cupSize") String cupSize,
						   @RequestParam(value="age") Integer age) {
		Girl girl = new Girl();
		girl.setId(id);
		girl.setCupSize(cupSize);
		girl.setAge(age);
		return girlRepository.save(girl);
	}
	
	//通过id删除女生
	@DeleteMapping(value="/girls/{id}")
	public void girlDelete(@PathVariable(value="id") Integer id) {
		girlRepository.deleteById(id);
	}
	
	//通过age查询女生列表
	@GetMapping(value="/girls/age/{age}")
	public List<Girl> girlFindByAge(@PathVariable(value="age") Integer age) {
		return girlRepository.findByAge(age);
	}
}
