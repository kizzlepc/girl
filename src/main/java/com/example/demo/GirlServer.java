package com.example.demo;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GirlServer {
	@Autowired
	private GirlRepository girlRepository;
	
	/**
	 * mysql表类型myisam不支持事务，spring.jpa.hibernate.ddl-auto:create
	 * 默认创建的myisam类型。
	 * 表类型InnoDB支持事务
	 */
	@Transactional
	public void insertTwo() {
		Girl girlA = new Girl();
		girlA.setCupSize("A");
		girlA.setAge(18);
		girlRepository.save(girlA);

		Girl girlB = new Girl();
		girlB.setCupSize("BB");
		girlB.setAge(19);
		girlRepository.save(girlB);
	}
}
