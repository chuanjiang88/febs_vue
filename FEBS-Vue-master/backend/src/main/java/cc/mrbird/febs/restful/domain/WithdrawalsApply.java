package cc.mrbird.febs.restful.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@TableName("fdc_withdrawals_apply")
@ApiModel(value = "提现申请")
public class WithdrawalsApply implements Serializable {

    @ApiModelProperty(value = "id",dataType = "int")
    @TableId(value = "id", type = IdType.AUTO)
    private int id;

    @ApiModelProperty(value = "申请单号",dataType = "String")
    private String applyNo;

    @ApiModelProperty(value = "佣金单号",dataType = "String")
    private String commissionNo;

    @ApiModelProperty(value = "手机号",dataType = "String")
    private String phone;

    @ApiModelProperty(value = "微信昵称",dataType = "String")
    private String wxName;

    @ApiModelProperty(value = "用户名",dataType = "String")
    private String userName;

    @ApiModelProperty(value = "提现金额",dataType = "BigDecimal")
    private BigDecimal withdrawalsPrice;

    @ApiModelProperty(value = "银行卡号",dataType = "String")
    private String bankNo;

    @ApiModelProperty(value = "开卡行名称",dataType = "String")
    private String bankName;

    @ApiModelProperty(value = "开户人姓名",dataType = "String")
    private String accountName;

    @ApiModelProperty(value = "开户支行地址",dataType = "String")
    private String bankAddress;

    @ApiModelProperty(value = "提现状态:1申请中、2已提现、3提现失败",dataType = "String")
    private String withdrawalsStatus;

    @ApiModelProperty(value = "提现失败原因",dataType = "String")
    private String failReasons;

    @ApiModelProperty(value = "创建时间",dataType = "Date")
    private Date createDate;
}
