package cn.edu.jxufe.dao;

import cn.edu.jxufe.entity.TbProduct;
import org.springframework.stereotype.Repository;

/**
 * TbProductDAO继承基类
 */
@Repository
public interface TbProductDAO extends MyBatisBaseDao<TbProduct, Integer> {
}