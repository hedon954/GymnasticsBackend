package com.whu.gymnastics.service.impl;

import com.whu.gymnastics.entity.Game;
import com.whu.gymnastics.mapper.GameMapper;
import com.whu.gymnastics.service.IGameService;
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
public class GameServiceImpl extends ServiceImpl<GameMapper, Game> implements IGameService {

}
