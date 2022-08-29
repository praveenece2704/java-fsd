package com.example.Basics.Jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.Basics.bean.Persons;

@Repository
public class Persondao {
     
	@Autowired
	JdbcTemplate jdbctemplate;
	
	class PersonRowmap implements RowMapper<Persons>{

		@Override
		public Persons mapRow(ResultSet rs, int rowNum) throws SQLException {
			Persons person=new Persons();
			person.setId(rs.getInt("id"));
			person.setName(rs.getString("name"));
			person.setLocation(rs.getString("location"));
			return person;
		}
		
	}
	
	public List<Persons> findAll()	{
		return jdbctemplate.query("select * from persons", new PersonRowmap());
	}
	public Persons findbyId(int id)
    {
		return jdbctemplate.queryForObject("select * from persons where id = ?", new Object[]{id}, new BeanPropertyRowMapper<Persons>(Persons.class));
	}
	public int deletebyId(int id)
	{
		return jdbctemplate.update("delete from persons where id = ?", new Object[]{id});
	}
	public int insert(Persons person)
	{
		return jdbctemplate.update("insert into persons(id,name,location) values(?,?,?)",new Object[] {person.getId(),person.getName(),person.getLocation()});
	}
	public int update(Persons person)
	{
		return jdbctemplate.update("update persons set name = ? ,location= ? where id=? ",new Object[] {person.getName(),person.getLocation(),person.getId()});
	}
}
