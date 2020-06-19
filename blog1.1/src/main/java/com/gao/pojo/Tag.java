package com.gao.pojo;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "t_tag")
public class Tag {
    private Long id;
    private String name;

    private List<Blog> blogs = new ArrayList<>();
}
