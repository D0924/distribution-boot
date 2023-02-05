package com.fsx.message.service;

import com.fsx.framework.common.utils.PageResult;
import com.fsx.framework.mybatis.service.BaseService;
import com.fsx.message.entity.SmsLogEntity;
import com.fsx.message.query.SmsLogQuery;
import com.fsx.message.vo.SmsLogVO;

/**
 * 短信日志
 *
 * @author 阿沐 babamu@126.com
 */
public interface SmsLogService extends BaseService<SmsLogEntity> {

    PageResult<SmsLogVO> page(SmsLogQuery query);

}