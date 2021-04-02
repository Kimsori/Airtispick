<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css" 
    integrity="sha384-lKuwvrZot6UHsBSfcMvOkWwlCMgc0TaWr+30HWe3a4ltaBwTZhyTEggF5tJv8tbt" crossorigin="anonymous">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
    <link href="https://fonts.googleapis.com/css?family=Nanum+Gothic:400,800|Alegreya+Sans:900|Cinzel:900|Nanum+Myeongjo" rel="stylesheet">
    <link rel="stylesheet" href="css/base.css">
    <link rel="stylesheet" href="css/artispick.css">
    <link rel="stylesheet" href="css/artispick12.css">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>회원가입</title>

</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div class="main">
    <div class="content">
    
        <h5>아이디찾기</h5>
        <p>고객님의 정보와 일치하는 아이디입니다.</p>
    
        <div class="container">
        
        <div class="idcheck">
            <p>아이디: ${id}</p>
        </div>
        
        
            <div class="loginok" >
            <a href="artispick?cmd=idpassfind"><input class="btn btn-danger" type="submit" value="로그인하기"></a>
            </div>
        </div>

 </div> <!--content end -->
 <jsp:include page="footer.jsp"></jsp:include>
</div>
</body>
</html>