package com.scholar.config;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
@Slf4j
public class AopConfig {

    @Autowired
    private RedisClient redisClinet;

    private final String POINT_CUT = "execution(* com.scholar.infra.*.*(..))";

    @Pointcut(POINT_CUT)
    private void pointcut() {

    }

    @Around(value = POINT_CUT)
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();
        MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
        Class<?> returnType = methodSignature.getReturnType();
        log.info(returnType.toString());
        StringBuilder param = new StringBuilder();

        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            param.append(JSONObject.toJSONString(arg) + ", ");
        }
        log.info("className:{} ,methodName: {},args: {}", className, methodName, param.toString());
        String key = className + methodName + param.toString();
        String resultJson = redisClinet.get(key);
        Object result = null;
        if (resultJson != null) {
            return JSONObject.parseObject(resultJson,returnType);
        } else {
            result = joinPoint.proceed();
            redisClinet.setHalfhourTime(key,JSONObject.toJSONString(result));
            return result;
        }


    }
}
