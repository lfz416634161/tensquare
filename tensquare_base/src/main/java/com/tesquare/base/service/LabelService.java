package com.tesquare.base.service;

import com.tesquare.base.dao.LabelDao;
import com.tesquare.base.pojo.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import util.IdWorker;

import java.util.List;

/**
 * @ProjectName: tensquare_parent53
 * @Package: com.tesquare.base.service
 * @ClassName: LabelService
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2018/12/20 22:40
 * @Version: 1.0
 */
@Service
@Transactional
public class LabelService {
    /*这个是操作数据库*/
    @Autowired
    private LabelDao labelDao;
    @Autowired
    private IdWorker idWorker;

    public List<Label>findAll(){
        return labelDao.findAll();
    }
    public Label findById(String id){
        System.out.println("找到他的ID"+labelDao.findById(id));
        System.out.println("找到他的ID然后给个GET"+labelDao.findById(id).get());
        return labelDao.findById(id).get();
    }
    public void save(Label label){
        label.setId(idWorker.nextId()+"");
        labelDao.save(label);
    }
    public void update(Label label){
        labelDao.save(label);
    }
    public void delete(String id){
        labelDao.deleteById(id);
    }

}
