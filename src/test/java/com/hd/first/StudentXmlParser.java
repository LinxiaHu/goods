package com.hd.first;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import com.hd.first.Student;

/**
 * @author Chunyun 用于测试xmlpullparser的程序
 */
public class StudentXmlParser {

	public List<Student> pullParseXML() {

		List<Student> list = null;
		Student student = null;

		// 构建XmlPullParserFactory
		try {
			XmlPullParserFactory pullParserFactory = XmlPullParserFactory
					.newInstance();
			// 获取XmlPullParser的实例
			XmlPullParser xmlPullParser = pullParserFactory.newPullParser();
			// 设置输入流 xml文件
			xmlPullParser.setInput(
					Thread.currentThread().getContextClassLoader()
							.getResourceAsStream("student.xml"), "UTF-8");

			// 开始
			int eventType = xmlPullParser.getEventType();

			try {
				while (eventType != XmlPullParser.END_DOCUMENT) {
					String nodeName = xmlPullParser.getName();
					switch (eventType) {
					// 文档开始
					case XmlPullParser.START_DOCUMENT:
						list = new ArrayList<Student>();
						break;
					// 开始节点
					case XmlPullParser.START_TAG:
						// 判断如果其实节点为student
						if ("student".equals(nodeName)) {
							// 实例化student对象
							student = new Student();
							// 设置Id属性
							student.setId(Integer.parseInt(xmlPullParser
									.getAttributeValue(0)));
							// 设置Group属性
							student.setGroup(Integer.parseInt(xmlPullParser
									.getAttributeValue(1)));
						} else if ("name".equals(nodeName)) {
							// 设置name
							student.setName(xmlPullParser.nextText());
						} else if ("sex".equals(nodeName)) {
							// 设置sex
							student.setSex(xmlPullParser.nextText());
						} else if ("age".equals(nodeName)) {
							// 设置age
							student.setAge(Integer.parseInt(xmlPullParser
									.nextText()));
						} else if ("email".equals(nodeName)) {
							// 设置email
							student.setEmail(xmlPullParser.nextText());
						} else if ("birthday".equals(nodeName)) {
							// 设置birthday
							student.setBirthday(xmlPullParser.nextText());
						} else if ("memo".equals(nodeName)) {
							// 设置memo属性
							student.setMemo(xmlPullParser.nextText());
						}
						break;
					// 结束节点
					case XmlPullParser.END_TAG:
						if ("student".equals(nodeName)) {
							list.add(student);
							student = null;
						}
						break;
					default:
						break;
					}// switch
					eventType = xmlPullParser.next();
				}// while
			} catch (NumberFormatException e) {// try
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (XmlPullParserException e) {// try
			e.printStackTrace();
		}

		return list;
	}

	public static void main(String[] args) {
		List<Student> list = new StudentXmlParser().pullParseXML();
		for (Student student : list) {
			System.out.println("id:" + student.getId() + "\tgroup:"
					+ student.getGroup() + "\tname:" + student.getName()
					+ "\tsex:" + student.getSex() + "\tage:" + student.getAge()
					+ "\temail:" + student.getEmail() + "\tbirthday:"
					+ student.getBirthday() + "\tmemo:" + student.getMemo());
		}
	}

}
