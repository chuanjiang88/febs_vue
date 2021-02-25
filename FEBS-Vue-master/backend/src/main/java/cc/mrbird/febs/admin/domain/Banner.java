package cc.mrbird.febs.admin.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * </p>
 *
 * @author xucj
 * @since 2021/2/25
 */
@Data
@TableName("fdc_banner")
@ApiModel(value = "轮播图")
public class Banner implements Serializable {

    @ApiModelProperty(value = "id",dataType = "int")
    @TableId(value = "id", type = IdType.AUTO)
    private int id;

    @ApiModelProperty(value = "banner地址",dataType = "String")
    private String bannerUrl;

    @ApiModelProperty(value = "banner类型：1图片，2视频",dataType = "String")
    private String bannerType;

    @ApiModelProperty(value = "banner序号",dataType = "Integer")
    private Integer bannerSort;

    @ApiModelProperty(value = "跳转地址",dataType = "String")
    private String goToUrl;

}
