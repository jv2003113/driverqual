package com.ehi.driverqual.controller;


import com.ehi.driverqual.domain.DriverQualificationRequest;
import com.ehi.driverqual.repository.DriverQualificationRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Controller
@RequestMapping("/dq")
public class DriverQualificationController {

    private final AtomicLong counter = new AtomicLong();

    public DriverQualificationRequestRepository getRepository() {
        return repository;
    }

    public void setRepository(DriverQualificationRequestRepository repository) {
        this.repository = repository;
    }

    public AtomicLong getCounter() {
        return counter;
    }

    @Autowired
    private DriverQualificationRequestRepository repository;


    @RequestMapping(value = "{id}",method=RequestMethod.GET)
    public @ResponseBody
    DriverQualificationRequest getDriverQualificationRequest(@PathVariable("id") String id) {
        return this.repository.findOne(id);
    }

    @RequestMapping(method=RequestMethod.GET)
    public @ResponseBody
    List<DriverQualificationRequest> getAllDriverQualificationRequest() {
        return this.repository.findAll();
    }

    @RequestMapping(method=RequestMethod.PUT)
    public @ResponseBody
    String createDriverQualificationRequest(@RequestBody DriverQualificationRequest dqr) {
        this.repository.save(dqr);
        return dqr.getId();
    }
    @RequestMapping(method=RequestMethod.POST)
    public void updateDriverQualificationRequest(@RequestBody DriverQualificationRequest dqr) {
        this.repository.save(dqr);
    }

    @RequestMapping(value = "{id}",method=RequestMethod.DELETE)
    public void deleteDriverQualificationRequest(@PathVariable("id") String id) {
        this.repository.delete(id);
    }

    @RequestMapping(method=RequestMethod.DELETE)
    public void deleteAllDriverQualificationRequest() {
        this.repository.deleteAll();
    }


}