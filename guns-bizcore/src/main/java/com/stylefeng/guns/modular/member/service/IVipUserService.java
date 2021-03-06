package com.stylefeng.guns.modular.member.service;

import com.stylefeng.guns.modular.system.model.VipUser;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * VIP会员表 服务类
 * </p>
 *
 * @author guiyj123
 * @since 2018-06-22
 */
public interface IVipUserService extends IService<VipUser> {


	Page<VipUser> pageList(Page<VipUser> page, Integer clubId, String condition);

}
