<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
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
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    
   
    

    <title>프로젝트 올리기</title>
    <style>
#p_scnt{
    padding:5px; border:1px solid #999; border-radius:4px; 
    -moz-border-radius:4px; -web-kit-border-radius:4px; -khtml-border-radius:4px; margin-left:5px; margin-right:10px;
}

.form1 p{
 padding-left: 15px;   
 color: rgb(85, 85, 85);
}

#p_scents i {
    color: black;
    cursor: pointer;
}

#p_scents{
    margin-top: 15px;
}

label ::placeholder{
    font-size: 12px;
    color: rgb(70, 69, 69)!important;
}
</style>

</head>
<body>
<jsp:include page="header.jsp"></jsp:include>

    <!--###################################################################################-->
    
<div class="main">

    

    <div class="content">

    <ul class="nav nav-pills mb-3" id="pills-tab" role="tablist">
        <li class="nav-item">
            <a class="nav-link active" id="pjstory-tab" data-toggle="pill" href="#pjstory" role="tab" aria-controls="pjstory" aria-selected="true">프로젝트 개요</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" id="sponegoods-tab" data-toggle="pill" href="#sponegoods" role="tab" aria-controls="sponegoods" aria-selected="false">펀딩 및 선물구성</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" id="account-tab" data-toggle="pill" href="#account" role="tab" aria-controls="account" aria-selected="false">계좌 설정</a>
        </li>
    </ul>
    <form action="artispick?cmd=postAction&id=<%=session.getAttribute("id")%>" method="post" enctype = "multipart/form-data">
        <div class="tab-content" id="pjstory-tabcontent">
        <div class="tab-pane fade show active" id="pjstory" role="tabpanel">
            <h4 class="guess">프로젝트 개요 </h4>

            <div class = "form1">
                <h5 id="title1">프로젝트 제목</h5>
                <input class="form-control form-control-lg form2" type="text" name="pj_name" placeholder="프로젝트 제목을 입력해 주세요" maxlength="30">
            </div>

            <div class = "form1">
                <h5 id="title1">프로젝트 대표이미지</h5>
                <form method="post">
                    <div class="form-group file1">
                        <input type="file" class="form-control-file" name="image" id="exampleFormControlFile1" />
                    </div>
                </form>
            </div>

            <div class = "form1">
                    <h5 id="title1">프로젝트 분야</h5>
                    <div class="col-sm-6">
                    <div class="form-check form-check-inline">
                        <input class="form-check-input" type="radio" name="field_num" value=1 checked><label class="form-check-label">발라드</label>
                    </div>
                    <div class="form-check form-check-inline">
                            <input class="form-check-input" type="radio" name="field_num" value=2 ><label class="form-check-label">댄스</label>
                    </div>
                    <div class="form-check form-check-inline">
                            <input class="form-check-input" type="radio" name="field_num" value=3 ><label class="form-check-label">포크/블루스</label>
                    </div>
                    <div class="form-check form-check-inline">
                            <input class="form-check-input" type="radio" name="field_num" value=4 ><label class="form-check-label">인디음악</label>
                    </div>
                    <div class="form-check form-check-inline">
                            <input class="form-check-input" type="radio" name="field_num" value=5 ><label class="form-check-label">랩/힙합</label>
                    </div>
                    <div class="form-check form-check-inline">
                            <input class="form-check-input" type="radio" name="field_num" value=6 ><label class="form-check-label">락/메탈</label>
                    </div>
                    <div class="form-check form-check-inline">
                            <input class="form-check-input" type="radio" name="field_num" value=7 ><label class="form-check-label">R&B/Soul</label>
                    </div>
                    <div class="form-check form-check-inline">
                            <input class="form-check-input" type="radio" name="field_num" value=8 ><label class="form-check-label">재즈</label>
                    </div>
                    <div class="form-check form-check-inline">
                            <input class="form-check-input" type="radio" name="field_num" value=9 ><label class="form-check-label">뉴에이지</label>
                    </div>
                    </div>
                </div>

                <div class = "form1">
                    <h5 id="title1">프로젝트 스토리</h5>
                    <div class="form-group form2">
                        <textarea class="form-control form3" name="pj_story" id="story" rows="8" placeholder="프로젝트 스토리를 입력해주세요"></textarea>
                    </div>
                </div>

                <a href="" role="button" class="btn btn-secondary button3"> < 이전 </a>

                <a href="#sponegoods-tab" role="button" class="btn btn-danger button1">다음 > </a>
        </div>

        <div class="tab-pane fade" id="sponegoods" role="tabpanel" aria-labelledby="sponegoods-tab">

        <h4 class="guess">펀딩 목표 설정</h4>

            <div class = "form1">
                <h5 id="title1">목표 금액</h5>
                <input class="form-control form-control-lg form2" name="target" type="number" placeholder="목표 금액을 입력해주세요" maxlength="9">
            </div>

            <!-- <div class = "form1">
                <h5 id="title1">프로젝트 마감일</h5>
                <input type="date" class="form-control form2" name="deadline" placeholder="클릭하여 마감일을 입력하세요.">
            </div> -->

            <!--  <h4 class="guess">예상 정산일</h4>

            <div class = "form1">
                <h5 id="title1">예상 정산일</h5>
                <input type="date" class="form-control form2" name="birth2" placeholder="클릭하여 생년월일을 입력하세요.">
            </div>-->
            
            <!--<div class = "form1">
                <h5 id="title1">배송 예정일</h5>
                <input type="date" class="form-control form2" name="sche_date" placeholder="클릭하여 배송 예정일을 입력하세요.">
            </div>  -->
            
            
            <h4 class="guess">후원품구성</h4>

			<div class = "form1">
			    <h5 id="title1">후원금액 및 구성</h5>
			    
			    <div id="p_scents">
			        <p>
			            <label for="p_scnts">후원금액<input type="text" name="goods_price" id="p_scnt" size="20" value="" placeholder="후원금액을 입력해주세요"/></label>
			            <label for="p_scnts">상품구성<input type="text" name="goods_name" id="p_scnt" size="20" value="" placeholder="구성 품목을 입력해주세요"/></label>
			            <label for="p_scnts">재고량<input type="text" name="store" id="p_scnt" size="20"  value="" placeholder="재고량 입력해주세요"/></label>
			            <i id="addScnt" class="fas fa-plus"></i>
			        </p>
			    </div>
			    
			</div>

            <h4 class="guess">정책 설정</h4>

            <div class = "form1">
                <h5 id="title1">환불 및 교환정책</h5>
                <div class="form-group form2">
                    <textarea class="form-control form3" name="refund" id="story" rows="8" placeholder="환불 및 교환 정책을 입력해주세요"></textarea>
                </div>
            </div>
            
            

            <a href="#pjstory-tab" role="button" class="btn btn-secondary button2"> < 이전 </a>

            <a href="#account-tab" role="button" class="btn btn-danger button1">다음 > </a>

        </div>
        <div class="tab-pane fade" id="account" role="tabpanel" aria-labelledby="account-tab">

            <h4 class="guess">입금 계좌</h4>

            <div class = "form1">
                <h5 id="title1">계좌 은행</h5>
                <input class="form-control form-control-lg form2" name="bank" type="text" placeholder="후원금을 수령할 은행 계좌를 등록해주세요" maxlength="30">
            </div>
            
            <div class = "form1">
                <h5 id="title1">계좌번호</h5>
                <input class="form-control form-control-lg form2" name="account" type="number" placeholder="후원금을 수령할 은행 계좌를 등록해주세요" maxlength="255">
            </div>
            
            <div class = "form1">
                <h5 id="title1">이름</h5>
                <input class="form-control form-control-lg form2" name="account_name" type="text" placeholder="이름을 입력해 주세요" maxlength="30">
            </div>

            

            <a href="#sponegoods-tab" role="button" class="btn btn-secondary button2"> < 이전 </a>
           
            <button type="submit" class="btn btn-danger button1">제출 </a>

        </div>
        </div>
</form>

    


    <!--###################################################################################-->
    

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
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7/jquery.min.js"></script>
<script>



$.noConflict();
var J = jQuery;

J(document).ready(function(){

var scntDiv = J('#p_scents');
var i = J('#p_scents p').size() + 1;

J(document).on('click','#addScnt' ,function()  {
    J('<p><label for="p_scnts">후원금액<input type="number" name="goods_price" id="p_scnt" size="20" value=""/></label> <label for="p_scnts">상품구성<input type="text" name="goods_name" id="p_scnt" size="20" value=""/></label> <label for="p_scnts">재고량<input type="number" name="store" id="p_scnt" size="20" value=""/></label> <a href="#" id="remScnt"><i class="fas fa-minus"></i></a></p>').appendTo(scntDiv);
    i++;
    return false;
});

J(document).on('click','#remScnt' ,function() {
    if( i > 2 ) {
            J(this).parents('p').remove();
            i--;
    }
    return false;
});
});

</script>

</body>
</html>