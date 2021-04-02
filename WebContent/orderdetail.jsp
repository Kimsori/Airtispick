<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>

<style>
.content{font: 0.75em Lato,sans-serif,'나눔고딕',NanumGothic,'Nanum Gothic',Verdana,Dotum,AppleGothic,sans-serif;
    color: #353535;
    background: #fff;
    font-size: 14px;
    letter-spacing: 1px;}

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
    <h5 class="text-center">주문내역 조회</h5>
</div></center>

<div style="margin-top:1em; font-weight:bold;">
<a>주문 정보</a>
</div>

<table class="table table-bordered" style="margin-top:1em;">
	<tbody>
		<tr>
			<th scope="row">주문번호</th>
			<td>20170725-0000262</td>
		</tr>
		<tr>
			<th scope="row">주문일자</th>
			<td>2017-07-25 00:59:54</td>
		</tr>
		<tr>
			<th scope="row">주문자</th>
			<td><span>윤가원</span></td>
		</tr>
		<tr>
			<th scope="row">주문처리상태</th>
			<td>배송완료</td>
		</span>
		</td>
		</tr>
	</tbody>
</table>

<div style="margin-top:3em; font-weight:bold;">
    <a>주문 상품 정보</a>
</div>
    
<table class="table table-bordered" style="margin-top:1em;">
        <thead>
          <tr>
            <th style="padding-left:15px; width:10%;" scope="col">주문일</th>
            <th style="padding-left:15px;" scope="col">상품정보</th>
            <th style="padding-left:15px; width:12%;" scope="col">수량</th>
            <th style="padding-left:15px;" scope="col">금액</th>
            <th style="padding-left:15px; width:15%;" scope="col">주문처리상태</th>
          </tr>
        </thead>
        <tbody>

        <tr>
        <td style="padding-left:15px;" class="a_left">${QnaVO.qna_status}</td>
        <td style="padding-left:15px;">${QnaVO.qna_title}</td>
        <td style="padding-left:15px;">${QnaVO.qna_title}</td>
        <td style="padding-left:15px;">${QnaVO.qna_title}</td>
        <td style="padding-left:15px;">${QnaVO.qna_title}</td>
        </tr>
        
        <tr>
            <th colspan="6">
                <p class="text-right" style="font-size: 16px;">
                    상품구매금액 19,500 + 배송비 2,500 = 합계 : 22,000won</p>
            </th>
        </tr>
 
  </tbody>
</table>

<div style="margin-top:3em; font-weight:bold;">
	<a>배송 정보</a>
</div>
        
<table class="table table-bordered" style="margin-top:1em;">
	<tbody>
		<tr>
			<th scope="row">받으시는분</th>
			<td>윤가원</td>
		</tr>
		<tr>
			<th scope="row">주소</th>
			<td>어쩌구</td>
		</tr>
		<tr>
			<th scope="row">휴대전화</th>
			<td>010-7551-1890</td>
		</tr>
	</tbody>
</table>

<button type="submit" class="btn btn-dark float-right" action="artispick?cmd=order">
<a style="font-size:14px;">주문목록보기</a>
</button>

</div>
 </div> <!--content end -->

<jsp:include page="footer.jsp"></jsp:include>

</div><!--main end -->

<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>

</body>
</html>
    