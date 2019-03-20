package com.jsh.demo.entity;

import org.springframework.data.annotation.Id;

import javax.persistence.*;

/**
 * 测试实体类
 *
 * @author Leo
 *
 */
@Entity
@Table(name = "DEMO")
public class TestDemo {

    /**
     * 主键序号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 10, nullable = false)
    private Integer id;
    /**
     * 名称
     */
    @Column(length = 20)
    private String demoName;
    /**
     * 描述
     */
    @Column(length = 200)
    private String demoDesc;

    /**
     * 更新
     * @param demoname
     */
    public void updateName(String demoname){
        this.demoName = demoName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDemoName() {
        return demoName;
    }

    public void setDemoName(String demoName) {
        this.demoName = demoName;
    }

    public String getDemoDesc() {
        return demoDesc;
    }

    public void setDemoDesc(String demoDesc) {
        this.demoDesc = demoDesc;
    }

    @Override
    public String toString() {
        return "TestDemo{" +
                "id=" + id +
                ", demoName='" + demoName + '\'' +
                ", demoDesc='" + demoDesc + '\'' +
                '}';
    }
}
