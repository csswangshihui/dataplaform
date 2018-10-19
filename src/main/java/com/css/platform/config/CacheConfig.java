package com.css.platform.config;

import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.Bean;
import java.util.Map;


public class CacheConfig {

    @Autowired
    private CacheManager cacheManager;

    @Bean
    @Cacheable(cacheNames = "mycache")
    public Map<String, Object> initCache() {
        Map<String, Object> cacheMap = Maps.newHashMap();
        for (int j = 0; j < 10; j++) {
            cacheMap.put(j + "", j);
        }
        return cacheMap;
    }

    @Bean
    @CacheEvict(cacheNames = "mycache")
    public Map<String, Object> removeCache(String key) {
        Map<String, Object> cacheMap = Maps.newHashMap();
        for (int j = 0; j < 10; j++) {
            cacheMap.put(j + "", j);
        }
        return cacheMap;
    }
}
