package com.itjiaochen.service.impl;

import com.itjiaochen.entity.Article;
import com.itjiaochen.mapper.ArticleMapper;
import com.itjiaochen.service.IArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 
 * @since 2022-04-04
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements IArticleService {

}
