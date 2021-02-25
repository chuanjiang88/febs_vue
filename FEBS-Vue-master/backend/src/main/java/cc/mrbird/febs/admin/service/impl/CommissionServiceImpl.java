package cc.mrbird.febs.admin.service.impl;

import cc.mrbird.febs.admin.dao.CommissionMapper;
import cc.mrbird.febs.admin.domain.Commission;
import cc.mrbird.febs.admin.service.CommissionService;
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
@Slf4j
@Service
@Transactional
public class CommissionServiceImpl extends ServiceImpl<CommissionMapper, Commission> implements CommissionService {

}
