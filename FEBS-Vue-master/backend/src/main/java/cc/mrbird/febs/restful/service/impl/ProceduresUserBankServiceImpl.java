package cc.mrbird.febs.restful.service.impl;

import cc.mrbird.febs.restful.dao.ProceduresUserBankMapper;
import cc.mrbird.febs.restful.domain.ProceduresUserBank;
import cc.mrbird.febs.restful.service.ProceduresUserBankService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * </p>
 *
 * @author xucj
 * @since 2021/2/25
 */
@Service
@Slf4j
@Transactional
public class ProceduresUserBankServiceImpl extends ServiceImpl<ProceduresUserBankMapper, ProceduresUserBank> implements ProceduresUserBankService {



}
