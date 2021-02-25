package cc.mrbird.febs.restful.service.impl;

import cc.mrbird.febs.restful.dao.ProceduresUserMapper;
import cc.mrbird.febs.restful.domain.ProceduresUser;
import cc.mrbird.febs.restful.service.ProceduresUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProceduresUserServiceImpl extends ServiceImpl<ProceduresUserMapper,ProceduresUser> implements ProceduresUserService {



}
