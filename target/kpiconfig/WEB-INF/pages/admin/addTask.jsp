<%--
  Created by IntelliJ IDEA.
  User: zhoujiongy
  Date: 2016/9/7
  Time: 14:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>SpringMVC 添加用户</title>

    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<div class="container">
    <h1>SpringMVC 添加任务</h1>
    <h3><a href="/admin/tasks" type="button" class="btn btn-primary btn-sm">返回</a></h3>
    <hr/>
    <form:form action="/admin/tasks/addP" method="post" commandName="task" role="form">
        <div class="form-group">
            <label for="name">Name:</label>
            <input type="text" class="form-control" id="name" name="name" placeholder="Enter Name:" value=""/>
        </div>
        <div class="form-group">
            <label for="title">Title:</label>
            <input type="text" class="form-control" id="title" name="title" placeholder="Enter Title:" value=""/>
        </div>
        <div class="form-group">
            <label for="groupId">Group ID:</label>
            <input type="text" class="form-control" id="groupId" name="groupId" placeholder="Enter GroupID:" value="1"/>
        </div>
        <div class="form-group">
            <label for="userId">User ID:</label>
            <input type="text" class="form-control" id="userId" name="userId" placeholder="Enter UserID:" value="1"/>
        </div>
        <div class="form-group">
            <label for="startTime">Start Time:</label>
            <input type="text" class="form-control" id="startTime" name="startTime" placeholder="Enter StartTime:" value="2016-01-01 00:00:00"/>
        </div>

        <div class="form-group">
            <label for="endTime">End Time:</label>
            <input type="text" class="form-control" id="endTime" name="endTime" placeholder="Enter EndTime:" value="2020-01-01 00:00:00"/>
        </div>
        <div class="form-group">
            <label for="span">Span:</label>
            <input type="text" class="form-control" id="span" name="span" placeholder="Enter Span:" value="1"/>
        </div>
        <div class="form-group">
            <label for="period">Period:</label>
            <input type="text" class="form-control" id="period" name="period" placeholder="Enter Period:" value="DAY"/>
        </div>
        <div class="form-group">
            <label for="nextTime">Next Time:</label>
            <input type="text" class="form-control" id="nextTime" name="nextTime" placeholder="Enter NextTime:" value="2020-01-01 00:00:00"/>
        </div>
        <div class="form-group">
            <label for="poolId">Pool ID:</label>
            <input type="text" class="form-control" id="poolId" name="poolId" placeholder="Enter PoolID:" value="1"/>
        </div>
        <div class="form-group">
            <label for="dbName">Db Name:</label>
            <input type="text" class="form-control" id="dbName" name="dbName" placeholder="Enter dbName:" value=""/>
        </div>
        <div class="form-group">
            <label for="dbType">Db Type:</label>
            <input type="text" class="form-control" id="dbType" name="dbType" placeholder="Enter DbType:" value="1"/>
        </div>
        <div class="form-group">
            <label for="tableName">Table Name:</label>
            <input type="text" class="form-control" id="tableName" name="tableName" placeholder="Enter TableName:" value=""/>
        </div>
        <div class="form-group">
            <label for="tableType">Table Type:</label>
            <input type="text" class="form-control" id="tableType" name="tableType" placeholder="Enter TableType:" value="1"/>
        </div>
        <div class="form-group">
            <label for="dims">Dims:</label>
            <input type="text" class="form-control" id="dims" name="dims" placeholder="Enter Dims:" value=""/>
        </div>
        <div class="form-group">
            <label for="indicators">Indicators:</label>
            <input type="text" class="form-control" id="indicators" name="indicators" placeholder="Enter Indicators:" value=""/>
        </div>

        <div class="form-group">
            <label for="sqlInitial">Sql Initial:</label>
            <input type="text" class="form-control" id="sqlInitial" name="sqlInitial" placeholder="Enter SqlInitial:" value=""/>
        </div>
        <div class="form-group">
            <label for="status">Status:</label>
            <input type="text" class="form-control" id="status" name="status" placeholder="Enter Status:" value="N"/>
        </div>
        <div class="form-group">
            <button type="submit" class="btn btn-sm btn-success">提交</button>
        </div>
    </form:form>
</div>

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</body>
</html>
