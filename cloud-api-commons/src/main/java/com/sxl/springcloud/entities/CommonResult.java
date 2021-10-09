package com.sxl.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 统一结果返回类
 *
 * @author suqiancheng
 * @create 2021年09月23日 下午8:01
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String msg;
    private T data;
}
