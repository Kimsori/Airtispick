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
    <title>데카당 상세</title>

</head>
<body>
<div id="top">
<c:if test="${id==null}">
  <a href="artispick?cmd=login"><i class="fas fa-sign-in-alt"></i> 로그인/회원가입</a>
</c:if>
 
 <c:if test="${id!=null}">
  <a href="artispick?cmd=logout"><i class="fas fa-sign-in-alt"></i> 로그아웃</a>
  <a href="artispick?cmd=mypage"><i class="fa fa-user-circle"></i> 마이페이지</a>
  <a href="artispick?cmd=mycart"><i class="fas fa-shopping-cart"></i> 장바구니</a>
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
    <b>${detaill.field}</b>
</div>

<div class="dcontainer">
    <h2 class="title"><b>${detaill.pjName}</b></h2>
</div>

<div class="row sub-top">
    <div class="col-7 col-top">
        <img src="img/${detaill.image}">
    </div>
    <div class="col-5 col-top">
        <div class="sub">
        <div class="">
            <a><b>総そう 後援金額</b></a>
            <p class="point">${detailll.totalPrice}ウォン<b class="percent"> ${detailll.percent}%</b></p>
            <a><b>残った 時間</b></a>
            <p class="point">${detaill.deadline}日</p>
            <a><b>総そう 後援者</b></a>
            <p class="point">${detailll.sponCount}人</p>
        </div>
            <div class="explain">
                <b class="ex1">ファンディング 進行中</b><br>
                <p class="ex1">目標金額である ${detaill.target}ウォンが 集まらなければ なりません. <br>決済は ${detaill.scheDate}に 共に進みます。</p>
            </div>

            <div class="bar">
            
            <button type="button" class="col-8 btn btn-danger"><a href="artispick?cmd=getsponListt&pjNum=${detaill.pjNum}" style="text-decoration:none; color:white;">     プロジェクト 後援</button>
            <button type="button" class="col-3 btn btn-outline-primary"><i class="fas fa-share-alt"></i></button>
            </div>

        </div>
    </div>
</div>   

<div class="dcontent">

<div class="row">
<div class="tabs">
        <div onclick="openCity('story')"><a data-toggle="tab" href="#story">Story</a></div>
        <div onclick="openCity('refund')"><a data-toggle="tab" href="#refund">払い戻し 及び交換政策</a></div>
</div>    
<div class="dcontainer">
    <div class="threequater">
    

        <div class="tab-content">
        <div id="story" class="city">
        <img src="img/${detaill.image}">
        <p>${detaill.pjStory}</p>
        </div>

        

        <div id="refund" class="city" style="display:none">
            <div class="">
            <h5><b> 払い戻し及び交換政策</b></h5>
            <p>${detaill.refund}</p>
            </div>

            <div class="">
            <div class=""><b>プロジェクトに ついて お問い 合わせ事項が ありますか。</b></div>
            <button class="btn btn-danger" data-toggle="modal" data-target="#exampleModal">創作者に 問い合わせる</button>

                <!-- Modal -->
                <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                    <div class="modal-dialog" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">共有する</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                        </div>
                        <div class="modal-body">
                        ...
                        </div>
                        <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                        <button type="button" class="btn btn-primary">Save changes</button>
                        </div>
                    </div>
                    </div>
                </div>
            </div>
        </div>
        </div>
    </div>

    <div class="quarter">
        <div class="product">

            <div class="pd">
            <p>創作者 紹介</p>
            <img src="img/thum.jpg"class="rounded-circle" style="width:20%">
            <b>${detaill.artiName}</b>
            </div>

            <p>${detaill.intro}</p>
            <div class="pro6">
                <button type="button" class="btn btn-default">創作者に 問い合わせる</button>
            </div>
        </div>

        <h6><b>選択可能な ${detaill.goodsCount}の 後援品</b></h6>
        
        <c:forEach items="${spongoods}" var="ProjectDetailInVO">
        <c:if test="${ProjectDetailInVO.store!=0}">
			<div class="product">
			<p class="choice">√ ${ProjectDetailInVO.spon_con}人が 選択</p>
			<h5><b>  ${ProjectDetailInVO.goods_price}ウォン</b></h5><!-- &pj_goods_num=${ProjectDetailInVO.pj_goods_num} -->
			<p>${ProjectDetailInVO.goods_name}</a><br>
			<p>予想伝達日: ${detaill.scheDate} / 在庫: ${ProjectDetailInVO.store}</a>
			<!--  <p>싸인CD</a><br>
			<p>스티커묶음</a><br>
			<p>엽서묶음</a><br>
			<p>예상 전달일  2018년 6월 1일</p>-->
			
			<div class="pro6">
			    <button type="button" onclick="location.href='artispick?cmd=getsponList&pjNum=${detaill.pjNum}&pj_goods_num=${ProjectDetailInVO.pj_goods_num}'" class="btn btn-danger">選択して 後援する</button>
			</div>
			</div>
		</c:if>
		
		<c:if test="${ProjectDetailInVO.store==0}">
			<div class="product" style="opacity: 0.3;">
			<p class="choice">√ ${ProjectDetailInVO.spon_con}人が 選択</p>
			<h5><b>  ${ProjectDetailInVO.goods_price}ウォン</b></h5><!-- &pj_goods_num=${ProjectDetailInVO.pj_goods_num} -->
			<p>${ProjectDetailInVO.goods_name}</a><br>
			<p>予想伝達日: ${detaill.scheDate} / 在庫: ${ProjectDetailInVO.store}</a>
			<!--  <p>싸인CD</a><br>
			<p>스티커묶음</a><br>
			<p>엽서묶음</a><br>
			<p>예상 전달일  2018년 6월 1일</p>-->
			
			<div class="pro6">
			    <button type="button" class="btn btn-danger">在庫不足</button>
			</div>
			</div>
		</c:if>
		</c:forEach>
        
    </div>
 
</div>
</div>

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

<script defer src="https://code.getmdl.io/1.3.0/material.min.js"></script>

<script>
function myFunction() {
  var x = document.getElementById("demo");
  if (x.className.indexOf("w3-show") == -1) {
      x.className += "w3-show";
  } else {
      x.className = x.className.replace("w3-show", "");
  }
}

function openCity(cityName) {
    var i;
    var x = document.getElementsByClassName("city");
    for (i = 0; i < x.length; i++) {
       x[i].style.display = "none";
    }
    document.getElementById(cityName).style.display = "block";
}

</script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>