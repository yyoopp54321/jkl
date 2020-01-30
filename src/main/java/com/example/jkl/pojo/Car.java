package com.example.jkl.pojo;

import lombok.Data;

import java.util.Date;
import javax.persistence.*;
@Data
@Table(name = "t_car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "u_id")
    private Integer uId;

    @Column(name = "g_id")
    private Integer gId;

    @Column(name = "g_name")
    private String gName;

    @Column(name = "g_price")
    private Long gPrice;

    @Column(name = "g_count")
    private Integer gCount;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return u_id
     */
    public Integer getuId() {
        return uId;
    }

    /**
     * @param uId
     */
    public void setuId(Integer uId) {
        this.uId = uId;
    }

    /**
     * @return g_id
     */
    public Integer getgId() {
        return gId;
    }

    /**
     * @param gId
     */
    public void setgId(Integer gId) {
        this.gId = gId;
    }

    /**
     * @return g_name
     */
    public String getgName() {
        return gName;
    }

    /**
     * @param gName
     */
    public void setgName(String gName) {
        this.gName = gName == null ? null : gName.trim();
    }

    /**
     * @return g_price
     */
    public Long getgPrice() {
        return gPrice;
    }

    /**
     * @param gPrice
     */
    public void setgPrice(Long gPrice) {
        this.gPrice = gPrice;
    }

    /**
     * @return g_count
     */
    public Integer getgCount() {
        return gCount;
    }

    /**
     * @param gCount
     */
    public void setgCount(Integer gCount) {
        this.gCount = gCount;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}