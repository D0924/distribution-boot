package com.fsx.system.dao;

import com.fsx.framework.mybatis.dao.BaseDao;
import com.fsx.system.entity.SysDictDataEntity;
import com.fsx.system.vo.SysDictVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 字典数据
 *
 * @author 阿沐 babamu@126.com
 */
@Mapper
public interface SysDictDataDao extends BaseDao<SysDictDataEntity> {

    @Select("${sql}")
    List<SysDictVO.DictData> getListForSql(@Param("sql") String sql);
}
