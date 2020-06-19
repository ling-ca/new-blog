package com.gao.pojo;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * 类型
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "t_type")
public class Type {
    private Long id;
    private String name;

    private List<Blog> blogs = new ArrayList<>();
}
