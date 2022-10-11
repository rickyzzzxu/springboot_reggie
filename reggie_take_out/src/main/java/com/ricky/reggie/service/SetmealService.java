package com.ricky.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ricky.reggie.dto.SetmealDto;
import com.ricky.reggie.entity.Setmeal;

import java.util.List;

public interface SetmealService extends IService<Setmeal> {

    void saveWithDish(SetmealDto setmealDto);

    void removeWithDish(List<Long> ids);
}
