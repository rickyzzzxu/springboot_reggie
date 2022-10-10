package com.ricky.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ricky.reggie.entity.Category;

public interface CategoryService extends IService<Category> {

    void remove(Long id);
}
