<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="x-admin-sm">
    
    <head>
        <meta charset="UTF-8">
        <title>欢迎页面-X-admin2.2</title>
        <meta name="renderer" content="webkit">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
        <link rel="stylesheet" href="../css/font.css">
        <link rel="stylesheet" href="../css/xadmin.css">
        <script type="text/javascript" src="../lib/layui/layui.js" charset="utf-8"></script>
        <script type="text/javascript" src="../js/xadmin.js"></script>
        <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
        <!--[if lt IE 9]>
            <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
            <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
        <style type="text/css">
        	.pic{
        		width: 100px;
        		height: 100px;
        		border: 1px solid gainsboro;
        		border-radius: 999px;
        		background: white;
        	}
        </style>
    </head>
    <body>
        <div class="layui-fluid">
            <div class="layui-row">
                <form class="layui-form">
                  
                  </div>
                  <div class="layui-form-item">
                      <label for="username" class="layui-form-label">
                          <span class="x-red">*</span>比赛名称
                      </label>
                      <div class="layui-input-inline">
                          <input type="text" id="username" name="username" required="" lay-verify="required"
                          autocomplete="off" class="layui-input">
                      </div>
                      <div class="layui-form-mid layui-word-aux">
                          <span class="x-red">*</span>填写比赛名称
                      </div>
                  </div>
                  <div class="layui-form-item">
                      <label for="phone" class="layui-form-label">
                          <span class="x-red">*</span>状态
                      </label>
                      <div class="layui-input-inline">
                          <select name="" class="layui-input">
                          	<option value="">关闭</option>
                          	<option value="">开启</option>
                          </select>
                      </div>
                      <div class="layui-form-mid layui-word-aux">
                          <span class="x-red">*</span>默认为关闭状态
                      </div>
                  </div>
                  
                  <div class="layui-form-item">
                      <label for="L_repass" class="layui-form-label">
                      </label>
                      <button  class="layui-btn" lay-filter="add" lay-submit="">
                          增加
                      </button>
                  </div>
              </form>
            </div>
        </div>
        <script>layui.use(['form', 'layer'],
            function() {
                $ = layui.jquery;
                var form = layui.form,
                layer = layui.layer;

                //自定义验证规则
                form.verify({
                    nikename: function(value) {
                        if (value.length < 5) {
                            return '昵称至少得5个字符啊';
                        }
                    }/*,
                    pass: [/(.+){6,12}$/, '密码必须6到12位'],
                    repass: function(value) {
                        if ($('#L_pass').val() != $('#L_repass').val()) {
                            return '两次密码不一致';
                        }
                    }*/
                });

                //监听提交
                form.on('submit(add)',
	                function(data) {
	                    console.log(data);
	                    //发异步，把数据提交给php
	                    layer.alert("增加成功", {
	                        icon: 6
	                    },
	                    function() {
	                        //关闭当前frame
	                        xadmin.close();
	
	                        // 可以对父窗口进行刷新 
	                        xadmin.father_reload();
	                    });
	                    return false;
	                });

            });</script>
       
    </body>

</html>
