<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
    <title>프로젝트 둘러보기</title>

</head>
<body>
<div id="top">
  <a href="#"><i class="fas fa-sign-in-alt"></i></i> 로그인/회원가입</a>
  <a href="#"><i class="fa fa-user-circle"></i> 마이페이지</a>
  <a href="#"><i class="fas fa-shopping-cart"></i> 장바구니</a>
  <a class="hi">안녕하세요 <strong> 가원님</strong></a>
</div>

<header class="display-3">
    <a>ARTISPICK</a>
</header>

<nav class="navbar navbar-expand-lg navbar-light">
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo01" aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarTogglerDemo01">
        <ul class="navi navbar-nav mr-auto">
        <li class="nav-item">
            <a class="nav-link" href="#">프로젝트 둘러보기</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="#">프로젝트SHOP</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="#">프로젝트 올리기</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="#">알아보기</a>
        </li>
        <li class="nav-item dropdown">
            <a class="dropdown nav-link">
              고객센터
            </a>
            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
              <a class="dropdown-item" href="#">공지사항</a>
              <a class="dropdown-item" href="#">자주하는 질문</a>
              <a class="dropdown-item" href="#">1:1문의</a>
            </div>
        </li>
        </ul>
        <form class="form-inline my-2 my-lg-0">
        <input class="search form-control mr-sm-2" type="search">
        <button class="btn btn-sm my-2 my-sm-0" type="submit"><i class="fas fa-search"></i></button>
        </form>
    </div>
</nav>

<div class="main">
<div class="content">

    <div class="field">
        <div class="box">
        <i class="fa fa-search"></i> Tags: <span>#발라드</span>
        <span class="tag">#댄스</span>
        <span class="tag">#포크/블루스</span>
        <span class="tag">#인디음악</span>
        <span class="tag">#랩/힙합</span>
        <span class="tag">#락/메탈</span>
        <span class="tag">#R&B/Soul</span>
        <span class="tag">#재즈</span>
        <span class="tag">#뉴에이지</span>
        <span class="tag">#ETC</span>
        </div>
    </div>

    <h5>검색어: </h5>
<%=request.getAttribute("search") %>

    <div class="select">
        <select>
           <option value="max">최다후원순</option>
           <option value="popular">인기순</option>
           <option value="end">마감임박순</option>
        </select>
    </div>

    <div class="card-deck">
        <div class="card">
            <img class="card-img-top" src="img/de1.png" alt="데카당 정규앨범">
            <div class="card-body">
                <h6 class="card-title"><b>데카당 첫 정규앨범</b></h4>
                <a>데카당</a>

                <div class="progress" >
                    <div class="progress-bar bg-danger" role="progressbar" style="width: 100%" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100"></div>
                </div>

                <div class="card-sub">
                    <span>14일 남음</span>
                    <span><b>3.000.000원</b></span>
                    <span>225%</span>
                </div>  
            </div>
        </div>
        
        <div class="card">
            <img class="card-img-top" src="img/de1.png" alt="데카당 정규앨범">
            <div class="card-body">
                <h6 class="card-title"><b>데카당 첫 정규앨범</b></h4>
                <a>데카당</a>

                <div class="progress" >
                    <div class="progress-bar bg-danger" role="progressbar" style="width: 100%" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100"></div>
                </div>

                <div class="card-sub">
                    <span>14일 남음</span>
                    <span><b>3.000.000원</b></span>
                    <span>225%</span>
                </div>  
            </div>
        </div>
            
        <div class="card">
            <img class="card-img-top" src="img/de1.png" alt="데카당 정규앨범">
            <div class="card-body">
                <h6 class="card-title"><b>데카당 첫 정규앨범</b></h4>
                <a>데카당</a>

                <div class="progress">
                    <div class="progress-bar bg-danger" role="progressbar" style="width: 100%" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100"></div>
                </div>

                <div class="card-sub">
                    <span>14일 남음</span>
                    <span><b>3.000.000원</b></span>
                    <span>225%</span>
                </div>  
            </div>
        </div>


        <div class="card">
            <img class="card-img-top" src="img/de1.png" alt="데카당 정규앨범">
            <div class="card-body">
                <h6 class="card-title"><b>데카당 첫 정규앨범</b></h4>
                <a>데카당</a>

                <div class="progress" >
                    <div class="progress-bar bg-danger" role="progressbar" style="width: 100%" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100"></div>
                </div>

                <div class="card-sub">
                    <span>14일 남음</span>
                    <span><b>3.000.000원</b></span>
                    <span>225%</span>
                </div>  
            </div>
        </div>
      </div>



      <div class="card-deck">
        <div class="card">
            <img class="card-img-top" src="img/de1.png" alt="데카당 정규앨범">
            <div class="card-body">
                <h6 class="card-title"><b>데카당 첫 정규앨범</b></h4>
                <a>데카당</a>

                <div class="progress" >
                    <div class="progress-bar bg-danger" role="progressbar" style="width: 100%" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100"></div>
                </div>

                <div class="card-sub">
                    <span>14일 남음</span>
                    <span><b>3.000.000원</b></span>
                    <span>225%</span>
                </div>  
            </div>
        </div>
        
        <div class="card">
            <img class="card-img-top" src="img/de1.png" alt="데카당 정규앨범">
            <div class="card-body">
                <h6 class="card-title"><b>데카당 첫 정규앨범</b></h4>
                <a>데카당</a>

                <div class="progress" >
                    <div class="progress-bar bg-danger" role="progressbar" style="width: 100%" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100"></div>
                </div>

                <div class="card-sub">
                    <span>14일 남음</span>
                    <span><b>3.000.000원</b></span>
                    <span>225%</span>
                </div>  
            </div>
        </div>
            
        <div class="card">
            <img class="card-img-top" src="img/de1.png" alt="데카당 정규앨범">
            <div class="card-body">
                <h6 class="card-title"><b>데카당 첫 정규앨범</b></h4>
                <a>데카당</a>

                <div class="progress">
                    <div class="progress-bar bg-danger" role="progressbar" style="width: 100%" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100"></div>
                </div>

                <div class="card-sub">
                    <span>14일 남음</span>
                    <span><b>3.000.000원</b></span>
                    <span>225%</span>
                </div>  
            </div>
        </div>


        <div class="card">
            <img class="card-img-top" src="img/de1.png" alt="데카당 정규앨범">
            <div class="card-body">
                <h6 class="card-title"><b>데카당 첫 정규앨범</b></h4>
                <a>데카당</a>

                <div class="progress" >
                    <div class="progress-bar bg-danger" role="progressbar" style="width: 100%" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100"></div>
                </div>

                <div class="card-sub">
                    <span>14일 남음</span>
                    <span><b>3.000.000원</b></span>
                    <span>225%</span>
                </div>  
            </div>
        </div>
      </div>
      
      <div class="card-deck">
        <div class="card">
            <img class="card-img-top" src="img/de1.png" alt="데카당 정규앨범">
            <div class="card-body">
                <h6 class="card-title"><b>데카당 첫 정규앨범</b></h4>
                <a>데카당</a>

                <div class="progress" >
                    <div class="progress-bar bg-danger" role="progressbar" style="width: 100%" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100"></div>
                </div>

                <div class="card-sub">
                    <span>14일 남음</span>
                    <span><b>3.000.000원</b></span>
                    <span>225%</span>
                </div>  
            </div>
        </div>
        
        <div class="card">
            <img class="card-img-top" src="img/de1.png" alt="데카당 정규앨범">
            <div class="card-body">
                <h6 class="card-title"><b>데카당 첫 정규앨범</b></h4>
                <a>데카당</a>

                <div class="progress" >
                    <div class="progress-bar bg-danger" role="progressbar" style="width: 100%" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100"></div>
                </div>

                <div class="card-sub">
                    <span>14일 남음</span>
                    <span><b>3.000.000원</b></span>
                    <span>225%</span>
                </div>  
            </div>
        </div>
            
        <div class="card">
            <img class="card-img-top" src="img/de1.png" alt="데카당 정규앨범">
            <div class="card-body">
                <h6 class="card-title"><b>데카당 첫 정규앨범</b></h4>
                <a>데카당</a>

                <div class="progress">
                    <div class="progress-bar bg-danger" role="progressbar" style="width: 100%" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100"></div>
                </div>

                <div class="card-sub">
                    <span>14일 남음</span>
                    <span><b>3.000.000원</b></span>
                    <span>225%</span>
                </div>  
            </div>
        </div>


        <div class="card">
            <img class="card-img-top" src="img/de1.png" alt="데카당 정규앨범">
            <div class="card-body">
                <h6 class="card-title"><b>데카당 첫 정규앨범</b></h4>
                <a>데카당</a>

                <div class="progress" >
                    <div class="progress-bar bg-danger" role="progressbar" style="width: 100%" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100"></div>
                </div>

                <div class="card-sub">
                    <span>14일 남음</span>
                    <span><b>3.000.000원</b></span>
                    <span>225%</span>
                </div>  
            </div>
        </div>
    </div>

    

 </div> <!--content end -->

<footer>
    <div class="footer">
    <div class="row">
        <div class="col col-md-4 col-sm-12">
            <a herf="#"><p>창작자 가이드</p></a>
            <a herf="#"><p>이용약관</p></a>
            <a herf="#"><p>고객센터</p></a>
        </div>
        <div class="col col-md-4 col-sm-12">
                <a herf="#"><p>개인정보 보호정책</p></a>
                <a herf="#"><p>문의하기</p></a>
        </div>
        <div class="col col-md-4 col-sm-12">
        	<i class="fab fa-facebook-square"></i>
        	<i class="fab fa-instagram"></i>
        	<i class="fab fa-twitter-square"></i>
        	<i class="fas fa-share-alt-square"></i>
        	<a herf=""><p>© 2018 Artispic 2nc</p></a>
        </div>
    </div>
        <div class="address">
            <p>(04763) 서울시 성동구 살곶이길 200(사근동) / TEL. 010-7551-1890</p>
        </div>
    </div>   
</footer>

</div><!--main end -->





<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>

</body>
</html>