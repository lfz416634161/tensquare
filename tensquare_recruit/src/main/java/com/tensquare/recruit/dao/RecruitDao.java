package com.tensquare.recruit.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.tensquare.recruit.pojo.Recruit;

import java.util.List;

/**
 * 数据访问接口
 * @author Administrator
 *
 */
public interface RecruitDao extends JpaRepository<Recruit,String>,JpaSpecificationExecutor<Recruit>{
	/*findTop开头的是取前一个  但是可以 findTop6 取6个*/
    public List<Recruit> findTop6ByStateOrderByCreatetimeDesc(String state);//where statue=? order by createtime;
//StateNotStateorderBOrderByCreatetimeDesc
    public List<Recruit> findTop6ByStateNotOrderByCreatetimeDesc(String state);//where statue!=? order by createtiem

}
