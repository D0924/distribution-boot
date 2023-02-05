package com.fsx.system.dao;

import com.fsx.framework.mybatis.dao.BaseDao;
import com.fsx.system.entity.SysLogLoginEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 登录日志
 *
 * @author 阿沐 babamu@126.com
 */
@Mapper
public interface SysLogLoginDao extends BaseDao<SysLogLoginEntity> {

}