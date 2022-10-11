package com.ricky.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ricky.reggie.dto.SetmealDto;
import com.ricky.reggie.entity.Setmeal;

public interface SetmealService extends IService<Setmeal> {

    void saveWithDish(SetmealDto setmealDto);


}
