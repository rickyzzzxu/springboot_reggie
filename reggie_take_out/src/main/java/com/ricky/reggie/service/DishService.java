package com.ricky.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ricky.reggie.dto.DishDto;
import com.ricky.reggie.entity.Dish;

public interface DishService extends IService<Dish> {

    void saveWithFlavor(DishDto dishDto);

    DishDto getByIdWithFlavor(Long id);

    void updateWithFlavor(DishDto dishDto);
}
