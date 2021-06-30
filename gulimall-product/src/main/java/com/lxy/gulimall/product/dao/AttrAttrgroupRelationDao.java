package com.lxy.gulimall.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lxy.gulimall.product.entity.AttrAttrgroupRelationEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 属性&属性分组关联
 *
 * @author lxy
 * @email aethon47@163.com
 * @date 2021-06-22 14:10:28
 */
@Mapper
public interface AttrAttrgroupRelationDao extends BaseMapper<AttrAttrgroupRelationEntity> {

    void deleteBatchRelation(@Param("entities") List<AttrAttrgroupRelationEntity> entities);
}
