package cc.mrbird.febs.admin.service.impl;

import cc.mrbird.febs.admin.dao.RealEstateMapper;
import cc.mrbird.febs.admin.domain.RealEstate;
import cc.mrbird.febs.admin.service.RealEstateService;
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
public class RealEstateServiceImpl extends ServiceImpl<RealEstateMapper, RealEstate> implements RealEstateService {
}
