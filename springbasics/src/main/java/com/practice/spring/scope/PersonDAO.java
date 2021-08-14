package com.practice.spring.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonDAO {
	
	@Autowired
	private JdbcConnection jdbcConnection;

	/**
	 * @return the jdbcConnection
	 */
	public JdbcConnection getJdbcConnection() {
		return jdbcConnection;
	}

	/**
	 * @param jdbcConnection the jdbcConnection to set
	 */
	public void setJdbcConnection(JdbcConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}



}
