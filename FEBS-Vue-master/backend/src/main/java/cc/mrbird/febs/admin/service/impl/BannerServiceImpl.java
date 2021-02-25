package cc.mrbird.febs.admin.service.impl;

import cc.mrbird.febs.admin.dao.BannerMapper;
import cc.mrbird.febs.admin.domain.Banner;
import cc.mrbird.febs.admin.service.BannerService;
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
public class BannerServiceImpl extends ServiceImpl<BannerMapper, Banner> implements BannerService {
}
