package com.abernathy.mediscreen.massessment.proxy;

import com.abernathy.mediscreen.massessment.model.Patient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "MEDISCREEN-PATIENT")
public interface PatientProxy {

    @GetMapping("/patient/{id}")
    Patient getPatientById(@PathVariable Integer id);

}
