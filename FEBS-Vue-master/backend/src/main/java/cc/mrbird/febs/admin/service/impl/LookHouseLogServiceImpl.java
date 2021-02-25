package cc.mrbird.febs.admin.service.impl;

import cc.mrbird.febs.admin.dao.LookHouseLogMapper;
import cc.mrbird.febs.admin.domain.LookHouseLog;
import cc.mrbird.febs.admin.service.LookHouseLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@Transactional
public class LookHouseLogServiceImpl extends ServiceImpl<LookHouseLogMapper, LookHouseLog> implements LookHouseLogService {



}
