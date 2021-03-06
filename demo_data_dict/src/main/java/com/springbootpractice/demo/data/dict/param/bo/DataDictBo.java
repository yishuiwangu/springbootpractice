package com.springbootpractice.demo.data.dict.param.bo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 说明：数据字典业务实体
 * @author carter
 * 创建时间： 2020年02月03日 8:51 下午
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("数据字典业务实体")
public class DataDictBo implements Serializable {
    private static final long serialVersionUID = 992970216765589494L;

    @ApiModelProperty("列名")
    private String COLUMN_NAME;

    @ApiModelProperty("列类型")
    private String COLUMN_TYPE;

    @ApiModelProperty("列备注")
    private String COLUMN_COMMENT;

    @ApiModelProperty("额外限制")
    private String EXTRA;

    @ApiModelProperty("是否为空")
    private String IS_NULLABLE;

    @ApiModelProperty("列默认值")
    private String COLUMN_DEFAULT;

    @ApiModelProperty("表名")
    private String TABLE_NAME;


}
