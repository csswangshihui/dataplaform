package com.css.platform.service.impl;

import com.css.platform.entity.AyxxVO;
import com.css.platform.repository.AyxxRepository;
import com.css.platform.service.AyxxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AyxxServiceImpl implements AyxxService {
    @Autowired
    private AyxxRepository ayxxRepository;

    @Override
    public List<AyxxVO> getAll() {
        return ayxxRepository.findAll();
    }
}
