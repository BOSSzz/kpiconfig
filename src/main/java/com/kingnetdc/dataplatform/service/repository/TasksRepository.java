package com.kingnetdc.dataplatform.service.repository;

import com.kingnetdc.dataplatform.service.model.TasksEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Time;
import java.sql.Timestamp;


/**
 * Created by zhoujiongy on 2016/9/6.
 */
@Repository
public interface TasksRepository extends JpaRepository<TasksEntity, Integer> {
    @Query("select max(te.taskId) from TasksEntity te")
    int findMax() ;


    @Modifying
    @Transactional
    @Query("update TasksEntity te set te.taskId=:qTaskId, te.name=:qName, te.title=:qTitle, te.groupId=:qGroupId, te.userId=:qUserId, te.startTime=:qStartTime, " +
            "te.endTime=:qEndTime, te.span=:qSpan, te.period=:qPeriod, te.nextTime=:qNextTime, te.poolId=:qPoolId, te.dbName=:qDbName, te.dbType=:qDbType, " +
            "te.tableName=:qTableName, te.tableType=:qTableType, te.dims=:qDims, te.indicators=:qIndicators, te.sqlInitial=:qSqlInitial, te.status=:qStatus, " +
            "te.lastUpdate=:qLastUpdate")
    void updateTask(@Param("qTaskId") int taskId, @Param("qName") String name, @Param("qTitle") String title, @Param("qGroupId") int groupId, @Param("qUserId") int userId,
                    @Param("qStartTime") Timestamp startTime, @Param("qEndTime") Timestamp endTime, @Param("qSpan") int span, @Param("qPeriod") String period, @Param("qNextTime") Timestamp nextTime,
                    @Param("qPoolId") int poolId, @Param("qDbName") String dbName, @Param("qDbType") int dbType, @Param("qTableName") String tableName, @Param("qTableType") int tableType,
                    @Param("qDims") String dims, @Param("qIndicators") String indicators, @Param("qSqlInitial") String sqlInitial, @Param("qStatus") String status,
                    @Param("qLastUpdate") Timestamp lastUpdate);
}
