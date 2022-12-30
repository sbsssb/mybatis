package com.emp.common;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SessionTemplate {
	
	public static SqlSession getSession() {
		
		SqlSession session = null;
		
		String file = "/mybatis-config.xml";
		
		
		
		try {
			
			InputStream is = Resources.getResourceAsStream(file);
			
			session = new SqlSessionFactoryBuilder().build(is).openSession(false);
		
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		return session;
		
	}

}
