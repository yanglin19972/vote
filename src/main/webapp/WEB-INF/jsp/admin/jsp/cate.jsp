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
        <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
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
                            <button class="layui-btn layui-btn-danger" onclick="delAll()">
                                <i class="layui-icon"></i>批量删除</button>
                                <button class="layui-btn" onclick="xadmin.open('添加比赛','playadd',500,600)"><i class="layui-icon"></i>添加</button>
                        <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" onclick="location.reload()" title="刷新">
			                <i class="layui-icon layui-icon-refresh" style="line-height:30px"></i>
			            </a>
                        </div>
                        <div class="layui-card-body ">
                            <table class="layui-table layui-form" style="text-align: center;">
                              <thead>
                                  <th width="10" style="text-align: center;">
                                    <input type="checkbox" name="" lay-skin="primary">
                                  </th>
                                  <th style="text-align: center;">比赛ID</th>
                                  <th style="text-align: center;">比赛名称</th>
                                  <th style="text-align: center;">状态</th>
                                  <th style="text-align: center;">操作</th>
                              </thead>
                              <tbody class="x-cate">
                                <c:forEach items="${plays}" var="item">
                                	<tr>
                                	<td>
                                      <input style="text-align: center;" type="checkbox" name="id" value="1"   lay-skin="primary"> 
                                    </td>
									<th style="text-align: center;">${item.play_id}</th>
									<th style="text-align: center;">${item.playname}</th>
									
                                  	<th style="text-align: center;">
									<c:if test="${item.condition==1}">
	                                    <input  type="checkbox" name="switch"  lay-text="开启投票|停止投票"  checked=""  lay-skin="switch">
									</c:if>
									<c:if test="${item.condition==0}">
										<input type="checkbox" name="switch"  lay-text="开启投票|停止投票"   lay-skin="switch">
									</c:if>
									</th>
	                                  <td  class="td-manage">
	                                    <button style="text-align: center;" class="layui-btn-danger layui-btn layui-btn-xs"  onclick="member_del(this,'要删除的id')" href="javascript:;" ><i class="layui-icon">&#xe640;</i>修改</button>
	                                    <button style="text-align: center;" class="layui-btn-danger layui-btn layui-btn-xs"  onclick="delPlay('${item.play_id}')" href="javascript:;" ><i class="layui-icon">&#xe640;</i>删除</button>
	                                  </td>
								</c:forEach>
                              </tbody>
                            </table>
                        </div>
                        <div class="layui-card-body ">
                            <div class="page">
                                <div>
                                    <a class="prev" href="">&lt;&lt;</a>
                                    <a class="num" href="">1</a>
                                    <span class="current">2</span>
                                    <a class="num" href="">3</a>
                                    <a class="num" href="">489</a>
                                    <a class="next" href="">&gt;&gt;</a></div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script>
        layui.use(['form'], function(){
            form = layui.form;
          });
        
        function delPlay(id){
        	var result=confirm("您确定要删除吗？");
        	if(result){
        		//返回的true  发送ajax请求
        		var url="${pageContext.request.contextPath}/delPlay";
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
    </body>
</html>
