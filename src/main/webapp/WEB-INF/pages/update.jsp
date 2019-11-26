<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- HTML5文档-->
<!DOCTYPE html>
<!-- 网页使用的语言 -->
<html lang="zh-CN">
<head>
    <!-- 指定字符集 -->
    <meta charset="utf-8">
    <!-- 使用Edge最新的浏览器的渲染方式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- viewport视口：网页可以根据设置的宽度自动进行适配，在浏览器的内部虚拟一个容器，容器的宽度与设备的宽度相同。
    width: 默认宽度与设备的宽度相同
    initial-scale: 初始的缩放比，为1:1 -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>添加用户</title>

    <!-- 1. 导入CSS的全局样式 -->
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
    <!-- 2. jQuery导入，建议使用1.9以上的版本 -->
    <script src="${pageContext.request.contextPath}/js/jquery-2.1.0.min.js"></script>
    <!-- 3. 导入bootstrap的js文件 -->
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <center><h3>修改联系人页面</h3></center>
    <form action="${pageContext.request.contextPath}/user/update" method="post">
        <%--隐藏域存储id，更新时要使用--%>
        <input type="hidden" name="id" value="${user.id}">

        <div class="form-group">
            <label for="name">姓名：</label>
            <input type="text" class="form-control" id="name" name="name" placeholder="请输入姓名" value="${user.name}">
        </div>

        <div class="form-group">
            <label>性别：</label>
            <c:if test="${user.gender == '南'}">
                <input type="radio" name="gender" value="南" checked="checked"/>南
                <input type="radio" name="gender" value="女"/>女
            </c:if>
            <c:if test="${user.gender != '南'}">
                <input type="radio" name="gender" value="南"/>南
                <input type="radio" name="gender" value="女" checked="checked"/>女
            </c:if>
        </div>

        <div class="form-group">
            <label for="age">年龄：</label>
            <input type="text" class="form-control" id="age" name="age" placeholder="请输入年龄" value="${user.age}">
        </div>

        <div class="form-group">
            <label for="address">籍贯：</label>
            <select name="address" class="form-control" id="address">
                <option value="广东">广东</option>
                <option value="广西">广西</option>
                <option value="湖南">湖南</option>
            </select>
        </div>

        <div class="form-group">
            <label for="qq">QQ：</label>
            <input type="text" class="form-control" id="qq" name="qq" placeholder="请输入QQ号码" value="${user.qq}"/>
        </div>

        <div class="form-group">
            <label for="email">Email：</label>
            <input type="text" class="form-control" id="email" name="email" placeholder="请输入邮箱地址"
                   value="${user.email}"/>
        </div>

        <div class="form-group" style="text-align: center">
            <input class="btn btn-primary" type="submit" value="提交"/>
            <input class="btn btn-default" type="reset" value="重置"/>
            <input class="btn btn-default" type="button" value="返回"/>
        </div>
    </form>
</div>

<script>

    var address = '${user.address}';

    $(function () {
        $("#address").empty();
        //页面加载完成后立即发送异步请求，加载省份的数据，填充到addrees中
        $.get("${pageContext.request.contextPath}/province/findAll", {}, function (data) {
            //[{"id":1,"code":"110000","name":"北京市"},{"id":2,"code":"130000","name":"河北省"}]
            $.each(data, function () {
                //{"id":1,"code":"110000","name":"北京市"}
                $("#address").append($('<option value="' + this.code + '">' + this.name + '</option>'));
            });
            //设置下拉框默认选中
            $("#address").val(address);
        });
    });
</script>
</body>
</html>