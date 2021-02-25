package cc.mrbird.febs.admin.controller;

import cc.mrbird.febs.common.controller.BaseController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *     轮播图管理
 * </p>
 *
 * @author xucj
 * @since 2021/2/25
 */
@Slf4j
@Validated
@RestController
@RequestMapping("/admin/banner")
public class BannerAdminController extends BaseController {
}
