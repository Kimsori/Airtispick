<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
    <title>아이디/비밀번호 찾기</title>

</head>
<body>
<jsp:include page="header.jsp"></jsp:include>

    <!--###################################################################################-->
<div class="main">
    <div class="content">

        <nav>
            <div class="nav nav-tabs" id="nav-tab" role="tablist">
                <a class="nav-item nav-link active" id="nav-home-tab" data-toggle="tab" href="#nav-home" role="tab" aria-controls="nav-home" aria-selected="true">아이디 찾기</a>
                <a class="nav-item nav-link" id="nav-profile-tab" data-toggle="tab" href="#nav-profile" role="tab" aria-controls="nav-profile" aria-selected="false">비밀번호 찾기</a>
            </div>
            </nav>


            <div class="tab-content" id="nav-tabContent">
            <div class="tab-pane fade show active" id="nav-home" role="tabpanel" aria-labelledby="nav-home-tab">
                
                <div class="login">
                    <form role="form" name="loginform" id="loginform" action="artispick?cmd=idfind" method="post">
                        <div class="form-group">
                        <label for="user_login">이름</label>
                        <input type="text" name="userName" id="userName" class="form-control">
                        </div>
                        <div class="form-group">
                        <label for="user_pass">핸드폰번호</label>
                        <div class="col">
                            <input type="text" class="form-control" name="phone" id="phone" placeholder="">
                        </div>
                        </div>
                        <center><input type="submit" name="wp-submit" id="wp-submit" class="btn btn-danger" value="확인"/></center>
                    </form>
                </div>
            </div>


            <div class="tab-pane fade" id="nav-profile" role="tabpanel" aria-labelledby="nav-profile-tab">
                <div class="login">
                    <form role="form" name="loginform" id="loginform" action="artispick?cmd=pwfind" method="post">
                        <div class="form-group">
                        <label for="user_login">이름</label>
                        <input type="text" name="userName" id="name" class="form-control">
                        </div>
                        <div class="form-group">
                            <label for="user_login">아이디</label>
                            <input type="text" name="id" id="name" class="form-control">
                        </div>
                        <div class="form-group">
                        <label for="user_pass">핸드폰번호</label>
                        <div class="col">
                            <input type="text" class="form-control" name="phone" id="phone" placeholder="">
                        </div>
                        </div>
                        <div>

                            <center><button type="submit" class="btn btn-danger sub">확인</button></center>

                    </form>
                </div>
            </div>
            </div>
            </div>

    <!--###################################################################################-->
    

<jsp:include page="footer.jsp"></jsp:include>



<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>

</body>
</html>