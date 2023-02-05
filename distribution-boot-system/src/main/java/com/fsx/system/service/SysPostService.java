package com.fsx.system.service;

import com.fsx.framework.common.utils.PageResult;
import com.fsx.framework.mybatis.service.BaseService;
import com.fsx.system.entity.SysPostEntity;
import com.fsx.system.query.SysPostQuery;
import com.fsx.system.vo.SysPostVO;

import java.util.List;

/**
 * 岗位管理
 *
 * @author 阿沐 babamu@126.com
 */
public interface SysPostService extends BaseService<SysPostEntity> {

    PageResult<SysPostVO> page(SysPostQuery query);

    List<SysPostVO> getList();

    void save(SysPostVO vo);

    void update(SysPostVO vo);

    void delete(List<Long> idList);
}