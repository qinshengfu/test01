package com.qsf.druiddemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qsf.druiddemo.entity.Product;
import org.apache.ibatis.annotations.Param;

public interface ProductMapper extends BaseMapper<Product> {
    Product queryProductById(@Param("id") Integer id,@Param("imgAddr")String imgAddr);
}
