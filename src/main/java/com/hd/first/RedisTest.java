package com.hd.first;

import org.springframework.beans.factory.annotation.Autowired;

import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;

public class RedisTest {
	@Autowired
	private ShardedJedisPool shardedJedisPool;

	public void setValue(String key, String value) {
		ShardedJedis jedis = shardedJedisPool.getResource();
		jedis.set(key, value); // 将值保存到redis服务器
	}
}
