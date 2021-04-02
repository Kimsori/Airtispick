<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
.t1 th{text-align:center;}

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
    <h5 class="text-center">프로젝트SHOP 결제</h5>
</div></center>

<div style="margin-top:3em; font-weight:bold;">
    <a>주문 상품 정보</a>
</div>
<form action="artispick?cmd=shoporderInsert&shop_num=${detail.shop_num}&price=${detail.album_price}&id=<%=session.getAttribute("id")%>" method="post">
<table class="table table-bordered t1" style="margin-top:1em;">
        <thead>
          <tr>
            <th style="padding-left:15px;" scope="col">상품명</th>
            <th style="padding-left:15px; width:12%;" scope="col">수량</th>
            <th style="padding-left:15px;" scope="col">금액</th>
          </tr>
        </thead>
        <tbody>

        <tr>
        <td style="padding-left:15px;">${detail.album_name}</td>
        <td style="padding-left:15px;">
          <input  type="number" name="amount" value="1" id="example-number-input">
        </td>
        <td style="padding-left:15px;">${detail.album_price}</td>
        </tr>
        
 
  </tbody>
</table>

<div style="margin-top:1em; font-weight:bold;">
<a>주문 정보</a>
</div>

<table class="table table-bordered" style="margin-top:1em;">
	<tbody>
		<tr>
			<th scope="row">주문자</th>
			<td>${vo.userName}</td>
		</tr>
		<tr>
			<th scope="row">휴대전화</th>
			<td>${vo.phone}</td>
		</tr>
		<tr>
			<th scope="row">이메일</th>
			<td>${vo.email}</td>
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
			<td><input type="text" name="name" size=20></td>
		</tr>
		<tr>
			<th scope="row">주소</th>
			<td>
			<input type="int" class="form-control" name="postcode" placeholder="여기를 눌러서 주소를 선택하세요." readonly="readonly"><br>
           <input type="text" class="form-control" name="addr" placeholder="선택한 주소가 자동으로 입력됩니다." readonly="readonly">  <br>             
        	<input type="text" name="addr1" class="form-control col-5" id="inputSuccess1" placeholder="ex)사과빌라 1004호">
        
			</td>
		
		
		</tr>
	</tbody>
</table>

<button type="submit" class="btn btn-dark float-right" action="artispick?cmd=order">
<a style="font-size:14px;">주문하기</a>
</button>
</form>

</div>
 </div> <!--content end -->

<jsp:include page="footer.jsp"></jsp:include>

</div><!--main end -->

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://ssl.daumcdn.net/dmaps/map_js_init/postcode.v2.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

<script>
    $('input[name="postcode"]').click(function(){
        sample4_execDaumPostcode();
    });

    function sample4_execDaumPostcode() {
        new daum.Postcode({
            oncomplete: function(data) {
                var fullRoadAddr = data.roadAddress; // 도로명 주소 변수
                var extraRoadAddr = ''; // 도로명 조합형 주소 변수

                if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                    extraRoadAddr += data.bname;
                }
                // 건물명이 있고, 공동주택일 경우 추가한다.
                if(data.buildingName !== '' && data.apartment === 'Y'){
                    extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                }
                // 도로명, 지번 조합형 주소가 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                if(extraRoadAddr !== ''){
                    extraRoadAddr = ' (' + extraRoadAddr + ')';
                }
                // 도로명, 지번 주소의 유무에 따라 해당 조합형 주소를 추가한다.
                if(fullRoadAddr !== ''){
                    fullRoadAddr += extraRoadAddr;
                }

                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                $('input[name="postcode"]').val(data.zonecode);
                //5자리 새우편번호 사용
                $('input[name="addr"]').val(fullRoadAddr);
            }
        }).open();
    }

   
</script>
</body>
</html>
    