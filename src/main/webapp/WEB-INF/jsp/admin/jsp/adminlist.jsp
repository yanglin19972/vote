<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html class="x-admin-sm">
    <head>
        <meta charset="UTF-8">
        <title>欢迎页面-X-admin2.2</title>
        <meta name="renderer" content="webkit">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
        <link rel="stylesheet" href="<%=request.getContextPath() %>/css/font.css">
        <link rel="stylesheet" href="<%=request.getContextPath() %>/css/xadmin.css">
        <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
        <script src="<%=request.getContextPath() %>/lib/layui/layui.js" charset="utf-8"></script>
        <script type="text/javascript" src="<%=request.getContextPath() %>/js/xadmin.js"></script>
        <!--[if lt IE 9]>
          <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
          <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>
    <body>
        <div class="layui-fluid">
            <div class="layui-row layui-col-space15">
                <div class="layui-col-md12">
                    <div class="layui-card">
                        <div class="layui-card-header">
                            <button class="layui-btn layui-btn-danger" onclick="delAll()"><i class="layui-icon"></i>批量删除</button>
                            <button class="layui-btn" onclick="xadmin.open('添加管理员','adminadd',500,600)"><i class="layui-icon"></i>添加</button>
                        	<button class="layui-btn" onclick="location.reload()">刷新页面</button>
                        </div>
                        <div class="layui-card-body ">
                            <table class="layui-table layui-form">
                              <thead>
                                <tr>
                                  <th>ID</th>
                                  <th>登录名</th>
                                  <th>操作</th>
                              </thead>
                              <tbody>
                                <c:forEach items="${admins}" var="item">
                                	<tr>
									<th>${item.id}</th>
									<th>${item.adminname}</th>
									<td>
	                                    <a class="layui-btn-danger layui-btn layui-btn-xs" title="删除" href="#" onclick="deladmin('${item.id}')" href="javascript:;">
	                                    		删除
	                                    </a>
	                                  </td>
								</c:forEach>
                              </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div> 
    </body>
    <script>
    function deladmin(id){
    	var result=confirm("您确定要删除吗？");
    	if(result){
    		//返回的true  发送ajax请求
    		var url="${pageContext.request.contextPath}/admin/jsp/delAdmin";
    		var param={id:id};
    		$.post(url,param,function(data){
    			alert(data.msg);
    			if(data.flag==1){
    				location.reload();
    			}
    		});
    	}
    }
      
    </script>
   
</html>