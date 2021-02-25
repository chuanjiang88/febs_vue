package cc.mrbird.febs.admin.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("fdc_real_huxing")
@ApiModel(value = "楼盘户型")
public class RealHuxing implements Serializable {
    @ApiModelProperty(value = "id",dataType = "int")
    @TableId(value = "id", type = IdType.AUTO)
    private int id;

    @ApiModelProperty(value = "楼盘编号",dataType = "String")
    private String realEstateNo;

    @ApiModelProperty(value = "户型编号",dataType = "String")
    private String huxingNo;

    @ApiModelProperty(value = "户型图片地址",dataType = "String")
    private String bannerUrl;

    @ApiModelProperty(value = "是否主打户型：1是0否",dataType = "String")
    private String isMajorHuxing;

    @ApiModelProperty(value = "房数",dataType = "Integer")
    private Integer roomNum;

    @ApiModelProperty(value = "厅数",dataType = "Integer")
    private Integer officeNum;

    @ApiModelProperty(value = "建筑面积",dataType = "String")
    private String constructionArea;

    @ApiModelProperty(value = "开始楼层",dataType = "String")
    private String startFloor;

    @ApiModelProperty(value = "结束楼层",dataType = "String")
    private String endFloor;

    @ApiModelProperty(value = "户型介绍",dataType = "String")
    private String huxingIntroduction;
}
