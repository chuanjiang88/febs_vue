package cc.mrbird.febs.admin.service.impl;

import cc.mrbird.febs.admin.dao.RealEstateBannerMapper;
import cc.mrbird.febs.admin.domain.RealEstateBanner;
import cc.mrbird.febs.admin.service.RealEstateBannerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *     楼盘相册服务
 * </p>
 *
 * @author xucj
 * @since 2021/2/25
 */
@Slf4j
@Service
@Transactional
public class RealEstateBannerServiceImpl extends ServiceImpl<RealEstateBannerMapper, RealEstateBanner> implements RealEstateBannerService {
}
