package cc.mrbird.febs.admin.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * </p>
 *
 * @author xucj
 * @since 2021/2/25
 */
@Data
@TableName("fdc_real_estate")
@ApiModel(value = "楼盘")
public class RealEstate implements Serializable {

    @ApiModelProperty(value = "id",dataType = "int")
    @TableId(value = "id", type = IdType.AUTO)
    private int id;

    @ApiModelProperty(value = "楼盘编号",dataType = "String")
    private String realEstateNo;

    @ApiModelProperty(value = "楼盘名称",dataType = "String")
    private String realEstateName;

    @ApiModelProperty(value = "楼盘地址",dataType = "String")
    private String address;

    @ApiModelProperty(value = "上线金额",dataType = "BigDecimal")
    private BigDecimal startPrice;

    @ApiModelProperty(value = "下线金额",dataType = "String")
    private String endPrice;

    @ApiModelProperty(value = "联系电话",dataType = "String")
    private String telephoneContact;

    @ApiModelProperty(value = "优惠信息",dataType = "String")
    private String preferentialInformation;

    @ApiModelProperty(value = "推介奖励",dataType = "String")
    private String recommendationIncentives;

    @ApiModelProperty(value = "佣金细则",dataType = "String")
    private String commissionRules;

    @ApiModelProperty(value = "开盘时间",dataType = "Date")
    private Date openHoursDate;

    @ApiModelProperty(value = "楼盘编号",dataType = "Date")
    private Date deliveryDate;

    @ApiModelProperty(value = "产权类型",dataType = "String")
    private String propertyType;

    @ApiModelProperty(value = "产权",dataType = "String")
    private String property;

    @ApiModelProperty(value = "物业公司",dataType = "String")
    private String propertyCompany;

    @ApiModelProperty(value = "开始区间面积",dataType = "BigDecimal")
    private BigDecimal startAreaInterval;

    @ApiModelProperty(value = "结束区间面积",dataType = "BigDecimal")
    private BigDecimal endAreaInterval;

    @ApiModelProperty(value = "开始户型区间",dataType = "String")
    private String startHuxingInterval;

    @ApiModelProperty(value = "结束户型区间",dataType = "String")
    private String endHuxingInterval;

    @ApiModelProperty(value = "楼盘介绍",dataType = "String")
    private String realEstateIntroduction;

    @ApiModelProperty(value = "项目配套",dataType = "String")
    private String realEstateAssort;

    @ApiModelProperty(value = "项目商业",dataType = "String")
    private String realEstateCommerce;

}
