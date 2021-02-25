package cc.mrbird.febs.restful.domain;

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
@TableName("fdc_procedures_user_bank")
@ApiModel(value = "小程序用户银行卡")
public class ProceduresUserBank implements Serializable {

    @ApiModelProperty(value = "id",dataType = "int")
    @TableId(value = "id", type = IdType.AUTO)
    private int id;

    @ApiModelProperty(value = "手机号",dataType = "String")
    private String phone;

    @ApiModelProperty(value = "银行卡号",dataType = "String")
    private String bankNo;

    @ApiModelProperty(value = "开卡行名称",dataType = "String")
    private String bankName;

    @ApiModelProperty(value = "银行卡持有人名称",dataType = "String")
    private String accountName;

    @ApiModelProperty(value = "开户支行地址",dataType = "String")
    private String bankAddress;

    @ApiModelProperty(value = "手机号",dataType = "Date")
    private Date createDate;
}
