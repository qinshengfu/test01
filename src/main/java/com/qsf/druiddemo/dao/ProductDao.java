package com.qsf.druiddemo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qsf.druiddemo.entity.Product;
import org.apache.ibatis.annotations.Param;

public interface ProductDao extends BaseMapper<Product> {
    Product queryProductById(@Param("id") Integer id);
}
