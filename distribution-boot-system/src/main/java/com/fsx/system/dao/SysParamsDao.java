package com.fsx.system.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fsx.framework.mybatis.dao.BaseDao;
import com.fsx.system.entity.SysParamsEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 参数管理
 *
 * @author 阿沐 babamu@126.com
 */
@Mapper
public interface SysParamsDao extends BaseDao<SysParamsEntity> {

    default boolean isExist(String paramKey) {
        return this.exists(new QueryWrapper<SysParamsEntity>().eq("param_key" , paramKey));
    }
}