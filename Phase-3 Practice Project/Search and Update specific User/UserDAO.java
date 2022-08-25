package com.example;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class UserDAO {
		private JdbcTemplate temp;

		public void setTemp(JdbcTemplate temp) {
			this.temp = temp;
		}

			public List<User> getallstudents(String s2){
				String sql="select * from user where id="+s2;
				
				return temp.query(sql,new ResultSetExtractor<List<User>>() {
					public List<User> extractData(ResultSet rs) throws SQLException, DataAccessException {
						ArrayList<User> al=new ArrayList<User>();
						while(rs.next()) {
							User u=new User();
							u.setId(rs.getInt(1));
							u.setName(rs.getString(2));
							u.setEmail(rs.getString(3));
							al.add(u);
						}
						return al;
					}
				});
			}
			
			public int insert(User u) {		
				String sql="insert into User values("+u.getId()+",'"+u.getName()+"','"+u.getEmail()+"')";
				return temp.update(sql);
			}
}


