package com.dbs.services;

import com.dbs.entity.HNI;
import com.dbs.model.HNIRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HNIServiceImpl implements HNIService{
    @Autowired
    private HNIRepository hniRepository;
    @Override
    public List<HNI> findAll() {
        return hniRepository.findAll();
    }
}
