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
@TableName("fdc_procedures_user")
@ApiModel(value = "小程序用户")
public class ProceduresUser implements Serializable {

    @ApiModelProperty(value = "id",dataType = "int")
    @TableId(value = "id", type = IdType.AUTO)
    private int id;

    @ApiModelProperty(value = "手机号",dataType = "String")
    private String phone;

    @ApiModelProperty(value = "微信昵称",dataType = "String")
    private String wxName;

    @ApiModelProperty(value = "用户名称",dataType = "String")
    private String userName;

    @ApiModelProperty(value = "我的推荐人手机号",dataType = "String")
    private String recommendatinoPhone;

    @ApiModelProperty(value = "头像",dataType = "String")
    private String headUrl;

    @ApiModelProperty(value = "我的推荐人数",dataType = "int")
    private int recommendatinoCount;

    @ApiModelProperty(value = "我的看房次数",dataType = "int")
    private int lookHouseCount;

    @ApiModelProperty(value = "我的佣金金额",dataType = "BigDecimal")
    private BigDecimal commissionPrice;

    @ApiModelProperty(value = "创建时间",dataType = "Date")
    private Date createDate;

}
