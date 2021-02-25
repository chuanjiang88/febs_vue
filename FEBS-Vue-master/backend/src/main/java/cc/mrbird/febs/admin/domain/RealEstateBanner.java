package cc.mrbird.febs.admin.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("fdc_real_estate_banner")
@ApiModel(value = "楼盘相册")
public class RealEstateBanner implements Serializable {

    @ApiModelProperty(value = "id",dataType = "int")
    @TableId(value = "id", type = IdType.AUTO)
    private int id;

    @ApiModelProperty(value = "楼盘编号",dataType = "String")
    private String realEstateNo;

    @ApiModelProperty(value = "banner地址",dataType = "String")
    private String bannerUrl;

    @ApiModelProperty(value = "banner类型：1图片、2视频",dataType = "String")
    private String bannerType;

    @ApiModelProperty(value = "banner序号",dataType = "Integer")
    private Integer bannerSort;

    @ApiModelProperty(value = "跳转地址",dataType = "String")
    private String goToUrl;
}
