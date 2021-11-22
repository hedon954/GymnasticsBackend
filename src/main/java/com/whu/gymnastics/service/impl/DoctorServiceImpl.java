package com.whu.gymnastics.service.impl;

import com.whu.gymnastics.entity.Doctor;
import com.whu.gymnastics.mapper.DoctorMapper;
import com.whu.gymnastics.service.IDoctorService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hedon
 * @since 2021-11-22
 */
@Service
public class DoctorServiceImpl extends ServiceImpl<DoctorMapper, Doctor> implements IDoctorService {

    @Autowired
    DoctorMapper doctorMapper;

    /**
     * 新增一个医生
     */
    @Override
    public int addDocker(Doctor doctor) {
        int res = doctorMapper.insert(doctor);
        System.out.println(doctor.getDoctorId());
        return res;
    }
}
