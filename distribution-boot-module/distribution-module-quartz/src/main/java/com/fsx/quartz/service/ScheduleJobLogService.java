package com.fsx.quartz.service;

import com.fsx.framework.common.utils.PageResult;
import com.fsx.framework.mybatis.service.BaseService;
import com.fsx.quartz.entity.ScheduleJobLogEntity;
import com.fsx.quartz.query.ScheduleJobLogQuery;
import com.fsx.quartz.vo.ScheduleJobLogVO;

/**
 * 定时任务日志
 *
 * @author 阿沐 babamu@126.com
 */
public interface ScheduleJobLogService extends BaseService<ScheduleJobLogEntity> {

    PageResult<ScheduleJobLogVO> page(ScheduleJobLogQuery query);

}