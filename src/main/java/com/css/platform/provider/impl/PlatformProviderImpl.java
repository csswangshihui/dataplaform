package com.css.platform.provider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.css.platform.provider.PlatformProvider;

@Service(group="PlatformProvider", version = "1.0")
public class PlatformProviderImpl implements PlatformProvider {

    public String getName() {
        System.out.println("====PlatformProvider=====");
        return "";
    }
}
