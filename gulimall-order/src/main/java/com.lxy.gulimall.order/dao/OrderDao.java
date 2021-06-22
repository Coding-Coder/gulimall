package com.lxy.gulimall.order.dao;

import com.lxy.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author lxy
 * @email aethon47@163.com
 * @date 2021-06-22 15:56:53
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
