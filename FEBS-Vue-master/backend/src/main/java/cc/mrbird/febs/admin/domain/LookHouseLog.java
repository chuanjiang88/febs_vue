package cc.mrbird.febs.admin.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * </p>
 *
 * @author xucj
 * @since 2021/2/25
 */
@Data
@TableName("fdc_look_house_log")
@ApiModel(value = "看房记录")
public class LookHouseLog implements Serializable {

    @ApiModelProperty(value = "id",dataType = "int")
    @TableId(value = "id", type = IdType.AUTO)
    private int id;

    @ApiModelProperty(value = "手机号",dataType = "String")
    private String phone;

    @ApiModelProperty(value = "微信昵称",dataType = "String")
    private String wxName;

    @ApiModelProperty(value = "用户名称",dataType = "String")
    private String userName;

    @ApiModelProperty(value = "楼盘编号",dataType = "String")
    private String realEstateNo;

    @ApiModelProperty(value = "楼盘名称",dataType = "String")
    private String realEstateName;

    @ApiModelProperty(value = "看房时间",dataType = "Date")
    private Date createDate;

    @ApiModelProperty(value = "结束时间",dataType = "Date")
    private Date endDate;

    @ApiModelProperty(value = "创建人ID",dataType = "String")
    private String createUserId;
}
