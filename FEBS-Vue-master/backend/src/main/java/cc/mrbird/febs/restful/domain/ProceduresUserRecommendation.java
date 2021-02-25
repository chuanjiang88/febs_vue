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
@TableName("fdc_procedures_user_recommendation")
@ApiModel(value = "小程序用户推荐")
public class ProceduresUserRecommendation implements Serializable {

    @ApiModelProperty(value = "id",dataType = "int")
    @TableId(value = "id", type = IdType.AUTO)
    private int id;

    @ApiModelProperty(value = "手机号",dataType = "String")
    private String phone;

    @ApiModelProperty(value = "下级推荐人手机号",dataType = "String")
    private String belowPhone;

    @ApiModelProperty(value = "手机号",dataType = "Date")
    private Date createDate;

    @ApiModelProperty(value = "推荐人微信昵称",dataType = "String")
    private String wxName;

    @ApiModelProperty(value = "推荐人用户名称",dataType = "String")
    private String userName;

}
