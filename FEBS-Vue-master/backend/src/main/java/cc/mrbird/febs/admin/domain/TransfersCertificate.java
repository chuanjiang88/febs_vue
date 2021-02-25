package cc.mrbird.febs.admin.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * </p>
 *
 * @author xucj
 * @since 2021/2/25
 */
@Data
@TableName("fdc_transfers_certificate")
@ApiModel(value = "转账凭证")
public class TransfersCertificate implements Serializable {

    @ApiModelProperty(value = "id",dataType = "int")
    @TableId(value = "id", type = IdType.AUTO)
    private int id;

    @ApiModelProperty(value = "申请单号",dataType = "String")
    private String applyNo;

    @ApiModelProperty(value = "用户手机号",dataType = "String")
    private String commissionPhone;

    @ApiModelProperty(value = "微信昵称",dataType = "String")
    private String wxName;

    @ApiModelProperty(value = "用户名称",dataType = "String")
    private String userName;

    @ApiModelProperty(value = "转账金额",dataType = "BigDecimal")
    private BigDecimal commissionPrice;

    @ApiModelProperty(value = "转账凭证图片URL",dataType = "String")
    private String transfersCertificateUrl;

    @ApiModelProperty(value = "创建时间",dataType = "Data")
    private Data createDate;

}
