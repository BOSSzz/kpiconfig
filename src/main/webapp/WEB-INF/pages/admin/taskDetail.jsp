<%--
  Created by IntelliJ IDEA.
  User: zhoujiongy
  Date: 2016/9/7
  Time: 17:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>SpringMVC 任务详情</title>

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
    <h1>SpringMVC 任务详情</h1>
    <hr/>

    <table class="table table-bordered table-striped">
        <tr>
            <th>Task ID</th>
            <td>${task.taskId}</td>
        </tr>
        <tr>
            <th>Name</th>
            <td>${task.name}</td>
        </tr>
        <tr>
            <th>Title</th>
            <td>${task.title}</td>
        </tr>
        <tr>
            <th>Group Id</th>
            <td>${task.groupId}</td>
        </tr>
        <tr>
            <th>User Id</th>
            <td>${task.userId}</td>
        </tr>
        <tr>
            <th>Start Time</th>
            <td>${task.startTime}</td>
        </tr>
        <tr>
            <th>End Time</th>
            <td>${task.endTime}</td>
        </tr>
        <tr>
            <th>Span</th>
            <td>${task.span}</td>
        </tr>
        <tr>
            <th>Period</th>
            <td>${task.period}</td>
        </tr>
        <tr>
            <th>Next Time</th>
            <td>${task.nextTime}</td>
        </tr>
        <tr>
            <th>Pool Id</th>
            <td>${task.poolId}</td>
        </tr>
        <tr>
            <th>Db Name</th>
            <td>${task.dbName}</td>
        </tr>
        <tr>
            <th>Db Type</th>
            <td>${task.dbType}</td>
        </tr>
        <tr>
            <th>Table Name</th>
            <td>${task.tableName}</td>
        </tr>
        <tr>
            <th>Table Type</th>
            <td>${task.tableType}</td>
        </tr>
        <tr>
            <th>Dims</th>
            <td>${task.dims}</td>
        </tr>
        <tr>
            <th>Indicators</th>
            <td>${task.indicators}</td>
        </tr>
        <tr>
            <th>Sql Initial</th>
            <td>${task.sqlInitial}</td>
        </tr>
        <tr>
            <th>Status</th>
            <td>${task.status}</td>
        </tr>
        <tr>
            <th>Last Update</th>
            <td>${task.lastUpdate}</td>
        </tr>
    </table>
    <h3><a href="/admin/tasks" type="button" class="btn btn-primary btn-sm">返回</a></h3>
</div>

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</body>
</html>
