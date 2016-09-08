package com.kingnetdc.dataplatform.service.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;


/**
 * Created by zhoujiongy on 2016/9/6.
 */
@Entity
@Table(name = "tasks", schema = "autokpi", catalog = "")
public class TasksEntity {
    private int taskId;
    private String name;
    private String title;
    private int groupId;
    private int userId;
    private Timestamp startTime;
    private Timestamp endTime;
    private byte span;
    private String period;
    private Timestamp nextTime;
    private int poolId;
    private String dbName;
    private byte dbType;
    private String tableName;
    private byte tableType;
    private String dims;
    private String indicators;
    private String sqlInitial;
    private String status;
    private Timestamp lastUpdate;

    @Id
    @Column(name = "task_id", nullable = false)
    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 60)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "title", nullable = false, length = 60)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "group_id", nullable = false)
    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    @Basic
    @Column(name = "user_id", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "start_time", nullable = false)
    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    @Basic
    @Column(name = "end_time", nullable = false)
    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    @Basic
    @Column(name = "span", nullable = false)
    public byte getSpan() {
        return span;
    }

    public void setSpan(byte span) {
        this.span = span;
    }

    @Basic
    @Column(name = "period", nullable = false)
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    @Basic
    @Column(name = "next_time", nullable = false)
    public Timestamp getNextTime() {
        return nextTime;
    }

    public void setNextTime(Timestamp nextTime) {
        this.nextTime = nextTime;
    }

    @Basic
    @Column(name = "pool_id", nullable = false)
    public int getPoolId() {
        return poolId;
    }

    public void setPoolId(int poolId) {
        this.poolId = poolId;
    }

    @Basic
    @Column(name = "db_name", nullable = false, length = 300)
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    @Basic
    @Column(name = "db_type", nullable = false)
    public byte getDbType() {
        return dbType;
    }

    public void setDbType(byte dbType) {
        this.dbType = dbType;
    }

    @Basic
    @Column(name = "table_name", nullable = false, length = 300)
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Basic
    @Column(name = "table_type", nullable = false)
    public byte getTableType() {
        return tableType;
    }

    public void setTableType(byte tableType) {
        this.tableType = tableType;
    }

    @Basic
    @Column(name = "dims", nullable = false, length = -1)
    public String getDims() {
        return dims;
    }

    public void setDims(String dims) {
        this.dims = dims;
    }

    @Basic
    @Column(name = "indicators", nullable = false, length = -1)
    public String getIndicators() {
        return indicators;
    }

    public void setIndicators(String indicators) {
        this.indicators = indicators;
    }

    @Basic
    @Column(name = "sql_initial", nullable = true, length = -1)
    public String getSqlInitial() {
        return sqlInitial;
    }

    public void setSqlInitial(String sqlInitial) {
        this.sqlInitial = sqlInitial;
    }

    @Basic
    @Column(name = "status", nullable = true)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

        TasksEntity that = (TasksEntity) o;

        if (taskId != that.taskId) return false;
        if (groupId != that.groupId) return false;
        if (userId != that.userId) return false;
        if (span != that.span) return false;
        if (poolId != that.poolId) return false;
        if (dbType != that.dbType) return false;
        if (tableType != that.tableType) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (startTime != null ? !startTime.equals(that.startTime) : that.startTime != null) return false;
        if (endTime != null ? !endTime.equals(that.endTime) : that.endTime != null) return false;
        if (nextTime != null ? !nextTime.equals(that.nextTime) : that.nextTime != null) return false;
        if (dbName != null ? !dbName.equals(that.dbName) : that.dbName != null) return false;
        if (tableName != null ? !tableName.equals(that.tableName) : that.tableName != null) return false;
        if (dims != null ? !dims.equals(that.dims) : that.dims != null) return false;
        if (indicators != null ? !indicators.equals(that.indicators) : that.indicators != null) return false;
        if (sqlInitial != null ? !sqlInitial.equals(that.sqlInitial) : that.sqlInitial != null) return false;
        if (lastUpdate != null ? !lastUpdate.equals(that.lastUpdate) : that.lastUpdate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = taskId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + groupId;
        result = 31 * result + userId;
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        result = 31 * result + (int) span;
        result = 31 * result + (nextTime != null ? nextTime.hashCode() : 0);
        result = 31 * result + poolId;
        result = 31 * result + (dbName != null ? dbName.hashCode() : 0);
        result = 31 * result + (int) dbType;
        result = 31 * result + (tableName != null ? tableName.hashCode() : 0);
        result = 31 * result + (int) tableType;
        result = 31 * result + (dims != null ? dims.hashCode() : 0);
        result = 31 * result + (indicators != null ? indicators.hashCode() : 0);
        result = 31 * result + (sqlInitial != null ? sqlInitial.hashCode() : 0);
        result = 31 * result + (lastUpdate != null ? lastUpdate.hashCode() : 0);
        return result;
    }
}
