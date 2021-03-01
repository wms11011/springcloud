package com.simple.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author 王旻爽
 * 2021/2/24
 * @ClassName StorageDao.java
 */
@Mapper
public interface StorageDao {
   void decrease(@Param("productId") Long productId,@Param("count") Integer count);
}
