<%--
  Created by IntelliJ IDEA.
  User: wangshuaitong
  Date: 2019/3/5
  Time: 23:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>购买书籍</title>
    <script type="text/javascript" src="http://libs.baidu.com/jquery/1.9.1/jquery.js"></script>
    <%--<script type="text/javascript" src="../../js/jquery-1.7.1.min.js"></script>--%>
    <script type="text/javascript">
        $(function(){
            //绑定敲击事件
            $("#delBook").click(function () {
                    //alert("导入成功");
                    //将post请求装换成delete请求
                    // var url = this.href;
                    // alert(url)
                    var url = this.href;
                    alert(url)
                    $("#hiddenForm").attr("action",url);
                    //给隐藏表单的hidden的值为DELETE
                    $(":hidden").val("DELETE");
                    //提交这个表单
                    $("#hiddenForm").submit();
                    //如果没有这个false就会返回两次，就可以超链接就不会再次发信息
                    return false;
                }
            );
        });
    </script>
</head>
<body>
    <h3>购买书籍成功</h3>
    <a href="user/book/34" id="delBook">删除书籍</a>
    <%--
       添加隐形的form，将post请求转化成delete
    --%>
    <form action="" method="post" id="hiddenForm">
        <%--此处的name的属性必须写成_method,只承认_method--%>
        <input type="hidden" name="_method">
    </form>

</body>
</html>
