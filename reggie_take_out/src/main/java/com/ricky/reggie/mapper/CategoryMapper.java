package com.ricky.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ricky.reggie.entity.Category;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryMapper extends BaseMapper<Category> {
}
