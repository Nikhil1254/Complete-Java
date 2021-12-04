package com.spring.jdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;

@Configuration
@ComponentScan("com.spring.jdbc.dao")
public class JdbcConfig {

	// DataSource is parent interface of DriverManagerDataSource
	// so we can write that also in return type
	@Bean("ds")
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("Forcedile@123");
		return ds;
	}

	@Bean("JdbcTemplate")
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate temp = new JdbcTemplate();
		temp.setDataSource(getDataSource());
		return temp;
	}

	/*
	 * @Bean("studentDao") public StudentDao getStudentDaoImpl() { StudentDaoImpl sd
	 * = new StudentDaoImpl(); sd.setJdbcTemplate(getJdbcTemplate()); return sd; }
	 */
}
