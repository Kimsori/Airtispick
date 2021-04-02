<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
String CTX = request.getContextPath();
%>
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
    <title>프로젝트shop 장바구니</title>
<style>
table{font:0.75em Lato,sans-serif,'나눔고딕',NanumGothic,'Nanum Gothic';}
td.button a {
    border: 1px solid #dedede;
    display: block;
    width: 95px;
    text-align: center;
    padding: 5px 0;
    margin: 2px auto;
    cursor: pointer;
    color: black;
}
td.button a:hover{
text-decoration:none;}
.btt a:hover{text-decoration:none;}
td:nth-child(1){
font-size:15px;
}
.titleArea{
    display: inline-block;
    color: #2e2e2e;
    font-size: 13px;
    letter-spacing: 2px;
    font-weight: 500;
    border-bottom: 1px solid #666;
    font-family: Lato;
    padding-bottom: 10px;
    margin: 30px 0 30px;
    text-align: center;
}
.btt{margin-top: 1rem;}
.btt a{
    padding:10px;
    font-size:13px;
    color: white;
}
.btt a:nth-child(1){background-color: #db312e;}
#amount{width: 50px;}
td:nth-child(2) a{width: 50px;}
.btbt{background-color:white; border:1px solid #dedede; padding:5px 13px; cursor:pointer;}
#btbt{background-color:white; border:1px solid #dedede; padding:5px 13px;}

</style>
<script>
$(document).ready(function() {
  
function editSu(editBtn) { //[수정]버튼 클릭
    var rStr = editBtn.name;
    var arr = rStr.split(",");
    var query = "<%= CTX %>/cartUpdateForm.do?cart_id=" + arr[0];
    query += "&buy_count=" + arr[1];
    window.location.href = query;
}

function delList(delBtn) { //[삭제]버튼 클릭
    var rStr = delBtn.name;
    var query = "<%= CTX %>/artispick?cmd=cartdelete&list=" + rStr;
    window.location.href = query;
}
</script>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>

<div class="main">
  <div class="content">

<h5 class="font-weight-bold">
<a href="artispick?cmd=mypage" style="text-decoration:none; color:black;">
<i class="fas fa-angle-left" style="padding-right: 5px"></i>
마이페이지</a></h5>

<center><div class="titleArea">
    <h4 class="text-center">프로젝트SHOP 장바구니</h4>
</div></center>

<div class="cart">
<table class="table table-bordered text-center">
        <thead>
          <tr>
            <th style="padding-left:15px;" scope="col">상품명</th>
            <th style="padding-left:15px;" scope="col">수량</th>
            <th style="padding-left:15px;" scope="col">상품가격</th>
            <th style="padding-left:15px;" scope="col">배송비</th>
            <th style="padding-left:15px;" scope="col">합계</th>
            <th style="padding-left:15px;" scope="col">선택</th>
          </tr>
        </thead>
        <tbody>
        
        <c:forEach items="${list}" var="ShopCartVO" varStatus="status">
		<tr>
		<td class="align-middle" style="padding-left:15px;">${ShopCartVO.shop_title}</td>
        <td class="align-middle button" style="padding-left:15px;">
        <input type="text" id="amount" name="amount" size="2" value="${ShopCartVO.amount}"/><br>
        <a style="margin-top:5px;" id="updateSu" href="#" name="${ShopCartVO.shop_cart_num},${ShopCartVO.amount}" onclick="editSu(this)">수정</a>
        </td>
        <td class="align-middle" style="padding-left:15px;">
        <fmt:formatNumber value="${ShopCartVO.getPrice()}" type="number" pattern="#,##0"/>원</td>
        <td class="align-middle" style="padding-left:15px;">2,500원</td>
        <td class="align-middle" style="padding-left:15px;">
        <c:set var="amount" value="${ShopCartVO.price*ShopCartVO.amount}"></c:set>
        <c:set var="price" value="${ShopCartVO.price*ShopCartVO.amount+2500}"></c:set>
        <c:set var="total" value="${total+amount}"></c:set>
        <fmt:formatNumber value="${price}" type="number" pattern="#,##0"/>원</td>
        <td class="button" style="padding-left:15px;">
            <input class="btbt" type="submit" name="action" value="주문하기"><br>
            <input style="margin-top:5px;" class="btbt" type="submit" name="action" value="삭제하기">
        </td>
        </tr>
        </c:forEach>
        <tr>
            <th colspan="6">
                <p class="text-right" style="font-size: 16px;">
                   상품금액 <fmt:formatNumber value="${total}" type="number" pattern="#,##0"/>원 
                   + 배송비 2,500원 =
                   총 <fmt:formatNumber value="${total+2500}" type="number" pattern="#,##0"/>원
            </th>
        </tr>
  </tbody>
</table>
</div>


<div class="btt float-right">
    <a class="btn-danger rounded" href="#">전체주문</a>
    <!--<form id="cartClearForm" method="post" action="">
        <input type="hidden" name="list" value="all">-->
       <!--   <input type="submit" value="장바구니비우기">-->
   <a class="btn-dark rounded" href="#">장바구니 비우기</a>
    <!--</form>-->
</div>

 </div> <!--content end -->

<jsp:include page="footer.jsp"></jsp:include>

</div><!--main end -->



<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>

</body>
</html>

    