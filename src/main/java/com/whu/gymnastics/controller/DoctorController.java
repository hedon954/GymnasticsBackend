package com.whu.gymnastics.controller;


import com.whu.gymnastics.entity.Doctor;
import com.whu.gymnastics.service.IDoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author hedon
 * @since 2021-11-22
 */
@RestController
@RequestMapping("/gymnastics/doctor")
public class DoctorController {


    @Autowired
    IDoctorService doctorService;

    @GetMapping("/{doctorID}")
    public Doctor getDoctor(@PathVariable String doctorID) {
        return doctorService.getById(doctorID);
    }
}
