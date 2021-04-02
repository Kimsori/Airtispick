<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <title>회원가입</title>

</head>
<style>
.select {list-style:none; margin-top:-1rem!important;}
.select ul{list-style:none; padding-left: 0px;}
.select li{float:left; padding-right: 10px;}
.select li a{ color: rgb(70, 69, 69); font-size:14px;}
.select a{font-family:'Lato'}
.select li a:hover{text-decoration:none;}

</style>
<body>
<jsp:include page="header.jsp"></jsp:include>

    <!--###################################################################################-->
<div class="main">
    <div class="content">
    
        <div class="regist">
            <h3>회원가입</h3></br>
            
       <ul class="select">
        <li><a href="artispick?cmd=register">유저</a></li>
		<li><a>|</a></li>
		<li><a href="artispick?cmd=register2">창작자</a></li>
		</ul>
        </div>
        <form action="artispick?cmd=regiAction2" method="post" enctype = "multipart/form-data">
        <div class="container-fluid">
            <div class="row">
                <div class="col first">
                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label">아이디</label>
                        <div class="col-sm-4">
                        <input type="text" class="form-control id" name="userid" placeholder="아이디를 입력하세요." required="required">
                        </div>
                        <div class="col-sm-2">
                        <button type="submit" id="checkbtn" class="btn btn-outline-secondary multi">중복확인</button>
                        </div>
                        <div class="col-sm-4 pass1">
                            <font name="multiname" size="2" color="black"></font>
                        </div>
                    </div>
    
                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label">비밀번호</label>
                        <div class="col-sm-4">
                        <input type="password" class="form-control" id="user_passwd" name="user_passwd" placeholder="비밀번호를 입력해주세요." required="required">
                        </div>
                    </div>

                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label">비밀번호 확인</label>
                        <div class="col-sm-4">
                        <input type="password" class="form-control" id="chpasswd" name="chpasswd" placeholder="비밀번호를 다시 입력해주세요." required="required">
                        </div>
                        <div class="col-sm-4 pass1">
                            <font name="check" size="2" color="red"></font>
                        </div>
                    </div>
    
                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label">이름</label>
                        <div class="col-sm-4">
                        <input type="text" class="form-control" name="name" placeholder="이름을 입력해주세요." required="required">
                        </div>
                    </div>
    
                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label">생년월일</label>
                        <div class="col-sm-4">
                        <input type="date" class="form-control" name="birth" placeholder="클릭하여 생년월일을 입력하세요.">
                        </div>
                    </div>
    
                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label">성별</label>
                        <div class="col-sm-4">
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="radio" name="gender" value=1 checked><label class="form-check-label">여성</label>
                        </div>
                        <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" name="gender" value=2 ><label class="form-check-label">남성</label>
                        </div>
                        </div>
                    </div>
    
                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label">핸드폰번호</label>
                        <div class="col-sm-4">
                            <input type="phone" class="form-control" name="phone" id="phone" placeholder="하이픈은 생략하고 입력바랍니다.">
                        </div>
                        <div class="col-sm-2">
                        <button type="submit"  class="btn btn-outline-secondary">인증하기</button>
                        </div>
                    </div>
    
                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label">이메일</label>
                        <div class="col-sm-4">
                        <input type="email" class="form-control" name="email" placeholder="name@example.com" required="required">
                        </div>
                    </div>
                    
                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label">선호하는 분야</label>
                        <div class="col-sm-8">
                        <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" name="field" value=1 checked><label class="form-check-label">발라드</label>
                        </div>
                        <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" name="field" value=2 ><label class="form-check-label">댄스</label>
                        </div>
                        <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" name="field" value=3 ><label class="form-check-label">포크/블루스</label>
                        </div>
                        <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" name="field" value=4 ><label class="form-check-label">인디음악</label>
                        </div>
                        <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" name="field" value=5 ><label class="form-check-label">랩/힙합</label>
                        </div>
                        <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" name="field" value=6 ><label class="form-check-label">락/메탈</label>
                        </div>
                        <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" name="field" value=7 ><label class="form-check-label">R&B/Soul</label>
                        </div>
                        <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" name="field" value=8 ><label class="form-check-label">재즈</label>
                        </div>
                        <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" name="field" value=9 ><label class="form-check-label">뉴에이지</label>
                        </div>
                        </div>
                    </div>
                    
                    
                    
                </div>
            </div>
        </div>
    
        <div class="container-fluid">
            <div class="row">
                <div class="col second">
                    <div class="form-group row">
                        <div class="form-check form-check-inline">
                            <label class="form-check-label"><input class="form-check-input" type="checkbox" name="tour" value="1">창작자항목 입력하기<p>※프로젝트를 게시할 사용자는 체크를 선택해주세요.</p></label>
                        </div>   
                    </div>
                </div>
            </div>
        </div>
    <div class="their">
        <div class="container-fluid">
            <div class="row">
                <div class="col">
                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label">창작자명</label>
                        <div class="col-sm-4">
                        <input type="text" class="form-control" name="artiName" placeholder="창작자명(필명)을 입력하세요." required="required">
                        </div>
                    </div>
    
                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label">대표이미지</label>
                            <div class="col-sm-2">
                            <img class="frame" src="https://dummyimage.com/200x200/999/eee">
                            </div>
                            <div class="col-sm-4 box1">
                            <label>이미지 등록</label>
                            <input type="file" class="form-control-file" name="artiProfile">
                            <P>사이즈는 가로 200px, 세로 200px에 최적화되어 있으며 jpg, gif, png파일을 지원합니다.</P>
                            </div>
                    </div>
    
                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label">창작자소개</label>
                        <div class="col-sm-8">
                        <textarea class="form-control" name = "intro" rows="4" placeholder="내용을 입력해주세요."></textarea>
                        </div>
                    </div>
    
                    
    
                 
                </div>
            </div>
        </div>
    </div>
    
        <div class="container-fluid">
            <div class="row">
                <div class="col">
                    <div class="form-group row">
                            <button type="submit" class="btn btn-danger four" >가입하기</button>
                    </div>
                </div>
            </div>
        </div>
    
        
</form>


    <!--###################################################################################-->
    





<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>


<script>
    $('.form-check-label').click(function(){
        if($('.their').css("display")=="none"){
            $('.their').css({"display": "block", "visibility": "visible"});
        } else {
            $('.their').css({"display": "none", "visibility": "collapse"});
        }     
    });

    $(function(){
        $('#user_passwd').keyup(function(){
        $('font[name=check]').text('');
        }); 

    $('#chpasswd').keyup(function(){
        if($('#user_passwd').val()!=$('#chpasswd').val()){
            $('font[name=check]').text('');
            $('font[name=check]').html("비밀번호가 일치하지 않습니다").css("color", "red");
        }else{
            $('font[name=check]').text('');
            $('font[name=check]').html("비밀번호가 일치합니다!").css("color", "black");
            }
        }); 
    });
    
    $('#checkbtn').click(function(){ 
		var inputId = $('.id').val(); 
		$.ajax({
			url:"artispick?cmd=hasconfirmId&id="+inputId, 
			success : function(result){ 
				$('font[name=multiname]').html(result); 
			}
		}); 
	}); 

    </script>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>

