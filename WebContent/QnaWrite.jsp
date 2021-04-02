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
    <title>1:1문의하기</title>
<style>


</style>            
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>

<div class="content"> 
<h5 style="font-weight: bold">1:1 문의하기</h5>

    <form action="s" method="post" style="margin-top: 20px">
        <div id="contentForm">
            <table class="table table-bordered">
              <thead>
                <tr>
                    <th class="table-active" style="width: 10%; vertical-align: middle;">문의 제목</th>
                    <th><input type="text" class="form-control" placeholder="제목을 입력해주세요"></th>
                </tr>
                <tr>
                   
                </tr>
              </thead>
              <tbody>
                <tr>
                <th class="table-active" style="width: 10%; vertical-align: middle;">문의 내용</th>
                  <th>
                    <textarea class="form-control" id="exampleFormControlTextarea1" rows="20" placeholder="내용을 입력해주세요"></textarea>
                  </th>
                </tr>
              </tbody>
            </table>
          </div>
          <center><button type="button" class="btn btn-danger">전송하기</button></center>  
        </div>
      </form>


    
</div> <!-- 컨텐트 끝 -->
<jsp:include page="footer.jsp"></jsp:include>



<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>

</body>
</html>