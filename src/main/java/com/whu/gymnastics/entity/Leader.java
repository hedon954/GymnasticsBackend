package com.whu.gymnastics.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author hedon
 * @since 2021-11-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tbl_leader")
@ApiModel(value="Leader对象", description="")
public class Leader implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "leader_id", type = IdType.AUTO)
    private Integer leaderId;

    private String leaderName;

    private String leaderIdentifier;

    private String leaderPhone;


}
