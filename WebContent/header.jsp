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
    <link rel="stylesheet" href="css/detail.css">
    
    <meta http-equiv="X-UA-Compatible" content="ie=edge">


</head>
<body>
<div id="top">
<c:if test="${id==null}">
  <a href="artispick?cmd=login"><i class="fas fa-sign-in-alt"></i> 로그인/회원가입</a>
</c:if>
 
 <c:if test="${id!=null}">
  <a href="artispick?cmd=logout"><i class="fas fa-sign-in-alt"></i> ログアウト</a>
  <a href="artispick?cmd=mypage"><i class="fa fa-user-circle"></i> マイページ</a>
  <a href="artispick?cmd=shopcart&id=<%=session.getAttribute("id")%>"><i class="fas fa-shopping-cart"></i> 買い物かご</a>
  <a class="hi">歓迎致します <strong><%=session.getAttribute("id")%> 様</strong></a>
</c:if>
 
  
</div>

<header class="display-3">
    <a id=artispick href="artispick?cmd=main">ARTISPICK</a>
</header>

<nav class="navbar navbar-expand-lg navbar-light">
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo01" aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarTogglerDemo01">
        <ul class="navi navbar-nav mr-auto">
        <li class="nav-item">
            <a class="nav-link" href="artispick?cmd=pjlist">プロジェクト 見回す</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="artispick?cmd=shoplist">プロジェクト SHOP</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="artispick?cmd=pjpost">プロジェクト Upload</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="artispick?cmd=about">サイト 調べる</a>
        </li>
        <li class="nav-item dropdown">
            <a class="dropdown nav-link">
              顧客センター
            </a>
            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
              <a class="dropdown-item" href="artispick?cmd=notice">공지사항</a>
              <a class="dropdown-item" href="artispick?cmd=fqa">자주하는 질문</a>
              <a class="dropdown-item" href="artispick?cmd=QnaWrite">1:1문의</a>
            </div>
        </li>
        </ul>
        <form class="form-inline my-2 my-lg-0">
        <input class="search form-control mr-sm-2" type="search">
        <button class="btn btn-sm my-2 my-sm-0" type="submit"><i class="fas fa-search"></i></button>
        </form>
    </div>
</nav>
