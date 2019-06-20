<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="x-admin-sm">
    <head>
        <meta charset="UTF-8">
        <title>添加选手</title>
        <meta name="renderer" content="webkit">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
        <link rel="stylesheet" href="<%=request.getContextPath() %>/css/font.css">
        <link rel="stylesheet" href="<%=request.getContextPath() %>/css/xadmin.css">
        <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
        <script src="<%=request.getContextPath() %>/lib/layui/layui.js" charset="utf-8"></script>
        <script type="text/javascript" src="<%=request.getContextPath() %>/js/xadmin.js"></script>
    </head>
    <body>
        <div class="layui-fluid">
            <div class="layui-row layui-col-space15">
                <div class="layui-col-md12">
                    <div class="layui-card">
                        <div class="layui-card-body ">
                           <div class="layui-card-header">
                            <button class="layui-btn" onclick="xadmin.open('添加用户','./player_add.jsp',500,600)"><i class="layui-icon"></i>添加选手</button>
                       	   </div>
                       	    
                            <hr>
                        </div>
                        <div class="layui-card-body ">
                            <table class="layui-table layui-form" style="text-align: center;">
                              <thead>
                                  <th width="50" style="text-align: center;">选手</th>
                                  <th width="100" style="text-align: center;">作品</th>
                                  <th width="100" style="text-align: center;">比赛</th>
                                  <th width="100" style="text-align: center;">操作</th>
                              </thead>
                              <tbody class="x-cate">
                                <tr cate-id='1' fid='0' >
                                  <td>邓紫棋</td>
                                  <td>来自天堂的魔鬼</td>
                                  <td>中国好声音总决赛</td>
                                  <td><button>修改 </button> <button> 删除</button></td>
                                </tr>
                              </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
