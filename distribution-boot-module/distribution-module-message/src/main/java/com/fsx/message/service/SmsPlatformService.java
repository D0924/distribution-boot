package com.fsx.message.service;

import com.fsx.framework.common.utils.PageResult;
import com.fsx.framework.mybatis.service.BaseService;
import com.fsx.message.entity.SmsPlatformEntity;
import com.fsx.message.query.SmsPlatformQuery;
import com.fsx.message.sms.config.SmsConfig;
import com.fsx.message.vo.SmsPlatformVO;

import java.util.List;

/**
 * 短信平台
 *
 * @author 阿沐 babamu@126.com
 */
public interface SmsPlatformService extends BaseService<SmsPlatformEntity> {

    PageResult<SmsPlatformVO> page(SmsPlatformQuery query);

    /**
     * 启用的短信平台列表
     */
    List<SmsConfig> listByEnable();

    void save(SmsPlatformVO vo);

    void update(SmsPlatformVO vo);

    void delete(List<Long> idList);

}