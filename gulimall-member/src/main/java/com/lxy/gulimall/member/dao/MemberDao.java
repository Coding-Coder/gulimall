package com.lxy.gulimall.member.dao;

import com.lxy.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lxy
 * @email aethon47@163.com
 * @date 2021-06-22 15:40:59
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
