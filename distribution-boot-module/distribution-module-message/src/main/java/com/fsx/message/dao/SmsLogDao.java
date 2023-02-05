package com.fsx.message.dao;

import com.fsx.framework.mybatis.dao.BaseDao;
import com.fsx.message.entity.SmsLogEntity;
import org.apache.ibatis.annotations.Mapper;

/**
* 短信日志
*
* @author 阿沐 babamu@126.com
*/
@Mapper
public interface SmsLogDao extends BaseDao<SmsLogEntity> {
	
}