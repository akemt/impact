package com.scholar.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * redis 公共实现方法
 */
@Component
public class RedisClient {

    @Autowired
    private JedisPool jedisPool;

    public void set(String key, String value) throws Exception {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            jedis.set(key, value);
        } finally {
            //返还到连接池
            jedis.close();
        }
    }

    public void set(String key, String value,long time) throws Exception {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            //jedis.set(key, value);
            // NX是不存在时才set， XX是存在时才set， EX是秒，PX是毫秒
            jedis.set(key, value, "NX", "EX", time);
        } finally {
            //返还到连接池
            jedis.close();
        }
    }

    public void setHalfhourTime(String key, String value) throws Exception {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            //jedis.set(key, value);
            // NX是不存在时才set， XX是存在时才set， EX是秒，PX是毫秒
            jedis.set(key, value, "NX", "EX", 1800);
        } finally {
            //返还到连接池
            jedis.close();
        }
    }

    public String get(String key) throws Exception {

        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            return jedis.get(key);
        } finally {
            //返还到连接池
            jedis.close();
        }
    }
}
