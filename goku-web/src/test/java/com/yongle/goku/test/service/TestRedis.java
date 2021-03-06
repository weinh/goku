package com.yongle.goku.test.service;

import org.junit.Test;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;

/**
 * Created by weinh on 2016/5/7.
 */
public class TestRedis extends JUnitServiceBase {
    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    @Test
    public void testPipeline() {
        long t1 = System.currentTimeMillis();
        redisTemplate.executePipelined(new RedisCallback<String>() {
            @Override
            public String doInRedis(RedisConnection connection) throws DataAccessException {
                for (int i = 0; i < 100000; i++) {
                    connection.set(String.valueOf(i).getBytes(), String.valueOf(i).getBytes());
                }
                return null;
            }
        });
        System.out.println("execute Pipelined:" + (System.currentTimeMillis() - t1));

        long t2 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            redisTemplate.opsForValue().set(String.valueOf(i), String.valueOf(i));
        }
        System.out.println("execute non Pipelined:" + (System.currentTimeMillis() - t2));
    }

    @Test
    public void testSentinel() throws InterruptedException {
        for (int i = 0; i < 100000; i++) {
            try {
                redisTemplate.opsForValue().set(String.valueOf(i), String.valueOf(i));
                log.info("正在向redis中添加：{}", i);
                Thread.sleep(1000);
            } catch (Exception e) {
                log.error(e.getMessage(), e);
            }
        }
    }

    @Test
    public void testCluster() {
        for (int i = 0; i < 100000; i++) {
            try {
                redisTemplate.opsForValue().set(String.valueOf(i), String.valueOf(i));
                log.info("正在向redis中添加：{}", i);
            } catch (Exception e) {
                log.error(e.getMessage(), e);
            }
        }
    }

    @Test
    public void test() {
    }
}
