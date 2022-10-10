package com.ricky.reggie.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ricky.reggie.common.CustomException;
import com.ricky.reggie.entity.Category;
import com.ricky.reggie.entity.Dish;
import com.ricky.reggie.entity.Setmeal;
import com.ricky.reggie.mapper.CategoryMapper;
import com.ricky.reggie.service.CategoryService;
import com.ricky.reggie.service.DishService;
import com.ricky.reggie.service.SetmealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

    @Autowired
    private DishService dishService;

    @Autowired
    private SetmealService setmealService;

    @Override
    public void remove(Long id) {

        LambdaQueryWrapper<Dish> dishLambdaQueryWrapper = new LambdaQueryWrapper<>();
        dishLambdaQueryWrapper.eq(Dish::getCategoryId,id);
        int count = dishService.count(dishLambdaQueryWrapper);

        if (count > 0) {
            throw new CustomException("当前分类下关联了菜品，不能删除");
        }


        LambdaQueryWrapper<Setmeal> setmealLambdaQueryWrapper = new LambdaQueryWrapper<>();
        setmealLambdaQueryWrapper.eq(Setmeal::getCategoryId, id);
        int count1 = setmealService.count(setmealLambdaQueryWrapper);

        if (count1 > 0) {
            throw new CustomException("当前分类下关联了套餐，不能删除");
        }

        super.removeById(id);


    }
}
