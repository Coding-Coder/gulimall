package com.lxy.gulimall.coupon.dao;

import com.lxy.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author lxy
 * @email aethon47@163.com
 * @date 2021-06-22 15:28:57
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
