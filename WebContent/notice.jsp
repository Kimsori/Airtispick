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

<div class="content"> 

    <table class="table table-sm">
        <thead>
          <tr>
            <th scope="col">글번호</th>
            <th scope="col">제목</th>
            <th scope="col">작성일</th>
            <th scope="col">조회수</th>
            <th scope="col">작성자</th>
          </tr>
        </thead>
        <tbody>
        
        <c:forEach items="${noti}" var="AdminVO">
          <tr>
            <th scope="row">${AdminVO.noticeNum}</th>
            <td><a href=artispick?cmd=getDetailNotice&noticeNum=${AdminVO.noticeNum} style="color:black;">${AdminVO.title}</a></td> 
            <td>${AdminVO.noticeDate}</td>
            <td>${AdminVO.view}</td>
            <td>${AdminVO.adminId}</td> 
          </tr>
       </c:forEach>
       
        </tbody>
      </table>
    
   <nav aria-label="Page navigation example">
  <ul class="pagination justify-content-center">
    <li class="page-item">
    <c:if test="${currentPage != 1}">
      <a class="page-link" href="artispick?cmd=noti&page=${currentPage - 1}" aria-label="Previous">
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
    <li class="page-item"><a style= "color:rgb(70, 69, 69);" class="page-link" href="artispick?cmd=noti&page=${i}">${i}</a></li>
    </c:otherwise>
                </c:choose>
            </c:forEach>
    <li class="page-item">
    <c:if test="${currentPage le noOfPages}">
      <a class="page-link" href="artispick?cmd=noti&page=${currentPage + 1}" aria-label="Next">
        <span style= "color:rgb(70, 69, 69);" aria-hidden="true">&raquo;</span>
        <span class="sr-only">Next</span>
      </a>
      </c:if>
    </li>
  </ul>
</nav>  
    
</div> <!-- 컨텐트 끝 -->
<jsp:include page="footer.jsp"></jsp:include>



<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>

</body>
</html>