package com.hd.first;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;

public class RedisTestTest {

	private ApplicationContext application;

	@Before
	public void setUp() {
		application = new ClassPathXmlApplicationContext(
				"classpath:spring/applicationContext-*.xml");
	}

	@Test
	public void testSetValue() {
		/* 采用直接new并且不采用分布式 */
		// Jedis jedis = new Jedis("192.168.206.129", 6379);
		// jedis.set("key1", "val1");
		// System.out.println(jedis.get("test1"));
		// System.out.println(application);
		
		/* 采用声明式注入方式 */
		ShardedJedisPool jedisPool = (ShardedJedisPool) application
				.getBean("jedis");
		ShardedJedis jedis2 = jedisPool.getResource();
//		System.out.println(jedis2.get("test1"));
//		jedis2.sadd("set1", "a");
//		byte val[] = new byte[3];
//		val[0] = 1;
//		val[1] = 2;
//		val[2] = 3;
//		jedis2.sadd("set2", "b");
		jedis2.sadd("set3-from-myeclipse", "c");
	}

}
