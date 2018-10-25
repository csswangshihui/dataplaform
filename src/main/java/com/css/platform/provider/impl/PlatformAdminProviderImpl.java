package com.css.platform.provider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.css.platform.domain.PlatFormAdmin;
import com.css.platform.provider.PlatformAdminProvider;
import com.css.platform.repository.PlatFormAdminRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service(group = "ayxx", version = "1.0")
public class PlatformAdminProviderImpl implements PlatformAdminProvider {

    @Autowired
    private PlatFormAdminRepository adminRepository;

    @Override
    public List<PlatFormAdmin> getPlatFormAdminList() {
        return adminRepository.findAll();
    }
}
