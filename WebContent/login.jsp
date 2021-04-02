<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css" 
    integrity="sha384-lKuwvrZot6UHsBSfcMvOkWwlCMgc0TaWr+30HWe3a4ltaBwTZhyTEggF5tJv8tbt" crossorigin="anonymous">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
    <link href="https://fonts.googleapis.com/css?family=Nanum+Gothic:400,800|Alegreya+Sans:900|Cinzel:900|Nanum+Myeongjo" rel="stylesheet">
    <link rel="stylesheet" href="css/base.css">
    <link rel="stylesheet" href="css/artispick.css">
    
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>데카당 상세</title>
<style>



</style>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>

    <!--###################################################################################-->
<div class="main">
    <div class="content">

        <div class="log">
            <h3>로그인</h3>
        </div>

        <div class="login">
            
            <form name="loginform" id="loginform" action="artispick?cmd=loginAction" method="post">
                <div class="form-group">
                <label for="user_login">사용자</label>
                <input type="text" name="id" id="id" class="form-control">
                </div>
                <div class="form-group">
                <label for="user_pass">비밀번호</label>
                <input type="password" name="passwd" id="passwd" class="form-control">
                </div>
                <div class="form-group">
                <label for="rememberme">
                <input name="rememberme" type="checkbox" id="rememberme" value="forever"> 로그인 상태 유지</label>
                </div>
                <div class="form-control-feedback">
                <input type="submit" name="wp-submit" id="wp-submit" class="btn btn-danger" value="로그인"/>
                </div>
                <p class="register">아직 계정이 없으신가요? <a href="artispick?cmd=register"><font color="red">아티스픽 가입하기</font></a></p>

                <hr color="black" size="3">

                <p class="ip"><a href="artispick?cmd=idpassfind">혹시 아이디/비밀번호를 잊으셨나요?</a></p>
            </form>
        </div>

    <!--###################################################################################-->
    

 <jsp:include page="footer.jsp"></jsp:include>



<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>

</body>
</html>


