<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
    
         <div class="container">
        <div class="idcheck">
            <p>가입이 완료됐습니다.</p>
        </div>
            <div class="loginok">
            <a href="artispick?cmd=login"><input class="btn btn-danger" type="submit" value="로그인하기"></a>
            </div>
        </div>


 </div> <!--content end -->
 <jsp:include page="footer.jsp"></jsp:include>
</div>
</body>
</html>