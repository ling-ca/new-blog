package com.gao.service.Impl;

import com.gao.dao.BlogDao;
import com.gao.pojo.Blog;
import com.gao.service.BlogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class BlogServiceImplTest {

    @Autowired
    private BlogService blogService;

    @Autowired
    private BlogDao blogDao;
    @Test
    public void updViewsByBlogId() throws Exception {

        blogService.updViewsByBlogId("1577792888747",99);

    }


}