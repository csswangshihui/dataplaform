package com.css.platform.provider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.css.platform.entity.AyxxVO;
import com.css.platform.provider.AyxxProvider;
import com.css.platform.service.AyxxService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@Service(group="ayxx", version = "1.0")
public class AyxxProviderImpl implements AyxxProvider{

    @Autowired
    private AyxxService service;
    @Override
    public List<AyxxVO> getAyxxVOList() {
        return service.getAll();
    }
}
