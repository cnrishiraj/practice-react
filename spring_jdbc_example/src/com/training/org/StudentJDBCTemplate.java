
package com.training.org;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCTemplate implements StudentDAO{
    @SuppressWarnings("unused")
	private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;
    
    public void setDataSource(DataSource dataSource) {
        this.dataSource=dataSource;
        this.jdbcTemplateObject=new JdbcTemplate(dataSource);
    }

    @Override
    public void create(Integer id, String name, Integer age) {
        String query="insert into student(name,age) values (?,?)";
        jdbcTemplateObject.update(query,name,age);
        System.out.println("Record inserted into student table ");
    }
    
    
     
    
    
}