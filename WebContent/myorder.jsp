<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<head>
<link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">

<style>
.content{font: 0.75em Lato,sans-serif,'나눔고딕',NanumGothic,'Nanum Gothic',Verdana,Dotum,AppleGothic,sans-serif;
    color: #353535;
    background: #fff;
    font-size: 14px;
    letter-spacing: 1px;}

fieldset {
    display: block;
    min-inline-size: min-content;
    border-width: 2px;
    border-style: groove;
    border-color: threedface;
    border-image: initial;
    margin-bottom:1rem;
    width:100%;
}
.ec-base-box {
	margin:1rem;
    padding: 5px;
    border: 1px solid #dedede;
}
.stateSelect {
    display: inline-block;
    padding: 0 12px 0 0;
    margin: 0 5px 0 2px;
    background: url(//img.echosting.cafe24.com/skin/base/common/ico_bar.gif) no-repeat 100% 6px;
}
select {
    height: 24px;
    border: 1px solid #d5d5d5;
}
input, select, textarea {
    font-size: 100%;
    font-family: Lato,sans-serif,"돋움",Dotum;
    color: #353535;
    vertical-align: middle;
    font-size: 11px;
}

select {
    -webkit-appearance: menulist;
    box-sizing: border-box;
    align-items: center;
    white-space: pre;
    -webkit-rtl-ordering: logical;
    color: black;
    background-color: white;
    cursor: default;
}

fieldset button {
    width: 14px;
    height: 14px;
    margin: 0 5px 0 2px;
    background: rgb(0,0,0,0);
}

button {
    overflow: visible;
    padding: 0;
    margin: 0;
    border: 0;
    cursor: pointer;
    color: buttontext;
    display: inline-block;
}

.period img{width:39px; hegiht:24px;}
.period a {
    margin: 0 0 0 -5px;
}
.period #im1{width:35px;}

table th{text-align:center;}

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
</style>
</head>
<jsp:include page="header.jsp"></jsp:include>

<div class="main">
  <div class="content">

<h5 class="font-weight-bold">
<a href="artispick?cmd=mypage" style="text-decoration:none; color:black;">
<i class="fas fa-angle-left" style="padding-right: 5px"></i>
마이페이지</a></h5>
 

<center><div class="titleArea">
    <h4 class="text-center">주문내역 조회</h4>
</div></center>
         
                
<fieldset class="ec-base-box">
<div class="stateSelect ">
<select id="order_status" name="order_status" class="fSelect">
<option value="all">전체 주문처리상태</option>
<option value="shipped_before">입금전</option>
<option value="shipped_standby">배송준비중</option>
<option value="shipped_begin">배송중</option>
<option value="shipped_complate">배송완료</option>
<option value="order_cancel">취소</option>
<option value="order_exchange">교환</option>
<option value="order_return">반품</option>
</select>        
</div>

<span class="period">
            <a href="#none" class="btnNormal" days="00"><img id="im1" src="img/btn_date1.gif" alt="오늘"></a>
            <a href="#none" class="btnNormal" days="07"><img src="//img.echosting.cafe24.com/skin/base_ko_KR/myshop/btn_date2.gif" offimage="//img.echosting.cafe24.com/skin/base_ko_KR/myshop/btn_date2.gif" onimage="//img.echosting.cafe24.com/skin/base_ko_KR/myshop/btn_date2_on.gif" alt="1주일"></a>
            <a href="#none" class="btnNormal" days="30"><img src="//img.echosting.cafe24.com/skin/base_ko_KR/myshop/btn_date3.gif" offimage="//img.echosting.cafe24.com/skin/base_ko_KR/myshop/btn_date3.gif" onimage="//img.echosting.cafe24.com/skin/base_ko_KR/myshop/btn_date3_on.gif" alt="1개월"></a>
            <a href="#none" class="btnNormal" days="90"><img src="//img.echosting.cafe24.com/skin/base_ko_KR/myshop/btn_date4.gif" offimage="//img.echosting.cafe24.com/skin/base_ko_KR/myshop/btn_date4.gif" onimage="//img.echosting.cafe24.com/skin/base_ko_KR/myshop/btn_date4_on.gif" alt="3개월"></a>
            <a href="#none" class="btnNormal" days="180"><img src="//img.echosting.cafe24.com/skin/base_ko_KR/myshop/btn_date5.gif" offimage="//img.echosting.cafe24.com/skin/base_ko_KR/myshop/btn_date5.gif" onimage="//img.echosting.cafe24.com/skin/base_ko_KR/myshop/btn_date5_on.gif" alt="6개월"></a>
        </span>
        
<input type="text" id="from" size=11>
<button type="button" class="ui-datepicker-trigger">
<img src="//img.echosting.cafe24.com/skin/admin_ko_KR/myshop/ico_cal.gif"></button> ~ 
<input type="text" id="to" size=11>
<button type="button" class="ui-datepicker-trigger">
<img src="//img.echosting.cafe24.com/skin/admin_ko_KR/myshop/ico_cal.gif"></button>        
<input alt="조회" id="search" type="image" src="//img.echosting.cafe24.com/skin/admin_ko_KR/myshop/btn_search.gif">    
</fieldset>

<div style="margin-top:1em; font-weight:bold;">
<a>주문 상품 정보</a>
</div>

<table class="table table-bordered" style="margin-top:1em;">
        <thead>
          <tr>
            <th style="padding-left:15px; width:13%;" scope="col">주문일</th>
            <th style="padding-left:15px;" scope="col">상품명</th>
            <th style="padding-left:15px; width:12%;" scope="col">수량</th>
            <th style="padding-left:15px;" scope="col">금액</th>
            <th style="padding-left:15px; width:15%;" scope="col">주문처리상태</th>
          </tr>
        </thead>
        <tbody>
        
        <c:forEach items="${detail}" var="ShopVO" varStatus="status">
		<tr>
		<td style="padding-left:15px;" class="a_left">${ShopVO.order_date}</td>
		<td style="padding-left:15px;">${ShopVO.album_name}</td>
		<td style="padding-left:15px;">${ShopVO.amount}</td>
		<td style="padding-left:15px;">${ShopVO.total}</td>
		<td style="padding-left:15px;">${ShopVO.status}</td>
		</tr>
		
</c:forEach>
 
  </tbody>
</table>

 </div> <!--content end -->

<jsp:include page="footer.jsp"></jsp:include>

</div><!--main end -->



    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
<script>
$.datepicker.regional['kr'] = {
    closeText: '닫기', // 닫기 버튼 텍스트 변경
    currentText: '오늘', // 오늘 텍스트 변경
    monthNames: ['1 월','2 월','3 월','4 월','5 월','6 월','7 월','8 월','9 월','10 월','11 월','12 월'], // 개월 텍스트 설정
    monthNamesShort: ['1 월','2 월','3 월','4 월','5 월','6 월','7 월','8 월','9 월','10 월','11 월','12 월'], // 개월 텍스트 설정
    dayNames: ['월요일','화요일','수요일','목요일','금요일','토요일','일요일'], // 요일 텍스트 설정
    dayNamesShort: ['월','화','수','목','금','토','일'], // 요일 텍스트 축약 설정&nbsp;   dayNamesMin: ['월','화','수','목','금','토','일'], // 요일 최소 축약 텍스트 설정
    dateFormat: 'yy/mm/dd' // 날짜 포맷 설정
};

// Seeting up default language, Korean
$.datepicker.setDefaults($.datepicker.regional['kr']);

$(function () {
    var rangeDate = 360; // set limit day
var setSdate, setEdate;
$("#from").datepicker({
    maxDate:0,
    dateFormat: 'yy-mm-dd',
    onSelect: function(selectDate){
        var stxt = selectDate.split("-");
            stxt[1] = stxt[1] - 1;
        var sdate = new Date(stxt[0], stxt[1], stxt[2]);
        var edate = new Date(stxt[0], stxt[1], stxt[2]);
            edate.setDate(sdate.getDate() + rangeDate);
 
        $('#to').datepicker('option', {
            minDate: selectDate,
            beforeShow : function () {
                $("#to").datepicker( "option", "maxDate", edate );
                setSdate = selectDate;
                console.log(setSdate)
        }});
        //to 설정
    }
    //from 선택되었을 때
});
 
$("#to").datepicker({
    dateFormat: 'yy-mm-dd',
    onSelect : function(selectDate){
        setEdate = selectDate;
        console.log(setEdate)
            
    }
});
        });
</script>

</body>
</html>
    