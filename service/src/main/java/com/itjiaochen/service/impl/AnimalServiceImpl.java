package com.itjiaochen.service.impl;

import com.itjiaochen.service.IAnimalService;
import com.itjiaochen.entity.Animal;
import com.itjiaochen.mapper.AnimalMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 
 * @since 2022-04-02
 */
@Service
public class AnimalServiceImpl extends ServiceImpl<AnimalMapper, Animal> implements IAnimalService {

}
