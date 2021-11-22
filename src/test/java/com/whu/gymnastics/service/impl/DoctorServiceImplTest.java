package com.whu.gymnastics.service.impl;

import com.whu.gymnastics.entity.Doctor;
import com.whu.gymnastics.mapper.DoctorMapper;
import com.whu.gymnastics.service.IDoctorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.ManagedBean;


/**
 * @author Hedon Wang
 * @create 2021-11-22 3:09 PM
 */
@SpringBootTest
class DoctorServiceImplTest {

    @Autowired
    IDoctorService doctorService;

    @Autowired
    DoctorMapper doctorMapper;


    @Test
    void TestAddDoctor() {
        Doctor doctor = new Doctor();
        doctor.setDoctorIdentifier("dockerID12345");
        doctor.setDoctorName("hedon-test");
        doctor.setDoctorPhone("12345678900");

        // insert
        int result = doctorService.addDocker(doctor);
        System.out.println("insert result: " + result);
        System.out.println("doctor id: " + doctor.getDoctorId());


        // search
        Doctor doctor1 = doctorMapper.selectById(doctor.getDoctorId());
        System.out.println("docker1: " + doctor1);
    }
}