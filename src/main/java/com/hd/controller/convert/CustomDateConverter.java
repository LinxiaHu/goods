package com.hd.controller.convert;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**
 * @author Chunyun
 * 用于前端提交的数据name值为日期的字符串像Date类型转换
 */
public class CustomDateConverter implements Converter<String, Date> {

	@Override
	public Date convert(String source) {

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			return format.parse(source);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

}
