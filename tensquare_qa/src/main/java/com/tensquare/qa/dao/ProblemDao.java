package com.tensquare.qa.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.tensquare.qa.pojo.Problem;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * 数据访问接口
 * @author Administrator
 *
 */
public interface ProblemDao extends JpaRepository<Problem,String>,JpaSpecificationExecutor<Problem>{
    /*native 叫做本地查询 意思就是使用原生态的sql语句*/
    /*分页返回的一定是page*/
    @Query(value = "select * from tb_pl,tb_problem where problemid=id and labelid=? order by replytime desc ",nativeQuery = true)
    public Page<Problem> newlist(String labelid,Pageable pageable);
    @Query(value = "select * from tb_pl,tb_problem where problemid=id and labelid=? order by reply desc ",nativeQuery = true)
    public Page<Problem> hotlist(String labelid,Pageable pageable);
    @Query(value = "select * from tb_pl,tb_problem where problemid=id and labelid=? order by replytime desc  ",nativeQuery = true)
    public Page<Problem> waitlist(String labbelid,Pageable pageable);
}
