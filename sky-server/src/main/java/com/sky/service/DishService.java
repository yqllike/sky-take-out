package com.sky.service;

import com.sky.dto.DishDTO;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public interface DishService {
    /**
     * 新增菜品和对应的口味
     * @param dishDTO
     */
    public void saveWithFlavor(DishDTO dishDTO);
}
