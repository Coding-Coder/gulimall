package com.lxy.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lxy.common.utils.PageUtils;
import com.lxy.gulimall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author lxy
 * @email aethon47@163.com
 * @date 2021-06-22 15:40:59
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

