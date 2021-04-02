<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<head>
<link rel="stylesheet" href="css/mypage.css">
</head>
<jsp:include page="header.jsp"></jsp:include>

<div class="main">
<div class="content">
<h5 class="font-weight-bold">마이페이지</h5>

<table>
    <tr>
        <th style="width:33.33%;border-top:none;">
        <a href="artispick?cmd=getUser&id=<%=session.getAttribute("id")%>" style="text-decoration:none; color:black;">내정보수정</a></th>
        <th style="width:33.33%;border-top:none;">
        <a href="artispick?cmd=getsponsorList&id=<%=session.getAttribute("id")%>" style="text-decoration:none; color:black;">내후원내역</a></th>
        <th style="width:33.33%;border-top:none;">
        <a href="artispick?cmd=getQnaList&id=<%=session.getAttribute("id")%>" style="text-decoration:none; color:black;">내문의/메시지함
        </a></th>
    </tr>
    <tr> 
        <th><a href="artispick?cmd=pjlistAction&id=<%=session.getAttribute("id")%>" style="text-decoration:none; color:black;">내프로젝트</a></th>
        <th id="name">ARTISPICK</th>
        <th><a href="artispick?cmd=shopcart&id=<%=session.getAttribute("id")%>" style="text-decoration:none; color:black;">장바구니</a></th>
    </tr>
    <tr>
        <th><a href="artispick?cmd=shoporderSelect&id=<%=session.getAttribute("id")%>" style="text-decoration:none; color:black;">내주문내역</a></th>
        <th></th>
        <th data-toggle="modal" data-target="#exampleModalCenter">탈퇴하기</th>
    <!-- Modal -->
    <div class="modal fade" id="exampleModalCenter" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered" role="document">
    <div class="modal-content">
    <div class="modal-header">
        <h5 class="modal-title" id="exampleModalCenterTitle" style="font-weight:bold">탈퇴하기</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
        <span aria-hidden="true">&times;</span>
        </button>
    </div>
    <div class="modal-body" style="font-size:15px">
        탈퇴하기를 누르면 모든 정보가 사라집니다. <br>
        그래도 탈퇴하시겠습니까?
    </div>
    <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">닫기</button>
        <button type="button" class="btn btn-danger">탈퇴하기</button>
    </div>
    </div>
    </div>
    </div>
    </tr>
</table>


</div> <!--content end -->
<jsp:include page="footer.jsp"></jsp:include>

</div><!--main end -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>



</body>
</html>
