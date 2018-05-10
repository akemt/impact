package com.scholar;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
@MapperScan(basePackages = "com.scholar.mapper")
public class ScholarApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScholarApplication.class, args);
	}

//	@Autowired
//	private RedisClient redisClinet;
//
//
//	@RequestMapping("/set");
//	public String set(String key, String value) throws Exception{
//		redisClinet.set(key, value);
//		return "success";
//	}
//
//	@RequestMapping("/get")
//	public String get(String key) throws Exception {
//		return redisClinet.get(key);
//	}
}
