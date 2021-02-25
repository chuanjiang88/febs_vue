package cc.mrbird.febs.restful.controller;

import cc.mrbird.febs.common.controller.BaseController;
import io.swagger.annotations.ApiModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *     用户银行卡
 * </p>
 *
 * @author xucj
 * @since 2021/2/25
 */
@Slf4j
@Validated
@RestController
@RequestMapping("/restful/proceduresUserBank")
@ApiModel(value = "ProceduresUserBankController",description = "小程序用户银行卡")
public class ProceduresUserBankController extends BaseController {
}
