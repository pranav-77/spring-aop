package com.springAop.api.service;

import com.springAop.api.model.Mobile;
import com.springAop.api.repository.MobileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MobileService {
    @Autowired
    private MobileRepository repository;

    public Mobile add(Mobile mobile) {
        return repository.save(mobile);
    }

    public List<Mobile> get() {
        return repository.findAll();
    }

    public Mobile getById(int id) {
        return repository.findById(id).orElseThrow(() -> new IllegalArgumentException("No Mobile Found"));
    }

    public void delete(int id) {
        getById(id);
        repository.deleteById(id);
    }

    public Mobile update(int id, Mobile mobile) {
        getById(id);
        mobile.setId(id);
        return repository.save(mobile);
    }
}
