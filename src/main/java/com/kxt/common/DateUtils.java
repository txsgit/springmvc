package com.kxt.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期类
 * @author Administrator
 *
 */
public class DateUtils {

	
	public static Date simpleFormate(String str) throws ParseException
	{
		SimpleDateFormat sf=new SimpleDateFormat();
		Date date=new Date();
		sf.format(date);
		return sf.parse(str);
	}
}
