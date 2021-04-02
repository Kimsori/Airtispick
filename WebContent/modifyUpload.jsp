<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
  <title>마이페이지_내정보수정</title>

<body>
<jsp:include page="header.jsp"></jsp:include>

    <!--###################################################################################-->

<div class="main">
  <div class="content">
        <div class="tab-content" id="pjstory-tabcontent">
        <div class="tab-pane fade show active" id="pjstory" role="tabpanel">
            <h5 class="font-weight-bold">
			<a href="artispick?cmd=mypage" style="text-decoration:none; color:black;">
			<i class="fas fa-angle-left" style="padding-right: 5px"></i>
			마이페이지</a></h5>
            <ul class="nav nav-pills mb-1" id="pills-tab" role="tablist">
                <li class="nav-item">
                    <a  style="background-color: #db312e;"  class="nav-link active" id="pjstory-tab" data-toggle="pill" href="#pjstory" role="tab" aria-controls="pjstory" aria-selected="true">내 정보수정</a>
                </li>
            </ul>

<form action="artispick?cmd=updateGetUser&id=<%=session.getAttribute("id")%>" method="post">
            <div class="container-fluid">
                       <div class="row">
                           <div class="col photo3">

                               <div class="form-group row">
                                   <label class="col-sm-2 col-form-label">닉네임</label>
                                   <div class="col-sm-4">
                                   <input type="text" class="form-control" name="userName" required="required">
                                   </div>
                               </div>

                               <div class="form-group row">
                                 <label class="col-sm-2 col-form-label">비밀번호</label>
                                 <div class="col-sm-4">
                                  <input type="password" class="form-control" name="passwd" required="required">
                                </div>
                              </div>

                              <div class="form-group row">
                                <label class="col-sm-2 col-form-label">이메일</label>
                                <div class="col-sm-4">
                                 <input type="email" class="form-control" name="email" required="required">
                               </div>
                             </div>
                             
                             <div class="form-group row">
                               <label class="col-sm-2 col-form-label">핸드폰번호</label>
                               <div class="col-sm-4">
                                 <input type="text" class="form-control" name="phone" required="required">
                           </div>
                       </div>
                   </div>
               </div>
</div>
</div>
</div>

                   <div class="container-fluid">
                       <div class="row">
                           <div class="col">
                               <div class="form-group row">
                                       <button type="submit" class="btn btn-dark two" action="">수정</button>
                               </div>
                           </div>
                       </div>
                    </div>
</form>



    <!--###################################################################################-->


 </div> <!--content end -->

<jsp:include page="footer.jsp"></jsp:include>

</div><!--main end -->



<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>



</body>
</html>
