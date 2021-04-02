<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<jsp:include page="header.jsp"></jsp:include>

    <!--###################################################################################-->

<div class="main">
  <div class="content">

            <h5 class="font-weight-bold">
			<a href="mypage.jsp" style="text-decoration:none; color:black;">
			<i class="fas fa-angle-left" style="padding-right: 5px"></i>
			마이페이지</a></h5>

            <ul class="nav nav-pills mb-3" id="pills-tab" role="tablist">
                <li class="nav-item">
                    <a class="nav-link active" id="mypj-tab" data-toggle="pill" href="#mypj" role="tab" aria-controls="mypj" aria-selected="true">내 프로젝트</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" id="spon-tab" data-toggle="pill" href="#spon" role="tab" aria-controls="spon" aria-selected="false">내 후원정산</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" id="dividend-tab" data-toggle="pill" href="#dividend" role="tab" aria-controls="dividend" aria-selected="false">배당금 지급현황</a>
                </li>
            </ul>

            <div class="tab-content" id="mypj-tabcontent">
              <div class="tab-pane fade show active" id="mypj" role="tabpanel">

			<p style="font-size:15px; font-weight:bold;">총 ${sponn.count}개의 만든 프로젝트가 있습니다.</p>
            <div class="card-deck">
            <c:forEach items="${list}" var="ProjectVO">
            <c:if test="${ProjectVO.deadline>=0}">
            <div class="col-4" style=margin-bottom:2rem>
                <div class="card">
                <a href=artispick?cmd=getDetailProject&pjNum=${ProjectVO.pj_num}>
                    <img class="card-img-top" src="img/${ProjectVO.image}" alt="${ProjectVO.pj_name}">
                    <div class="card-body">
                        <b class="ctitle" style="padding-left:10px; color:black; font-size:13px;">${ProjectVO.pj_name}</b><br>
					<a>${ProjectVO.arti_name}</a>

                        <div class="progress" >
                            <div class="progress-bar bg-danger" role="progressbar" style="width: ${ProjectVO.target}%" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100"></div>
                        </div>

                        <div class="card-sub">
                            <span>${ProjectVO.deadline}일 남음</span>
                            <span><b>${ProjectVO.total}원</b></span>
                            <span>${ProjectVO.target}%</span>
                        </div>
                    </div>
                </div>
                </div>
                </c:if>
                <c:if test="${ProjectVO.deadline<0}">
                <div class="card" style="opacity: 0.5;">
                    <img class="card-img-top" src="img/${ProjectVO.image}" alt="${ProjectVO.pj_name}">
                    <div class="card-body">
                        <b class="ctitle" style="padding-left:10px; color:black; font-size:13px;">${ProjectVO.pj_name}</b><br>
					<a>${ProjectVO.arti_name}</a>

                        <div class="progress" >
                            <div class="progress-bar bg-danger" role="progressbar" style="width: ${ProjectVO.target}%" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100"></div>
                        </div>

                        <div class="card-sub">
                            <span>${ProjectVO.deadline}일 남음</span>
                            <span><b>${ProjectVO.total}원</b></span>
                            <span>${ProjectVO.target}%</span>
                        </div>
                    </div>
                </div>
                </c:if>
				</c:forEach>
                
              </div>
            </div>

              <div class="tab-pane fade" id="spon" role="tabpanel" aria-labelledby="spon-tab">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col first2">
                          <div class="form-group row">
                                <label class="col-sm-2 col-form-label">프로젝트명</label>
                                <div class="col-sm-2">
                                <input type="text" class="form-control" name="projectname"  required="required">
                                </div>

                                    <div class="col-sm-2">
                                        <select class="custom-select">
                                            <option value="">선택</option>
                                            <option value="1">달성액</option>
                                            <option value="2">총 배당금액</option>
                                            <option value="3">총 지급액</option>
                                        </select>
                                    </div>


                                    <div class="col-sm-2">
                                        <input type="text" class="form-control" placeholder="0원"  required="required">
                                    </div>
                                    <p>~</p>

                                    <div class="col-sm-2">
                                        <input type="text" class="form-control" placeholder="700,000원"  required="required">
                                    </div>
                            </div>

                            <div class="form-group row">
                                <label class="col-sm-2 col-form-label">정산예정일</label>
                                <div class="col-sm-4">
                                <input type="date" class="form-control" name="birth3" >
                                </div>
                                  <p>~</p>
                                  <div class="col-sm-4">
                                  <input type="date" class="form-control" name="birth4">
                                  </div>
                            </div>

                            <div class="form-group row">
                                <label class="col-sm-2 col-form-label">처리상태</label>
                                <div class="col-sm-2">
                                    <select class="custom-select">
                                        <option value="">선택</option>
                                        <option value="1">정산 전</option>
                                        <option value="2">정산진행중</option>
                                        <option value="3">정산완료</option>
                                    </select>
                                </div>
                            </div>

                        </div>
                    </div>
                </div>

              <input type="submit" name="ip-submit" id="ip-submit" class="btn btn-dark" value="조회">

              <table class="table table-striped">

                  <thead>
                    <tr>
                      <!-- <th scope="col">글번호</th> -->
                      <th scope="col">프로젝트명</th>
                      <th scope="col">달성액</th>
                      <th scope="col">총 배당금액</th>
                      <th scope="col">총지급액</th>
                      <th scope="col">정산예상일</th>
                      <th scope="col">처리상태</th>
                    </tr>
                  </thead>
                  
                  <c:forEach items="${shop}" var="ShopVO">
                  <tbody>
                    <tr>
                      <!-- <th scope="row">1</th> -->
                      <td><font color="black">${ShopVO.pj_name}</td>
                      <td>${ShopVO.total_price}</td>
                      <td>${ShopVO.achiev}</td>
                      <td>${ShopVO.totaldivi}</td>
                      <td>${ShopVO.dividate}</td>
                      <td>정산완료</td>
                    </tr>
                  </tbody>
				  </c:forEach>
                  
                </table>

              </div>  <!--두번째탭 끝-->

              <div class="tab-pane fade" id="dividend" role="tabpanel" aria-labelledby="dividend-tab">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col first2">
                          <div class="form-group row">
                                <label class="col-sm-2 col-form-label">프로젝트명</label>
                                <div class="col-sm-4">
                                <input type="text" class="form-control" name="projectname"  required="required">
                                </div>
                            </div>

                            <div class="form-group row">
                                <label class="col-sm-2 col-form-label">정산일자</label>
                                <div class="col-sm-4">
                                <input type="date" class="form-control" name="birth3" >
                                </div>
                                  <p>~</p>
                                  <div class="col-sm-4">
                                  <input type="date" class="form-control" name="birth4">
                                  </div>
                            </div>

                            <div class="form-group row">
                                <label class="col-sm-2 col-form-label">후원금액</label>
                                <div class="col-sm-2">
                                  <input type="text" class="form-control"  required="required">
                                </div>
                                <p>~</p>
                                <div class="col-sm-2">
                                  <input type="text" class="form-control"  required="required">
                                </div>
                            </div>

                            <div class="form-group row">
                                <label class="col-sm-2 col-form-label">배당금액</label>
                                <div class="col-sm-2">
                                  <input type="text" class="form-control"  required="required">
                                </div>
                                <p>~</p>
                                <div class="col-sm-2">
                                  <input type="text" class="form-control"  required="required">
                                </div>
                            </div>

                        </div>
                    </div>
                </div>

              <input type="submit" name="ip-submit" id="ip-submit" class="btn btn-dark" value="조회">

              <table class="table table-striped">

                  <thead>
                    <tr>
                      <!-- <th scope="col">번호</th> -->
                      <th scope="col">프로젝트명</th>
                      <th scope="col">후원자명</th>
                      <th scope="col">정산일자</th>
                      <th scope="col">후원금액</th>
                      <th scope="col">배당금액</th>
                    </tr>
                  </thead>
                  
                  <c:forEach items="${shop2}" var="ShopVO">
                  <tbody>
                    <tr>
                      <!-- <th scope="row">1</th> -->
                      <td><font color="black">${ShopVO.pj_name}</td>
                      <td>${ShopVO.id}</td>
                      <td>${ShopVO.dividatee}</td>
                      <td>${ShopVO.sponprice}</td>
                      <td>${ShopVO.totaldivie}</td>
                    </tr>
                  </tbody>
                  </c:forEach>

                  <tbody>
                    
                  </tbody>
                </table>
              </div>  <!--세번째탭 끝-->

</div><!--첫번째탭 끝-->



    <!--###################################################################################-->


 </div> <!--content end -->

<jsp:include page="footer.jsp"></jsp:include>

</div><!--main end -->



<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>



</body>
</html>
    