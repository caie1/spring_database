package com.java.database.hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class HibernateApplication implements CommandLineRunner {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(HibernateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String sql1 = "INSERT INTO Student (name) VALUES ("
				+ "'Alan Turing')";

		int rows1 = jdbcTemplate.update(sql1);
		if (rows1 > 0) {
			System.out.println("A new row has been inserted.");
		}

		String sql2 = "INSERT INTO Student (name) VALUES ("
				+ "'Elon Musk')";

		int rows2 = jdbcTemplate.update(sql2);
		if (rows2 > 0) {
			System.out.println("A new row has been inserted.");
		}

		String sql3 = "INSERT INTO Teacher (name) VALUES ("
				+ "'a b')";

		int rows3 = jdbcTemplate.update(sql3);
		if (rows3 > 0) {
			System.out.println("A new row has been inserted.");
		}



	}

}
