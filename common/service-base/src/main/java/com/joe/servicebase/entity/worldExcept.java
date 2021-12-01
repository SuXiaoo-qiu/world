package com.joe.servicebase.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class worldExcept extends  RuntimeException {


    @ApiModelProperty(value = "状态码")
    public Integer code;

    @ApiModelProperty(value = "异常信息")
    public String msg;


}
