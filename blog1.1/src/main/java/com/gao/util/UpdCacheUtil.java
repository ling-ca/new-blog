package com.gao.util;

import com.gao.service.BlogService;
import com.gao.service.Impl.BlogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 更新数据库中的浏览量信息
 */
public class UpdCacheUtil {

    @Autowired
    private static BlogService blogService;

    public static void updViewsCache(String blogId, Integer views){

        if((views != 0)&&(views%10 == 0)){

            blogService.updViewsByBlogId(blogId, views);
        }
    }
}
