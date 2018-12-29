package com.tesquare.base.dao;

import com.tesquare.base.pojo.Label;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


/**
 * @ProjectName: tensquare_parent53
 * @Package: com.tesquare.base.dao
 * @ClassName: LabelDao
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2018/12/20 22:33
 * @Version: 1.0
 */
public interface LabelDao  extends JpaRepository<Label,String>,JpaSpecificationExecutor {
}
