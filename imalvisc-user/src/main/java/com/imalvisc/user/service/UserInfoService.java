package com.imalvisc.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.imalvisc.user.model.dto.PageDTO;
import com.imalvisc.user.model.dto.UserInfoDTO;
import com.imalvisc.user.model.entity.UserInfo;
import com.imalvisc.user.model.vo.PageVO;

/**
 * @author imalvisc
 * @version v1.0
 * @ClassName UserInfoService
 * @Description 用户信息服务接口
 * @motto 学会编程而不是学会编码！
 * @date 2019-04-29 11:17
 * @Copyright Guangzhou CheXingYi Information Technology Co., Ltd.
 */
public interface UserInfoService extends IService<UserInfo> {

    PageVO<UserInfo> selectPage(PageDTO pageDTO);

    boolean insert(UserInfoDTO userInfoDTO);

}
