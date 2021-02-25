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
@TableName("fdc_commission")
@ApiModel(value = "佣金记录")
public class Commission implements Serializable {

    @ApiModelProperty(value = "id",dataType = "int")
    @TableId(value = "id", type = IdType.AUTO)
    private int id;

    @ApiModelProperty(value = "成交单号",dataType = "String")
    private String orderNo;

    @ApiModelProperty(value = "佣金单号",dataType = "String")
    private String commissionNo;

    @ApiModelProperty(value = "手机号",dataType = "String")
    private String phone;

    @ApiModelProperty(value = "微信昵称",dataType = "String")
    private String wxName;

    @ApiModelProperty(value = "用户名称",dataType = "String")
    private String userName;

    @ApiModelProperty(value = "佣金金额",dataType = "BigDecimal")
    private BigDecimal commissionPrice;

    @ApiModelProperty(value = "楼盘名称",dataType = "String")
    private String realEstateName;

    @ApiModelProperty(value = "户型编号",dataType = "String")
    private String huxingNo;

    @ApiModelProperty(value = "成交金额",dataType = "BigDecimal")
    private BigDecimal transactionPrice;

    @ApiModelProperty(value = "手机号",dataType = "Date")
    private Date createDate;

    @ApiModelProperty(value = "创建人ID",dataType = "String")
    private String createUserId;
}
