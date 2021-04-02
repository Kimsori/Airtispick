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
    <link rel="stylesheet" href="css/base.css">
    <link rel="stylesheet" href="css/artispick.css">
    <title>아티스픽 메인</title>
<style>


</style>            
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>

<div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
    <div class="carousel-inner">
      <div class="carousel-item active">
        <img class="d-block w-100" src="img/c1.jpg" alt="First slide">
      </div>
      <div class="carousel-item">
        <img class="d-block w-100" src="img/c4.jpg" alt="Second slide">
      </div>
      <div class="carousel-item">
        <img class="d-block w-100" src="img/c2.jpg" alt="Third slide">
      </div>
    </div>
    <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
      <span class="carousel-control-prev-icon" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
      <span class="carousel-control-next-icon" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
</div>

<div class="main">
<div class="content"> 

    <h4><span class="menu">人気 プロジェクト</span></h4>
    <div class="card-deck">
    <c:forEach items="${pop}" var="ProjectVO">
    <a href=artispick?cmd=getDetailProject&pjNum=${ProjectVO.pj_num}>
        <div class="card">
        
            <img class="card-img-top" src="img/${ProjectVO.image}" alt="${projectVO.pj_name}">
            <div class="card-body">
                <h6 class="card-title" style="color:black;"><b>${ProjectVO.pj_name}</b></h4>
                <a>${ProjectVO.arti_name}</a>

                <div class="progress" >
                    <div class="progress-bar bg-danger" role="progressbar" style="width: ${ProjectVO.target}%" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100"></div>
                </div>

                <div class="card-sub">
                    <span>${ProjectVO.deadline}日 濫飲</span>
                    <span><b>${ProjectVO.total}ウォン</b></span>
                    <span>${ProjectVO.target}%</span>
                </div>  
            </div>
            </a>
        </div>
        </c:forEach>
    </div>


      <h4><span class="menu">NEW プロジェクト</span></h4>

      <div class="card-deck">
      <c:forEach items="${brandnew}" var="ProjectVO">
      <a href=artispick?cmd=getDetailProject&pjNum=${ProjectVO.pj_num}>
        <div class="card">
            <img class="card-img-top" src="img/${ProjectVO.image}" alt="${projectVO.pj_name}">
            <div class="card-body">
                <h6 class="card-title" style="color:black;"><b>${ProjectVO.pj_name}</b></h4>
                <a>${ProjectVO.arti_name}</a>

                <div class="progress" >
                    <div class="progress-bar bg-danger" role="progressbar" style="width: ${ProjectVO.target}%" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100"></div>
                </div>

                <div class="card-sub">
                    <span>${ProjectVO.deadline}日 濫飲</span>
                    <span><b>${ProjectVO.total}ウォン</b></span>
                    <span>${ProjectVO.target}%</span>
                </div>  
            </div>
            </a>
        </div>
        </c:forEach>
    </div>
      
      <h4><span class="menu">締め切り 間近 プロジェクト</span></h4>
      
      <div class="card-deck">
      <c:forEach items="${fin}" var="ProjectVO">
      <a href=artispick?cmd=getDetailProject&pjNum=${ProjectVO.pj_num}>
        <div class="card">
            <img class="card-img-top" src="img/${ProjectVO.image}" alt="${projectVO.pj_name}">
            <div class="card-body">
                <h6 class="card-title" style="color:black;"><b>${ProjectVO.pj_name}</b></h4>
                <a>${ProjectVO.arti_name}</a>

                <div class="progress" >
                    <div class="progress-bar bg-danger" role="progressbar" style="width: ${ProjectVO.target}%" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100"></div>
                </div>

                <div class="card-sub">
                    <span>${ProjectVO.deadline}日 濫飲</span>
                    <span><b>${ProjectVO.total}ウォン</b></span>
                    <span>${ProjectVO.target}%</span>
                </div>  
            </div>
            </a>
        </div>
        </c:forEach>
        
    </div>
    <jsp:include page="footer.jsp"></jsp:include>
</div> <!-- 컨텐트 끝 -->


<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>

</body>
</html>