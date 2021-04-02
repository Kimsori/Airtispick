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
    <link rel="stylesheet" href="css/mypage.css">
    <title>아티스픽 메인</title>
<style>


</style>            
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>

<div class="content"> 
<h5 class="font-weight-bold">자주하는 질문</h5>

<div class="accordion" id="accordionExample">
    <div class="card">
      <div class="card-header" id="headingOne">
        <h5 class="mb-0">
          <button class="btn btn-link" type="button" data-toggle="collapse" data-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
            <i class="fas fa-quote-left"></i><a>아티스픽은 어떤 사이트인가요?</a><i class="fas fa-quote-right"></i>
          </button>
        </h5>
      </div>

      <div id="collapseOne" class="collapse show" aria-labelledby="headingOne" data-parent="#accordionExample">
        <div class="card-body">
무명 아티스트의 프로젝트를 후원하고 아티스트의 앨범을 구매할 수 있는 펀딩 사이트입니다.
        </div>
      </div>
    </div>
    <div class="card">
      <div class="card-header" id="headingTwo">
        <h5 class="mb-0">
          <button class="btn btn-link collapsed" type="button" data-toggle="collapse" data-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
            <i class="fas fa-quote-left"></i><a>후원은 어떻게 진행되나요?</a><i class="fas fa-quote-right"></i>
          </button>
        </h5>
      </div>
      <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionExample">
        <div class="card-body">
          창작자가 프로젝트를 사이트에 게시하고, 펀딩이 100% 달성완료 되면, 후원자는 원하는 프로젝트를 후원할 수 있습니다.<br>
          일정금액 이상 후원이 달성되면, 프로젝트 샵에서 판매 시작 후 3개월마다 배당금을 지급받을 수 있습니다.
        </div>
      </div>
    </div>
    <div class="card">
      <div class="card-header" id="headingThree">
        <h5 class="mb-0">
          <button class="btn btn-link collapsed" type="button" data-toggle="collapse" data-target="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
            <i class="fas fa-quote-left"></i><a>후원을 했는데 언제 인출이 되나요?</a><i class="fas fa-quote-right"></i>
          </button>
        </h5>
      </div>
      <div id="collapseThree" class="collapse" aria-labelledby="headingThree" data-parent="#accordionExample">
        <div class="card-body">
            프로젝트 마감이 끝난 후, 하루 뒤에 결제가 진행됩니다.<br>
            예를 들어 11월 11일이 마감일일 경우, 하루 뒤인 12일에 후원 순으로 결제가 진행됩니다.
        </div>
      </div>
    </div>
    <div class="card">
        <div class="card-header" id="headingFour">
          <h5 class="mb-0">
            <button class="btn btn-link collapsed" type="button" data-toggle="collapse" data-target="#collapseFour" aria-expanded="false" aria-controls="collapseFour">
                <i class="fas fa-quote-left"></i><a>정산일정을 알고싶어요!</a><i class="fas fa-quote-right"></i>
            </button>
          </h5>
        </div>
        <div id="collapseFour" class="collapse" aria-labelledby="headingFour" data-parent="#accordionExample">
          <div class="card-body">
            후원자의 경우, 일정금액 이상 후원한 후원자에 한해 프로젝트샵의 판매
          </div>
        </div>
      </div>
      <div class="card">
        <div class="card-header" id="headingFive">
          <h5 class="mb-0">
            <button class="btn btn-link collapsed" type="button" data-toggle="collapse" data-target="#collapseFive" aria-expanded="false" aria-controls="collapseFive">
                <i class="fas fa-quote-left"></i><a>수수료는 얼마인가요?</a><i class="fas fa-quote-right"></i>
            </button>
          </h5>
        </div>
        <div id="collapseFive" class="collapse" aria-labelledby="headingFive" data-parent="#accordionExample">
          <div class="card-body">
            창작자는 프로젝트가 100% 달성이 되면 총 모인 금액의 10% 수수료를 얻게 됩니다.<br>
            또, 프로젝트샵의 판매수익금의 아티스픽이 가져가는 수수료를 뺀 수익금을 얻게 됩니다.<br>
            아티스픽은 프로젝트의 총 모인 금액의 10% 수수료와 프로젝트샵의 개당 판매 수익금의 10%를 얻게 됩니다.<br>
          </div>
        </div>
      </div>
  </div>
</div> <!-- 컨텐트 끝 -->
<jsp:include page="footer.jsp"></jsp:include>



<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>

</body>
</html>