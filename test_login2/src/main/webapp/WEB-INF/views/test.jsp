<%--
  Created by IntelliJ IDEA.
  User: FAMS2
  Date: 9/25/2019
  Time: 9:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <jsp:include page="layout/linkPage.jsp"/>
</head>
<body>
test page
<div class="container">
    <div class="row">
        <div class="col-xs-6 bg-success">
            div1
        </div>
        <div class="col-xs-6 bg-info">
            div2
        </div>
    </div>
    <div class="row">
        <div class="col-xs-6 col-xs-offset-3 bg-danger">
            div1
        </div>
    </div>

    <hr/>
    <div class="row">
        <div class="col-xs-4  bg-success">
            div
        </div>
        <div class="col-xs-8 bg-primary">
            div
        </div>
    </div>
    <br/>
    <div class="row">
        <div class="col-xs-4 col-xs-push-8 bg-success">
            div
        </div>
        <div class="col-xs-8 col-xs-pull-4 bg-primary">
            div
        </div>
    </div>

    <table class="table table-bordered table-hover">
        <tr>
            <td>1</td>
            <td>2</td>
        </tr>
        <tr>
            <td>1</td>
            <td>2</td>
        </tr>
        <tr>
            <td>1</td>
            <td>2</td>
        </tr>
        <tr>
            <td>1</td>
            <td>2</td>
        </tr>
        <tr class="active">
            <td>1</td>
            <td>2</td>
        </tr>
        <tr class="success">
            <td>1</td>
            <td>2</td>
        </tr>
        <tr class="warning">
            <td>1</td>
            <td>2</td>
        </tr>
        <tr class="danger">
            <td>1</td>
            <td>2</td>
        </tr>
    </table>
    垂直表单
    <form role="form">
        <div class="form-group">
            <label>name</label>
            <input class="form-control" type="text" placeholder="name"/>
        </div>
        <div class="form-group">
            <label>文件输入</label>
            <input type="file" >
            <p class="help-block">这是一段提示文本</p>
        </div>
    </form>
    内联表单
    <form role="form" class="form-inline">
        <div class="form-group">
            <label class="sr-only">name</label>
            <input class="form-control" type="text" placeholder="name"/>
        </div>
        <div class="form-group">
            <label>文件输入</label>
            <input type="file" >
            <p class="help-block">这是一段提示文本</p>
        </div>
    </form>
    水平表单

    <form role="form" class="form-horizontal">
        <div class="form-group">
            <label class="col-xs-2 control-label">name</label>
            <div class="col-xs-10">
                <input class="form-control col-sm-10" type="text" placeholder="name"/>
            </div>
        </div>
        <div class="form-group">
            <label class="col-xs-2 control-label">名字</label>
            <div class="col-xs-10">
                <input type="text" class="form-control" id="firstname"
                       placeholder="请输入名字">
            </div>
        </div>

        <div class="form-group">
            <label>文件输入</label>
            <input type="file" >
            <p class="help-block">这是一段提示文本</p>
        </div>
        <select multiple class="form-control">
            <option>1</option>
            <option>1</option>
            <option>1</option>
            <option>1</option>
            <option>1</option>
            <option>1</option>
        </select>

        <p class="form-control-static">静态控件(纯文本状态)</p>

        <div class="form-group has-error">
            <input type="text" class="form-control"/>
        </div>

        <button class="btn btn-warning">btn</button>
    </form>

    字体图标
    <span class="glyphicon glyphicon-user btn-lg"></span>
    <span class="glyphicon glyphicon-alert btn-sm"></span>
    <br/>
    下拉菜单
    data-toggle="dropdown" 用于触发下拉的实现  ,aria-labelledby 把内容绑定到某个触发器上
    <div class="dropdown">
        <button type="button" class="btn dropdown-toggle" id="dropMenu" data-toggle="dropdown" >
            click <span class="caret"></span>
        </button>

        <ul class="dropdown-menu" aria-labelledby="dropMenu">
            <li class="percentage">
                <a href="#">1</a>
            </li>
            <li class="percentage">
                <a href="#">2</a>
            </li>
            <li class="divider">

            </li>
            <li class="percentage">
                <a href="#">3</a>
            </li>
        </ul>
    </div>




</div>

</body>
</html>
