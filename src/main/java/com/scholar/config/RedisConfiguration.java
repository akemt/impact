package com.scholar.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * 配置redis服务器
 */
@Configuration
public class RedisConfiguration {
    @Bean(name = "jedis.pool")
    @Autowired
    public JedisPool jedisPool(@Qualifier("jedis.pool.config") JedisPoolConfig config,
                               @Value("${jedis.pool.host}") String host,
                               @Value("${jedis.pool.port}") int port) {
        return new JedisPool(config, host, port);
    }

    @Bean(name = "jedis.pool.config")
    public JedisPoolConfig jedisPoolConfig(@Value("${jedis.pool.config.maxTotal}") int maxTotal,
                                           @Value("${jedis.pool.config.maxIdle}") int maxIdle,
                                           @Value("${jedis.pool.config.maxWaitMillis}") int maxWaitMillis) {
        JedisPoolConfig config = new JedisPoolConfig();
        //是否启用后进先出, 默认true
//        config.setLifo(true);
        config.setMaxTotal(maxTotal);//最大连接数
        config.setMaxIdle(maxIdle);//最大空闲连接数, 默认
        config.setMaxWaitMillis(maxWaitMillis);//获取连接时的最大等待毫秒数(如果设置为阻塞时BlockWhenExhausted),如果超时就抛异常, 小于零:阻塞不确定的时间,  默认-1

//        //最小空闲连接数, 默认0
//        config.setMinIdle(0);
//
//        //每次逐出检查时 逐出的最大数目 如果为负数就是 : 1/abs(n), 默认3
//        config.setNumTestsPerEvictionRun(3);
//
//        //对象空闲多久后逐出, 当空闲时间>该值 且 空闲连接>最大空闲数 时直接逐出,不再根据MinEvictableIdleTimeMillis判断  (默认逐出策略)
//        config.setSoftMinEvictableIdleTimeMillis(1800000);
//
//        //在获取连接的时候检查有效性, 默认false
//        config.setTestOnBorrow(false);
//
//        //在空闲时检查有效性, 默认false
//        config.setTestWhileIdle(false);
//
//        //逐出扫描的时间间隔(毫秒) 如果为负数,则不运行逐出线程, 默认-1
//        config.setTimeBetweenEvictionRunsMillis(-1);

        return config;
    }
}
