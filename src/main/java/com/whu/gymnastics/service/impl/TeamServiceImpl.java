package com.whu.gymnastics.service.impl;

import com.whu.gymnastics.entity.Team;
import com.whu.gymnastics.mapper.TeamMapper;
import com.whu.gymnastics.service.ITeamService;
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
public class TeamServiceImpl extends ServiceImpl<TeamMapper, Team> implements ITeamService {

}
