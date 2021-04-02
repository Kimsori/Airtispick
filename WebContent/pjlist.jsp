<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<style>
.sel {margin-bottom: 10rem!important; margin-top:-1rem!important;}
.sel ul{list-style:none; padding-left: 0px;}
.sel li{float:left; padding-right: 10px;}
.sel li a{ color: rgb(70, 69, 69); font-size:14px;}
.sel a{font-family:'Lato'}
.sel li a:hover{text-decoration:none;}

</style>
<jsp:include page="header.jsp"></jsp:include>
<title>프로젝트 둘러보기</title>

<div class="main">
<div class="content">

    <div class="field">
        <div class="box">
        <i class="fa fa-search"></i> Tags: <span><a>#발라드</a></span>
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
 
<div class="sel">
<ul>
<li><a href="artispick?cmd=pjlist">최신순</a></li>
<li><a>|</a></li>
<li><a href="artispick?cmd=maxspon">최다후원순</a></li>
<li><a>|</a></li>
<li><a href="artispick?cmd=popList">인기순</a></li>
<li><a>|</a></li>
<li><a href="artispick?cmd=endList">마감임박순</a></li>
</ul>
<a class="float-right">total ${count} projects</a>
 </div>

<div class="card-deck" style="width:1280px;">
	<c:forEach items="${list}" var="ProjectVO">
	<div class="col-4" style=margin-bottom:2rem>
		<div class="card">
			<a href=artispick?cmd=getDetailProject&pjNum=${ProjectVO.pj_num}>
			<img class="card-img-top" src="img/${ProjectVO.image}"
				alt="${ProjectVO.pj_name}">
			<div class="card-body">
				<h6 class="card-title"></h6>
					<b class="ctitle" style="padding-left:10px; color:black; font-size:13px;">${ProjectVO.pj_name}</b><br>
					<a>${ProjectVO.arti_name}</a>

					<div class="progress">
						<div class="progress-bar bg-danger" role="progressbar"
							style="width: ${ProjectVO.target}%" aria-valuenow="100"
							aria-valuemin="0" aria-valuemax="100"></div>
					</div>

					<div class="card-sub">
						<span>${ProjectVO.deadline}일 남음</span> <span><b>${ProjectVO.total}원</b></span>
						<span>${ProjectVO.target}%</span>
					</div>
			</div>
		</div>
	</div> <br>
	</c:forEach>
</div>


     <nav aria-label="Page navigation example">
  <ul class="pagination justify-content-center">
    <li class="page-item">
    <c:if test="${currentPage != 1}">
      <a class="page-link" href="artispick?cmd=pjlist&page=${currentPage - 1}" aria-label="Previous">
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
    <li class="page-item"><a style= "color:rgb(70, 69, 69);" class="page-link" href="artispick?cmd=pjlist&page=${i}">${i}</a></li>
    </c:otherwise>
                </c:choose>
            </c:forEach>
    <li class="page-item">
    <c:if test="${currentPage le noOfPages}">
      <a class="page-link" href="artispick?cmd=pjlist&page=${currentPage + 1}" aria-label="Next">
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