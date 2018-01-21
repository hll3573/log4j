package com.atguigu.dao;

import org.apache.log4j.Logger;

public class UserDaoImpl
{

	private static final Logger logger = Logger.getLogger(UserDaoImpl.class);

	
	public void testMethod02()
	{
		if (logger.isDebugEnabled())
		{
			logger.debug("testMethod02() - start");
		}
		
		// biz method
		if (logger.isDebugEnabled())
		{
			logger.debug("testMethod02() - end");
		}
	}
	
	
	public static void main(String[] args)
	{
		
		int age = 10;
		
		if (logger.isInfoEnabled())
		{
			logger.info("main(String[]) - int age=" + age);
		}
		
		logger.debug("1111");
		
		
/*		logger.debug("-----debug");
		logger.info("-----logger");
		logger.warn("-----warn");
		logger.error("-----warn");*/
//		int age = 10;
//		int result = 0;
//		try
//		{
//			logger.debug("111111111111111");
//			result = age/0;
//			logger.debug("-----result: "+result);
//		} 
//		catch (Exception e)
//		{
//			e.printStackTrace();
//			logger.error(e,e.getCause());
//		}
		
	}
}
