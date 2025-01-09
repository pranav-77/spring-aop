package com.springAop.api.controller;

import com.springAop.api.model.Mobile;
import com.springAop.api.service.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MobileController {
    @Autowired
    private MobileService service;

    @PostMapping("/add")
    public Mobile add(@RequestBody Mobile mobile) {
        return service.add(mobile);
    }

    @GetMapping("/get")
    public List<Mobile> get() {
        return service.get();
    }

    @GetMapping("/search/{id}")
    public Mobile getById(@PathVariable int id) {
        return service.getById(id);
    }

    @PutMapping("/update/{id}")
    public Mobile update(@PathVariable int id, @RequestBody Mobile mobile) {
        return service.update(id, mobile);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        service.delete(id);
    }
}
