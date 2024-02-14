package com.jihoon.realEstate;

import java.sql.Connection;
import java.sql.DriverManager;

public class App {

	public static void main(String[] args) {
		// JDBC와 MySQL Connector를 이용하여 MySQL 연결
		// JDBC: Java Database Connectivity
		// Java에서 데이터베이스와 연결할 수 있도록 도움을 주는 Java API
		// Java에서 SQL 쿼리나 쿼리 결과를 사용할 수 있도록 하는 방법을 제공
		
		try {

			// 1. 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. 데이터베이스 연결
			final String URL = "jdbc:mysql://127.0.0.1:3306/real_estate";
			final String USER_NAME = "root";
			final String USER_PASSWORD = "root";
			
			Connection connection = DriverManager.getConnection(URL, USER_NAME, USER_PASSWORD);
			System.out.println("연결 완료");
			
		} catch (Exception exception) {
			
			exception.printStackTrace();
			
		}
		
	}

}


