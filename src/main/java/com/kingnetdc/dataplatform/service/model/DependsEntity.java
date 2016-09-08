package com.kingnetdc.dataplatform.service.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by zhoujiongy on 2016/9/7.
 */
@Entity
@Table(name = "depends", schema = "autokpi", catalog = "")
public class DependsEntity {
    private String dependCode;
    private Timestamp createTime;
    private Timestamp lastUpdate;

    @Id
    @Column(name = "depend_code", nullable = false, length = 255)
    public String getDependCode() {
        return dependCode;
    }

    public void setDependCode(String dependCode) {
        this.dependCode = dependCode;
    }

    @Basic
    @Column(name = "create_time", nullable = false)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "last_update", nullable = false)
    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DependsEntity that = (DependsEntity) o;

        if (dependCode != null ? !dependCode.equals(that.dependCode) : that.dependCode != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (lastUpdate != null ? !lastUpdate.equals(that.lastUpdate) : that.lastUpdate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dependCode != null ? dependCode.hashCode() : 0;
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (lastUpdate != null ? lastUpdate.hashCode() : 0);
        return result;
    }
}
