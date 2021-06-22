package com.lxy.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lxy.common.utils.PageUtils;
import com.lxy.gulimall.member.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author lxy
 * @email aethon47@163.com
 * @date 2021-06-22 15:40:59
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

