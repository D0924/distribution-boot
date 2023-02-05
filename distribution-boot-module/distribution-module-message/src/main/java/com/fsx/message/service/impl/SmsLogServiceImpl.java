package com.fsx.message.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.fsx.message.dao.SmsLogDao;
import com.fsx.message.vo.SmsLogVO;
import lombok.AllArgsConstructor;
import com.fsx.framework.common.utils.PageResult;
import com.fsx.framework.mybatis.service.impl.BaseServiceImpl;
import com.fsx.message.convert.SmsLogConvert;
import com.fsx.message.entity.SmsLogEntity;
import com.fsx.message.query.SmsLogQuery;
import com.fsx.message.service.SmsLogService;
import org.springframework.stereotype.Service;

/**
 * 短信日志
 *
 * @author 阿沐 babamu@126.com
 */
@Service
@AllArgsConstructor
public class SmsLogServiceImpl extends BaseServiceImpl<SmsLogDao, SmsLogEntity> implements SmsLogService {

    @Override
    public PageResult<SmsLogVO> page(SmsLogQuery query) {
        IPage<SmsLogEntity> page = baseMapper.selectPage(getPage(query), getWrapper(query));

        return new PageResult<>(SmsLogConvert.INSTANCE.convertList(page.getRecords()), page.getTotal());
    }

    private LambdaQueryWrapper<SmsLogEntity> getWrapper(SmsLogQuery query){
        LambdaQueryWrapper<SmsLogEntity> wrapper = Wrappers.lambdaQuery();
        wrapper.eq(query.getPlatform() != null, SmsLogEntity::getPlatform, query.getPlatform());
        wrapper.like(query.getPlatformId() != null, SmsLogEntity::getPlatformId, query.getPlatformId());
        wrapper.orderByDesc(SmsLogEntity::getId);
        return wrapper;
    }

}