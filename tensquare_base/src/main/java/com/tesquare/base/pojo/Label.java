package com.tesquare.base.pojo;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @ProjectName: tensquare_parent53
 * @Package: com.tesquare.base.pojo
 * @ClassName: Label
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2018/12/20 22:36
 * @Version: 1.0
 */
/*和数据库表一样的类型*/
@Entity
@Table(name="tb_label")
public class Label implements Serializable {
    @Id
    private String id;
    private String labelname;//标签名称
    private String state;//状态
    private Long count;//使用数量
    private Long fans;//关注数
    private String recommed;//是否途径

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLabelname() {
        return labelname;
    }

    public void setLabelname(String labelname) {
        this.labelname = labelname;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Long getFans() {
        return fans;
    }

    public void setFans(Long fans) {
        this.fans = fans;
    }

    public String getRecommed() {
        return recommed;
    }

    public void setRecommed(String recommed) {
        this.recommed = recommed;
    }
}

