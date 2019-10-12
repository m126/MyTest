<%--
  Created by IntelliJ IDEA.
  User: FAMS2
  Date: 9/25/2019
  Time: 3:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index</title>
    <jsp:include page="layout/linkPage.jsp"/>
    <style>
        .margin_top{
            margin-top: 20px;
        }

    </style>
</head>
<body>
<jsp:include page="layout/header.jsp" />
<%--<table id="dataTable" >
    <thead>
    <tr>
        <th data-field="id">Item ID</th>
        <th data-field="name">Item Name</th>
        <th data-field="price">Item Price</th>
    </tr>
    </thead>
    <tbody id="dataBody">

    </tbody>
</table>--%>
<div class="container margin_top bg-danger">
    <div class="row">
        <h2>发现:</h2>
    </div>

    <div class="row">
        <ul class="nav nav-tabs">
            <li class="active top_tab"><a data-toggle="tab" href="#">1</a></li>
            <li class="top_tab"><a data-toggle="tab" href="#">2</a></li>
            <li class="top_tab"><a data-toggle="tab" href="#">3</a></li>
        </ul>
    </div>

    <div class="row">
        <table id="content">

        </table>
    </div>

</div>

</body>
</html>


<script>
    $(document).ready(function () {
        initTable("dataTable");
        LoadPage();
    });
    $('.top_tab').click(function () {
        $('.top_tab').removeClass("active");
        $(this).addClass("active");
        //call ajax get data ....


    });

    
    function LoadPage() {
        $.ajax({
            url:"/login/loadPageData",
            data:"myname=zixian",
            type:"GET",
            dataType:"json",
            success:function (data) {
                console.log(data);
            },
            error:function (data) {

            }


        });
    }




    function initTable(tableId) {
       /* $('#dataTable').bootstrapTable({
            striped : true, //是否显示行间隔色
            pageNumber : 1, //初始化加载第一页
            pagination : true,//是否分页
            sidePagination : 'client',//server:服务器端分页|client：前端分页
            pageSize : 4,//单页记录数
            pageList : [ 5, 10, 20, 30 ],//可选择单页记录数
            showRefresh : true,
            column:[{
                title:'Name',
                field:'Name',
                sortable:true
            }, {
                title:'Sex',
                field:'Sex',
                sortable:true
            }
            ]

        });*/
        $('#dataTable').bootstrapTable({
            columns: [{
                field: 'id',
                title: 'Item ID'
            }, {
                field: 'name',
                title: 'Item Name'
            }, {
                field: 'price',
                title: 'Item Price'
            }, ]
        });
    }


</script>



