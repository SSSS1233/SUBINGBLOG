<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>
<!--[if IE 8]>
<html xmlns="http://www.w3.org/1999/xhtml" class="ie8" lang="zh-CN">
<![endif]-->
<!--[if !(IE 8) ]><!-->
<html xmlns="http://www.w3.org/1999/xhtml" lang="zh-CN">
<!--<![endif]-->
<html xmlns="http://www.w3.org/1999/xhtml" lang="zh-CN">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>登录</title>
    <link rel="stylesheet" href="/plugin/font-awesome/css/font-awesome.min.css">
    <link rel="shortcut icon" href="/img/logo.png">
    <link rel='stylesheet' id='dashicons-css'  href='/plugin/login/dashicons.min.css' type='text/css' media='all' />
    <link rel='stylesheet' id='buttons-css'  href='/plugin/login/buttons.min.css' type='text/css' media='all' />
    <link rel='stylesheet' id='forms-css'  href='/plugin/login/forms.min.css' type='text/css' media='all' />
    <link rel='stylesheet' id='l10n-css'  href='/plugin/login/l10n.min.css' type='text/css' media='all' />
    <link rel='stylesheet' id='login-css'  href='/plugin/login/login.min.css' type='text/css' media='all' />
    <style type="text/css">
        body{
            font-family: "Microsoft YaHei", Helvetica, Arial, Lucida Grande, Tahoma, sans-serif;
            background: url(/img/loginBg.jpg);
            width:100%;
            height:100%;
        }
        .login h1 a {
            background:url() no-repeat;
            background-size: 220px 50px;
            width: 220px;
            height: 50px;
            padding: 0;
            margin: 0 auto 1em;
        }
        .login form {
            background: #fff;
            background: rgba(255, 255, 255, 0.6);
            border-radius: 2px;
            border: 1px solid #fff;
        }
        .login label {
            color: #000;
            font-weight: bold;
        }

        #backtoblog a, #nav a {
            color: #fff !important;
        }

    </style><meta name='robots' content='noindex,follow' />
    <meta name="viewport" content="width=device-width" />
    <style>
        body {
            background-repeat: no-repeat;
            background-size: 100% 100%;
            background-attachment: fixed;
        }
    </style>
</head>
<body class="login login-action-login wp-core-ui  locale-zh-cn">
<div id="login">
    <h1><a href="/" title="欢迎您光临本站！" tabindex="-1">${options.optionSiteTitle}</a></h1>

    <form name="loginForm" id="loginForm"  method="post" action="index">
        <p>
            <label for="user_login">用户名或电子邮件地址<br />
                <input type="text" name="username" id="user_login" class="input" value="" size="20" required/></label>
        </p>
        <p>
            <label for="user_pass">密码<br />
                <input type="password" name="password" id="user_pass" class="input" value="" size="20" required/>
            </label>
        </p>
        <p class="forgetmenot"><label for="rememberme"><input name="rememberme" type="checkbox" id="rememberme" value="1" checked /> 记住密码</label>
        <span id="message"></span></p>
        <p class="submit">
            <input type="button" name="wp-submit" id="submit-btn" class="button button-primary button-large" value="登录" />
        </p>
    </form>



    <script type="text/javascript">
        function wp_attempt_focus(){
            setTimeout( function(){ try{
                d = document.getElementById('user_login');
                d.focus();
                d.select();
            } catch(e){}
            }, 200);
        }

        wp_attempt_focus();
        if(typeof wpOnload=='function')wpOnload();
    </script>

    <p id="backtoblog"><a href="/">&larr; 返回到风吟博客</a></p>

</div>


<div class="clear"></div>

<script src="/js/jquery.min.js"></script>
<script type="text/javascript">


    <%--登录验证--%>
    $("#submit-btn").click(function () {
            var name=$("#user_login").val();
            var pass=$("#user_pass").val();
        if(name.trim()=="")
        {
            $("#message").css("color","red").text("用户名不能为空")
            return;
        }else if(pass.trim()==""){
            $("#message").css("color","red").text("密码不能为空")
            return;
        }else{
            var user={user_name:name,user_pass:pass};
            $.ajax({
                url: "logincheck",
                type:"post",
                data:user,
                dataType:"json",
                success:function (data) {
                    // alert(data.message)
                    if(data.message=='ok')
                    {
                        $("#message").text("")
                        $("#loginForm").submit();
                    }
                    else {
                        $("#message").css("color","red").text(data.message)
                    }
                }
            })
        }

    })

</script>
</body>
</html>

