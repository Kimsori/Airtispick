<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css" 
    integrity="sha384-lKuwvrZot6UHsBSfcMvOkWwlCMgc0TaWr+30HWe3a4ltaBwTZhyTEggF5tJv8tbt" crossorigin="anonymous">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
    <link href="https://fonts.googleapis.com/css?family=Nanum+Gothic:400,800|Alegreya+Sans:900|Cinzel:900|Nanum+Myeongjo" rel="stylesheet">
    <link rel="stylesheet" href="css/detail.css">
    <link rel="stylesheet" href="css/base.css">
    <title>샵 상세</title>
           
</head>
<body>
<div id="top">
<c:if test="${id==null}">
  <a href="artispick?cmd=login"><i class="fas fa-sign-in-alt"></i> 로그인/회원가입</a>
</c:if>
 
 <c:if test="${id!=null}">
  <a href="artispick?cmd=logout"><i class="fas fa-sign-in-alt"></i> 로그아웃</a>
  <a href="artispick?cmd=mypage"><i class="fa fa-user-circle"></i> 마이페이지</a>
  <a href="artispick?cmd=shopcart&id=<%=session.getAttribute("id")%>"><i class="fas fa-shopping-cart"></i> 장바구니</a>
  <a class="hi">안녕하세요 <strong><%=session.getAttribute("id")%> 님</strong></a>
</c:if>
</div>

<header class="display-3">
    <a id=artispick href="artispick?cmd=main">ARTISPICK</a>
</header>

<nav class="navbar navbar-expand-lg navbar-light">
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo01" aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarTogglerDemo01">
        <ul class="navi navbar-nav mr-auto">
        <li class="nav-item">
            <a class="nav-link" href="artispick?cmd=pjlist">프로젝트 둘러보기</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="artispick?cmd=shoplist">프로젝트SHOP</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="artispick?cmd=pjpost">프로젝트 올리기</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="#">알아보기</a>
        </li>
        <li class="nav-item dropdown">
            <a class="dropdown nav-link">
            고객센터
            </a>
            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
            <a class="dropdown-item" href="artispick?cmd=notice">공지사항</a>
            <a class="dropdown-item" href="artispick?cmd=fqa">자주하는 질문</a>
            <a class="dropdown-item" href="artispick?cmd=QnaWrite">1:1문의</a>
            </div>
        </li>
        </ul>
        <form class="form-inline my-2 my-lg-0">
        <input class="search form-control mr-sm-2" type="search">
        <button class="btn btn-sm my-2 my-sm-0" type="submit"><i class="fas fa-search"></i></button>
        </form>
    </div>
</nav>


<div class="main">
<div class="field" style="width: 120px; margin: 20px auto; margin-bottom: -15px; text-align: center; padding: 15px; border: 1px solid black; border-radius: 5px;">
    <b>${detail.field_name}</b>
</div>
<div class="dcontainer">
    <h2 style="padding-top: 1.5rem;"></h2>
</div>

<div class="row sub-top">
    <div class="col-7 col-top">
        <img src="img/${detail.image}">
    </div>
    <div class="col-5 col-top">
        <div class="sub">
            <div class="w3-padding">
                <div class="w3-padding">
                    <h5>${detail.album_name}</h5><hr>
                </div>

                <div class="w3-padding float-left" style="width:40%;">
                    <ul>
                    <li>가격</li>
                    <li>배송비</li>
                    <li>배송예정일</li>
                    </ul>    
                </div>
                <div class="w3-padding float-right" style="width:60%;">
                    <ul>
                    <li>${detail.album_price}원</li>
                    <li>${detail.delivery_account}원</li>
                    <li>${detail.delivery_date}일</li>
                </ul>
                </div>
            </div>
    
    <div class="w3-bar" style="margin-top: 17rem;"></div>
        <button class="w3-bar-item w3-block rounded-left" style="width:50%; background-color: #db312e; color: white;">
            장바구니</button>
        <button onclick="location.href='artispick?cmd=shopdetailSelectgoods&shop_num=${detail.shop_num}&id=<%=session.getAttribute("id")%>'" class="w3-bar-item w3-block rounded-right" style="width:50%; border-left: none;">
            구매하기</button>
    </div>

</div>
</div> 
    </div>
</div>  

<div class="dcontent">

<div class="row">
<div class="tabs" id="ttabs">
        <div onclick="openCity('story')"><a data-toggle="tab" href="#story">상세정보</a></div>
</div>    
<div class="dcontainer">
    <div class="tquater">
        <div class="tab-content">
        <div id="story" class="city">
        <img src="img/${detail.image}">
        <h5 class="w3-padding-32">안녕하세요 ${detail.name}입니다</h5>
        <p>${detail.album_content}</p>
        </div>
        
        </div><!--tab-content-->
    </div><!--tquater-->
</div><!--dcontainer-->
</div><!--row-->

</div> <!-- 컨텐트 끝 -->
<footer>
    <div class="footer">
    <div class="row">
        <div class="col col-md-4 col-sm-12">
            <a herf="#"><p>창작자 가이드</p></a>
            <a herf="#"><p>이용약관</p></a>
            <a herf="#"><p>고객센터</p></a>
        </div>
        <div class="col col-md-4 col-sm-12">
                <a herf="#"><p>개인정보 보호정책</p></a>
                <a herf="#"><p>문의하기</p></a>
        </div>
        <div class="copyright col col-md-4 col-sm-12">
            <i class="fab fa-facebook-square"></i>
            <i class="fab fa-instagram"></i>
            <i class="fab fa-twitter-square"></i>
            <i class="fas fa-share-alt-square"></i>
            <a herf=""><p>© 2018 Artispic 2nc</p></a>
        </div>
    </div>
        <div class="address">
            <p>(04763) 서울시 성동구 살곶이길 200(사근동) / TEL. 010-7551-1890</p>
        </div>
    </div>   
</footer>
</div><!-- 메인 끝 -->


<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>

</body>
</html>