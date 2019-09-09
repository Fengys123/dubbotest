package com.service;

import com.entity.Provider;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Service
@Component
public class ProviderService implements ProviderInteface {
    @Override
    public List<Provider> getProviderList() {
        Provider fys = new Provider("fys", 11);
        Provider zs = new Provider("zs", 11);
        List<Provider> arrayList = new ArrayList<>();
        arrayList.add(fys);
        arrayList.add(zs);
        return arrayList;
    }
}
