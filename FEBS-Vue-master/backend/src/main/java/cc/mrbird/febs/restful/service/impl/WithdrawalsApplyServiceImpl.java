package cc.mrbird.febs.restful.service.impl;

import cc.mrbird.febs.restful.dao.WithdrawalsApplyMapper;
import cc.mrbird.febs.restful.domain.WithdrawalsApply;
import cc.mrbird.febs.restful.service.WithdrawalsApplyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@Transactional
public class WithdrawalsApplyServiceImpl extends ServiceImpl<WithdrawalsApplyMapper, WithdrawalsApply> implements WithdrawalsApplyService {
}
