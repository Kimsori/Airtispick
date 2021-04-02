<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <title>마이페이지_내문의/메세지함</title>
<style>
table{font:0.75em Lato,sans-serif,'나눔고딕',NanumGothic,'Nanum Gothic';}
#message-tab{margin-top:1rem; font:Lato,sans-serif,'나눔고딕',NanumGothic,'Nanum Gothic';}
</style>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>

<div class="main">
  <div class="content">

<h5 class="font-weight-bold">
<a href="artispick?cmd=mypage" style="text-decoration:none; color:black;">
<i class="fas fa-angle-left" style="padding-right: 5px"></i>
마이페이지</a></h5>

<ul class="nav nav-pills mb-1" id="pills-tab" role="tablist">
    <li class="nav-item">
        <a class="nav-link active" id="message-tab" data-toggle="pill" href="#message" role="tab" aria-controls="message" aria-selected="true">내 문의/메세지함</a>
    </li>
</ul>

<table class="table table-bordered">
        <thead>
          <tr>
            <th style="padding-left:15px; width:30%;" scope="col">답변상태</th>
            <th style="padding-left:15px;" scope="col">문의제목</th>
          </tr>
        </thead>
        <tbody>
        
        <c:forEach items="${qnalist}" var="QnaVO" varStatus="status">
		<tr>
		<td style="padding-left:15px;" class="a_left">${QnaVO.qna_status}</td>
		<td style="padding-left:15px;">${QnaVO.qna_title}</td>
		</tr>
		
</c:forEach>
 
  </tbody>
</table>

 <nav aria-label="Page navigation example">
  <ul class="pagination justify-content-center">
    <li class="page-item">
    <c:if test="${currentPage != 1}">
      <a class="page-link" href="artispick?cmd=getQnaList&page=${currentPage - 1}" aria-label="Previous">
        <span style= "color:rgb(70, 69, 69);" aria-hidden="true">&laquo;</span>
        <span class="sr-only">Previous</span>
      </a>
      </c:if>
    </li>
    <c:forEach begin="1" end="${noOfPages}" var="i">
                <c:choose>
                    <c:when test="${currentPage eq i}">
    <li class="page-item"><a style= "color:rgb(70, 69, 69);" class="page-link" href="#">${i}</a></li>
    </c:when>
                    <c:otherwise>
    <li class="page-item"><a style= "color:rgb(70, 69, 69);" class="page-link" href="artispick?cmd=getQnaList&page=${i}">${i}</a></li>
    </c:otherwise>
                </c:choose>
            </c:forEach>
    <li class="page-item">
    <c:if test="${currentPage le noOfPages}">
      <a class="page-link" href="artispick?cmd=getQnaList&page=${currentPage + 1}" aria-label="Next">
        <span style= "color:rgb(70, 69, 69);" aria-hidden="true">&raquo;</span>
        <span class="sr-only">Next</span>
      </a>
      </c:if>
    </li>
  </ul>
</nav> 

 </div> <!--content end -->

<jsp:include page="footer.jsp"></jsp:include>

</div><!--main end -->



<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>

</body>
</html>

    