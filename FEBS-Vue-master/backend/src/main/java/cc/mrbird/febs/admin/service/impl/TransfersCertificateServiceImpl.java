package cc.mrbird.febs.admin.service.impl;

import cc.mrbird.febs.admin.dao.TransfersCertificateMapper;
import cc.mrbird.febs.admin.domain.TransfersCertificate;
import cc.mrbird.febs.admin.service.TransfersCertificateService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *     转账凭证服务
 * </p>
 *
 * @author xucj
 * @since 2021/2/25
 */
@Slf4j
@Transactional
@Service
public class TransfersCertificateServiceImpl extends ServiceImpl<TransfersCertificateMapper, TransfersCertificate> implements TransfersCertificateService {
}
