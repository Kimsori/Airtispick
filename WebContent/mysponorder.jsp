<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<head>
<link rel="stylesheet" href="css/mypage.css">
</head>
<jsp:include page="header.jsp"></jsp:include>

<div class="main">
<div class="content">
<h5 class="font-weight-bold">
<a href="mypage.jsp" style="text-decoration:none; color:black;">
<i class="fas fa-angle-left" style="padding-right: 5px"></i>
마이페이지</a></h5>

<ul class="nav nav-pills mb-3" id="pills-tab" role="tablist">
    <li class="nav-item">
        <a class="nav-link active" id="mypj-tab" data-toggle="pill" href="#mypj" role="tab" aria-controls="mypj" aria-selected="true">내 후원품 내역</a>
    </li>
    <li class="nav-item">
        <a class="nav-link" id="spon-tab" data-toggle="pill" href="#spon" role="tab" aria-controls="spon" aria-selected="false">내 프로젝트 후원 내역</a>
    </li>
  
    </ul>
    <div class="tab-content" id="mypj-tabcontent">
    <div class="tab-pane fade show active" id="mypj" role="tabpanel" aria-labelledby="pills-home-tab">
        <p style="font-size:15px; font-weight:bold;">총 ${spon.count}개의 후원품 구매 내역이 있습니다.</p>

        <div class="card-deck">
        <c:forEach items="${list}" var="MypageVO">
        <div class="col-4" style=margin-bottom:2rem>
            <div class="card">
            
                <img class="card-img-top" src="img/${MypageVO.image}" alt="데카당 정규앨범">
                <div class="card-body">
                    <h6 class="card-title"><b>${MypageVO.pj_name}</b></h4>
                    <a>${MypageVO.goods_name}</a></br>
                    <a>${MypageVO.spon_total}원을 후원하였습니다.</a>


                    <div class="card-sub">
                        <span>${MypageVO.order_date}</span>
                        <span><b>${MypageVO.status}</b></span>
                    </div>
                </div>
                </div>
            </div>
            
		</c:forEach>
           
          </div>

    </div>
    <div class="tab-pane fade" id="spon" role="tabpanel" aria-labelledby="spon-tab">
        <p style="font-size:15px; font-weight:bold;">총 ${sponn.count}개의 프로젝트 후원 내역이 있습니다.</p>

        <div class="card-deck">
        <c:forEach items="${listt}" var="MypageVO">
        <div class="col-4" style=margin-bottom:2rem>
            <div class="card">
            
                <img class="card-img-top" src="img/${MypageVO.image}" alt="데카당 정규앨범">
                <div class="card-body">
                    <h6 class="card-title"><b>${MypageVO.pj_name}</b></h4>
                    <a>${MypageVO.spon_price}원을 후원하였습니다.</a>


                    <div class="card-sub">
                        <span>${MypageVO.spon_date}</span>
                    </div>
                </div>
                </div>
            </div>
            
		</c:forEach>
           
          </div>

              </div>  <!--두번째탭 끝-->
    
    </div>
    
    
    
    

<div class="page">
    <nav aria-label="Page navigation example">
  <ul class="pagination justify-content-center">
    <li class="page-item">
      <a class="page-link" href="#" aria-label="Previous">
        <span aria-hidden="true">&laquo;</span>
        <span class="sr-only">Previous</span>
      </a>
    </li>
    <li class="page-item"><a class="page-link" href="#">1</a></li>
    <li class="page-item"><a class="page-link" href="#">2</a></li>
    <li class="page-item"><a class="page-link" href="#">3</a></li>
    <li class="page-item">
      <a class="page-link" href="#" aria-label="Next">
        <span aria-hidden="true">&raquo;</span>
        <span class="sr-only">Next</span>
      </a>
    </li>
  </ul>
</nav>
</div>

</div> <!--content end -->
<jsp:include page="footer.jsp"></jsp:include>

</div><!--main end -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>



</body>
</html>