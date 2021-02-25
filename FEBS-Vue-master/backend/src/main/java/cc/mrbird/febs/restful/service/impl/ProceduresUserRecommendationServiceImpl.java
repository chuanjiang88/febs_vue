package cc.mrbird.febs.restful.service.impl;

import cc.mrbird.febs.restful.dao.ProceduresUserRecommendationMapper;
import cc.mrbird.febs.restful.domain.ProceduresUserRecommendation;
import cc.mrbird.febs.restful.service.ProceduresUserRecommendationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *     推荐用户服务
 * </p>
 *
 * @author xucj
 * @since 2021/2/25
 */
@Slf4j
@Service
@Transactional
public class ProceduresUserRecommendationServiceImpl extends ServiceImpl<ProceduresUserRecommendationMapper, ProceduresUserRecommendation> implements ProceduresUserRecommendationService {
}
