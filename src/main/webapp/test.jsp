<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <input type="button" value="添加">
    <label>乐号</label>
    <input>
    <label>金额</label>
    <input>
    <select>
        <option value="all">全部</option>
        <option value="1">生效</option>
        <option value="0">失效</option>
    </select>
    <input type="button" value="查询">
</div>
<table cellpadding="5%" border="1px">
    <tr>
        <th>id</th>
        <th>乐号</th>
        <th>开始时间</th>
        <th>结束时间</th>
        <th>状态</th>
        <th>操作</th>
    </tr>
    <tr>
        <th>11</th>
        <th>222</th>
        <th>2018-16-18 12:18:56</th>
        <th>2018-16-18 12:18:56</th>
        <th>生效</th>
        <th>
            <label>编辑</label>
            <label>删除</label>
        </th>
    </tr>
    <tr>

        <th></th>
        <th></th>
        <th></th>
        <th></th>
        <th>
            <input type="button" value="上一页"/>
            <input type="button" value="下一页">
        </th>
        <th>
            <input type="text">
            <input value="跳转" type="button" onclick="cc()">
        </th>

    </tr>
</table>
</body>
<script type="text/javascript">
    function cc() {
        alert("ddd")
    }
</script>
</html>
