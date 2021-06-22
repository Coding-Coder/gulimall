package com.lxy.gulimall.product.dao;

import com.lxy.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author lxy
 * @email aethon47@163.com
 * @date 2021-06-22 14:10:28
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
