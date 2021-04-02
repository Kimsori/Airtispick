<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

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
                    <a class="nav-link active" id="mycart-tab" data-toggle="pill" href="#mycart" role="tab" aria-controls="mycart" aria-selected="true">장바구니</a>
                </li>

            </ul>

            <div class="tab-content" id="mycart-tabcontent">
              <div class="tab-pane fade show active" id="mycart" role="tabpanel">
                <p><b>프로젝트샵 장바구니</b></p>

                <table class="table table-striped">
                  <div class="hi">
                    <thead>
                      <tr>
                        <th scope="col"><label class="form-check-label2"><input class="form-check-input2" type="checkbox" name="tour" value="1"></th>
                        <th scope="col">주문상품</th>
                        <th scope="col">수량</th>
                        <th scope="col">금액</th>
                        <th scope="col">배송비</th>
		                    <th scope="col">합계</th>
                        <th scope="col">삭제</th>
                      </tr>

                    </thead>
                  </div>

                    <tbody>
                      <tr>
                        <th scope="col"><label class="form-check-label2"><input class="form-check-input2" type="checkbox" name="tour" value="1"></th>
                        <td><font color="black">상품</td>
                        <td>수량</td>
                        <td>금액</td>
                        <td>배송비</td>
		                    <td>합계</td>
                        <td></td>
                      </tr>
                    </tbody>

                    <tbody>
                      <tr>
               <th scope="col"><label class="form-check-label2"><input class="form-check-input2" type="checkbox" name="tour" value="1"></th>
                        <td><font color="black">상품</td>
                        <td>수량</td>
                        <td>금액</td>
                        <td>배송비</td>
		                    <td>합계</td>
                        <td></td>
                      </tr>
                    </tbody>
                  </table>
                  <p><b>선택한 상품을<button type="submit" id="checkbtn3" class="btn btn-outline-secondary">삭제하기</button>
                  <button type="submit" id="checkbtn4" class="btn btn-outline-secondary">주문하기</button></b>
                  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                  상품구매금액 20,000원 + 배송비 2500원 = 합계 22,500원</p>
            </div>
</div><!--첫번째탭 끝-->
<div class="container-fluid">
    <div class="row">
        <div class="col">
            <div class="form-group row">
                    <button type="submit" class="btn btn-dark three">전체상품주문</button>
            </div>
        </div>
    </div>
</div>



    <!--###################################################################################-->


 </div> <!--content end -->

<jsp:include page="footer.jsp"></jsp:include>

</div><!--main end -->



<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>

<script>

$()

</script>

</body>
</html>
