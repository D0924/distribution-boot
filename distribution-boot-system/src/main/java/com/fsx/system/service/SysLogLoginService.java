package com.fsx.system.service;

import com.fsx.framework.common.utils.PageResult;
import com.fsx.framework.mybatis.service.BaseService;
import com.fsx.system.entity.SysLogLoginEntity;
import com.fsx.system.query.SysLogLoginQuery;
import com.fsx.system.vo.SysLogLoginVO;

/**
 * 登录日志
 *
 * @author 阿沐 babamu@126.com
 */
public interface SysLogLoginService extends BaseService<SysLogLoginEntity> {

    /**
     * Page result.
     *
     * @param query the query
     * @return the page result
     */
    PageResult<SysLogLoginVO> page(SysLogLoginQuery query);

    /**
     * 保存登录日志
     *
     * @param username  用户名
     * @param status    登录状态
     * @param operation 操作信息
     */
    void save(String username, Integer status, Integer operation);

    /**
     * 导出登录日志
     */
    void export();
}