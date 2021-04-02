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
<h5 style="font-weight: bold">공지사항</h5>

   <form action="s" method="post" style="margin-top: 20px">
       <div id="contentForm">
           <table class="table">
             <thead>
               <tr>
                   <th scope="row" style="width: 10%">제목</th>
                   <td style="width: 50%">${detail.title}</td>
                   <th scope="row" style="width: 10%">조회수</th>
                   <td style="width:20%">${detail.view}</td>
               </tr>
               <tr>
                   <th scope="row">작성자</th>
                   <td>${detail.adminId}</td>
                   <th scope="row">작성시간</th>
                   <td>${detail.noticeDate}</td>
               </tr>
             </thead>
             <tbody>
               <tr>
                 <td class="table-secondary" colspan="4">
                  ${detail.content}
                 </td>
               </tr>
             </tbody>
           </table>
         </div>
         <button type="button" class="btn btn-secondary">수정하기</button>  
         <button type="button" class="btn btn-outline-secondary float-right">
         <a href=artispick?cmd=notice style="color:black; text-decoration:none;">목록으로</a></button>  
       </div>
     </form>


    
</div> <!-- 컨텐트 끝 -->
<jsp:include page="footer.jsp"></jsp:include>



<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>

</body>
</html>