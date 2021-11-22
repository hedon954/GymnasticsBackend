package com.whu.gymnastics.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("tbl_doctor")
@ApiModel(value="Doctor对象", description="")
public class Doctor implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer doctorId;

    private String dcotorName;

    private String doctorIdentifier;

    private String doctorPhone;


}
