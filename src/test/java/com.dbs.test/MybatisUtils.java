package com.dbs.test;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtils {
	
	public static SqlSessionFactory getFactory() throws IOException {
		String resource = "mybatis-config.xml";
		//����mybatis�����ļ�
		Reader reader = Resources.getResourceAsReader(resource);
		//����Session����
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
		return sessionFactory;
	}
}
