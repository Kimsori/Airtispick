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
        <i class="fas fa-chevron-left" style="margin-right:5px;cursor:pointer;"></i>
        <a href="payment.jsp" style="color:white; text-decoration:none; cursor:pointer;">이전으로</a><br><br>
        <h5>${asdf.pj_name}</h5><br><br>
        <a>선택한 상품</a><br>
        <a>${asdf.so_price}원</a>
        <a>${asdf.so_amount}개 후원</a>
        </th>
    </tr>
    <tr>
        <th>
           <p>카드선택</p>
           <div class="form-group">
                <select class="form-control col-2" id="exampleSelect1">
                  <option>신한은행</option>
                  <option>하나은행</option>
                  <option>국민은행</option>
                  <option>우리은행</option>
                  <option>우체국</option>
                </select>
            </div>
        </th>
    </tr>
    <tr>
        <th>
            <p>카드번호</p>
            <form class="form-inline">
                <label class="sr-only" for="inlineFormInput">Name</label>
                <input type="text" class="form-control mb-2 mr-sm-2 mb-sm-0" id="inlineFormInput">
                
                <label class="sr-only" for="inlineFormInput">Name</label>
                <input type="text" class="form-control mb-2 mr-sm-2 mb-sm-0" id="inlineFormInput">
                
                <label class="sr-only" for="inlineFormInput">Name</label>
                <input type="text" class="form-control mb-2 mr-sm-2 mb-sm-0" id="inlineFormInput">
                <label class="sr-only" for="inlineFormInput">Name</label>
                <input type="text" class="form-control mb-2 mr-sm-2 mb-sm-0" id="inlineFormInput">
                
            </form>
            </div>
        </th>
    </tr>
    <tr>
        <th>
            <p>유효기간</p>
            <input type="text" class="form-control col-1" id="inputSuccess1" placeholder="MM/YY">
        </th>
    </tr>
    <tr>
        <th>
            <div class="form-group">
                <label for="exampleInputPassword1">비밀번호</label><br>
                <input type="password" class="form-control col-1" id="exampleInputPassword1" placeholder="****">
            </div>
        </th>
    </tr>
    <tr>
        <th>
            <p>핸드폰번호</p>
                <input class="form-control col-4" type="tel" value="010-1234-1234" id="example-tel-input">
        </div>
        </th>
    </tr>
    <tr>
        <th>
            <button type="button" onclick="location.href='artispick?cmd=getselectsponss&pj_num=${asdf.pj_num}&pj_goods_num=${asdf.pj_goods_num}'" class="btn btn-danger btn-lg btn-block" style="background-color: #db312e;">다음</button>
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