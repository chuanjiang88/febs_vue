package cc.mrbird.febs.system.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * <p>
 *     图片信息
 * </p>
 *
 * @author Administrator
 * @since 2021/2/5
 */
@Data
@ApiModel("图片信息")
public class ImageInfoDTO {

    @NotNull
    @ApiModelProperty(value = "图片类型：1身份证、2社保卡...",dataType = "String")
    private String imageType;

    @ApiModelProperty(value = "图片base64编码",dataType = "String")
    private String imageBase64Str;

}
