package com.whu.gymnastics.service.impl;

import com.whu.gymnastics.entity.Athlete;
import com.whu.gymnastics.mapper.AthleteMapper;
import com.whu.gymnastics.service.IAthleteService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class AthleteServiceImpl extends ServiceImpl<AthleteMapper, Athlete> implements IAthleteService {

}
