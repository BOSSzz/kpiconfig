package com.kingnetdc.dataplatform.service.repository;

import com.kingnetdc.dataplatform.service.model.DependsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * Created by zhoujiongy on 2016/9/7.
 */
public interface DependRepository extends JpaRepository<DependsEntity, Integer> {
}
