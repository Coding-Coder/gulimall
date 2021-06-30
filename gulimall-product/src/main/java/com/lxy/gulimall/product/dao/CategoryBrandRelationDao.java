package com.lxy.gulimall.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lxy.gulimall.product.entity.CategoryBrandRelationEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 品牌分类关联
 *
 * @author lxy
 * @email aethon47@163.com
 * @date 2021-06-22 14:10:28
 */
@Mapper
public interface CategoryBrandRelationDao extends BaseMapper<CategoryBrandRelationEntity> {

    void updateCategory(@Param("catId") Long catId, @Param("name") String name);
}
