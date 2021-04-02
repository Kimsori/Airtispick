<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<jsp:include page="header.jsp"></jsp:include>
<title>프로젝트 둘러보기</title>

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

    <div class="select">
        <select>
           <option value="max">최다구매순</option>
           <option value="popular">인기순</option>
           <option value="end">재고마감임박순</option>
        </select>
    </div>
    
<div class="card-deck"  style="width:1280px;">
	<c:forEach items="${list}" var="ShopVO">
	<div class="col-4" style=margin-bottom:2rem>
		<div class="card">
			<a href=artispick?cmd=shopdetailSelect&shop_num=${ShopVO.shop_num}>
			<img class="card-img-top" src="img/${ShopVO.image}"
				alt="${ShopVO.album_name}">
			<div class="card-body">
				<h6 class="card-title"></h6>
					<b class="ctitle" style="padding-left:10px; color:black; font-size:13px;">${ShopVO.album_name}</a></b><br>

					<div class="card-sub">
						<span>${ShopVO.album_price}원</span> <span><b>수량: ${ShopVO.store}장</b></span>
					</div>
			</div>
		</div>
	</div> <br>
	</c:forEach>
</div>

        


    

 </div> <!--content end -->

<jsp:include page="footer.jsp"></jsp:include>

</div><!--main end -->





<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>

</body>
</html>