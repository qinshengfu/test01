package com.qsf.druiddemo.mapper;

import com.qsf.druiddemo.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class ProductMapperTest {
    @Autowired
    private ProductMapper productMapper;

    @Test
    void queryProductById() {
        Product product = productMapper.queryProductById(61,"1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20");
        System.out.println(product);
        /*ProductImg productImg=new ProductImg();
        Product product=new Product();
        productImg.setImgAddr("123456");
        productImg.setCrr("5646423");
        product.setProductImg(productImg);
        System.out.println(product);*/

    }
}