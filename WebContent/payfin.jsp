<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<head>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css" 
integrity="sha384-lKuwvrZot6UHsBSfcMvOkWwlCMgc0TaWr+30HWe3a4ltaBwTZhyTEggF5tJv8tbt" crossorigin="anonymous">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
<link href="https://fonts.googleapis.com/css?family=Nanum+Gothic:400,800|Alegreya+Sans:900|Cinzel:900|Nanum+Myeongjo" rel="stylesheet">
<link rel="stylesheet" href="css/pay.css">
</head>
<body>
<div class="main" style="width:100%;">
<table>
    <tr class="top">
        <th style="border-top:none;" id="first">
        <br><br>
        <h5>${asdf.pj_name}</h5><br><br>
        <a>選択した 商品</a><br>
        <a>${asdf.so_price}ウォン</a>
        <a>${asdf.so_amount}の 後援</a><br><br>
        <a>住所</a><br>
        <a>(${asdf.postcode}) ${asdf.addr} ${asdf.addr1}</a><br><br>
        <a>お名前</a><br>
        <a>${asdf.name}</a><br><br>

        </th>
    </tr>
    <tr>
        <th>
         <div class="finish">
            <h3><b>후원이 완료되셨습니다.</b></h3><br><br>
            <p>프로젝트가 목표금액을 모두 달성할 경우에만 2018년 12월 23일에 자동 결제됩니다. 
                <br>목표액에 미달할 경우 예정된 모든 결제는 자동으로 취소됩니다.</p><br>
            <div class="finishButton">    
            <button type="button" onclick="location.href='artispick?cmd=getsponsorList&id=<%=session.getAttribute("id")%>'" class="btn btn-danger btn-lg btn-block" style="background-color: #db312e;">내 후원현황보기</button>
            <button type="button" onclick="location.href='artispick?cmd=main'" class="btn btn-secondary btn-lg btn-block" style="background-color:white; color: black;">
                메인으로 돌아가기</button></div>
         </div>
        </th>
    </tr>
</table>
</div><!--main end -->



<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</body>
</html>