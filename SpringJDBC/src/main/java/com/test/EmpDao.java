package com.test;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmpDao {
		
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void save(Employee e)
	{
		String sql = "insert into employee11 values('"+e.getName()+"','"+e.getCmp()+"','"+e.getSalary()+"')";
		
		jdbcTemplate.execute(sql);
	}

	public void update(Employee e)
	{
		String sql = "update  employee11 set name = '"+e.getName()+"', company = '"+e.getCmp()+"' where salary = '"+e.getSalary()+"'";
		
		jdbcTemplate.execute(sql);
	}
	
	public void delete(Employee e)
	{
		String sql = "delete from employee11 where salary = '"+e.getSalary()+"'";
		
		jdbcTemplate.execute(sql);
	}
}
