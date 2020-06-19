package com.gao.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 博客实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "t_blog")
public class Blog {


    private Long id;
    private String title;
    private String content;
    private String firstPicture;
    private String flag;
    private Integer views;
    private boolean appreciation;
    private boolean shareStatement;
    private boolean commentabled;
    private boolean published;
    private boolean recommend;
    private Date createTime;
    private Date updateTime;
    //这个属性用来在mybatis中进行连接查询的
    private Long typeId;
    private Long userId;
    //获取多个标签的id
    private String tagIds;
    private String description;

    private Type type;

    private User user;

    //一条博客对应多个标签
    private List<Tag> tags = new ArrayList<>();

    //一条博客对应多条评论
    private List<Comment> comments = new ArrayList<>();


}
