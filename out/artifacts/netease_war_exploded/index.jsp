<%--
  Created by IntelliJ IDEA.
  User: xiezuoyuan
  Date: 2018/3/3
  Time: 下午5:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>这是标题</title>
  </head>
  <body>
  <form action="./user/save" method="post">
    <input id="name" name="name" value=""/><br/>
    <input id="age" name="age" value=""/><br/>
    <input type="submit" value="提交"/>
  </form>
  <form action="./user/xqy" method="post">
    <input id="xqyname" name="name" value=""/><br/>
    <input id="xqyage" name="age" value=""/><br/>
    <input type="submit" value="提交小企业"/>
  </form>
  <form action="./user/qy" method="post">
    <input id="qyname" name="name" value=""/><br/>
    <input id="qyage" name="age" value=""/><br/>
    <input type="submit" value="提交企业"/>
  </form>
  </body>
</html>
