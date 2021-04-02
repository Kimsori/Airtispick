<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<head>
<link rel="stylesheet" href="css/mypage.css">
</head>
<jsp:include page="header.jsp"></jsp:include>

<div class="main">
<div class="content">
<h5 class="font-weight-bold">알아보기</h5>

<div class="accordion" id="accordionExample">
    <div class="card">
      <div class="card-header" id="headingOne">
        <h5 class="mb-0">
          <button class="btn btn-link" type="button" data-toggle="collapse" data-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
            <i class="fas fa-quote-left"></i><a>목표금액설정</a><i class="fas fa-quote-right"></i>
          </button>
        </h5>
      </div>

      <div id="collapseOne" class="collapse show" aria-labelledby="headingOne" data-parent="#accordionExample">
        <div class="card-body">
평균적으로 모금액의 약 40%가 창작자의 주변에서 모입니다. 예를 들어 창작자의 지인이나 팬층에서 약 400만원 정도 모금이 예상된다면 목표 금액 1,000만원은 도전해 볼 만한 금액입니다.
        </div>
      </div>
    </div>
    <div class="card">
      <div class="card-header" id="headingTwo">
        <h5 class="mb-0">
          <button class="btn btn-link collapsed" type="button" data-toggle="collapse" data-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
            <i class="fas fa-quote-left"></i><a>모금기간설정</a><i class="fas fa-quote-right"></i>
          </button>
        </h5>
      </div>
      <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionExample">
        <div class="card-body">
          성공한 프로젝트의 평균적인 모금 기간은 32일입니다.    기간을 타이트하게 잡으면 '시간이 얼마 남지 않았으니 빨리 후원해야지' 하는 긴장감이 형성되어 성공률을 높이는데 도움이 됩니다.
        </div>
      </div>
    </div>
    <div class="card">
      <div class="card-header" id="headingThree">
        <h5 class="mb-0">
          <button class="btn btn-link collapsed" type="button" data-toggle="collapse" data-target="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
            <i class="fas fa-quote-left"></i><a>제목만들기</a><i class="fas fa-quote-right"></i>
          </button>
        </h5>
      </div>
      <div id="collapseThree" class="collapse" aria-labelledby="headingThree" data-parent="#accordionExample">
        <div class="card-body">
            제목은 무엇을 만드는지가 분명하게 드러나도록 쓰는 것이 중요합니다.SNS를 통해 퍼져나갈 때를 고려하여 가급적이면 짧은 제목이 좋답니다.
        </div>
      </div>
    </div>
    <div class="card">
        <div class="card-header" id="headingFour">
          <h5 class="mb-0">
            <button class="btn btn-link collapsed" type="button" data-toggle="collapse" data-target="#collapseFour" aria-expanded="false" aria-controls="collapseFour">
                <i class="fas fa-quote-left"></i><a>선물구성</a><i class="fas fa-quote-right"></i>
            </button>
          </h5>
        </div>
        <div id="collapseFour" class="collapse" aria-labelledby="headingFour" data-parent="#accordionExample">
          <div class="card-body">
            미지의 후원자를 상정하면 무슨 선물을 드려야 할지 막막합니다. 친구들이나 팬들이 어떤 선물을 좋아할지 생각해 보세요. 크라우드 펀딩은 창작자의 네트워크에서 시작되기 때문에 주변 사람들이 재미나 감동을 느낄 요소를 만드는 것이 중요합니다
          </div>
        </div>
      </div>
      <div class="card">
        <div class="card-header" id="headingFive">
          <h5 class="mb-0">
            <button class="btn btn-link collapsed" type="button" data-toggle="collapse" data-target="#collapseFive" aria-expanded="false" aria-controls="collapseFive">
                <i class="fas fa-quote-left"></i><a>스토리작성</a><i class="fas fa-quote-right"></i>
            </button>
          </h5>
        </div>
        <div id="collapseFive" class="collapse" aria-labelledby="headingFive" data-parent="#accordionExample">
          <div class="card-body">
           아래 4가지 항목에 맞는 내용들을 후원자에게 소개해봅시다!<br>
 - 무엇을 만드는지 먼저 소개<br>  - 창작자 소개<br>                           - 프로젝트 시작하게 된 계기 <br>- 이미지를 적극적으로 활용하기
          </div>
        </div>
      </div>
      <div class="card">
        <div class="card-header" id="headingSix">
          <h5 class="mb-0">
            <button class="btn btn-link collapsed" type="button" data-toggle="collapse" data-target="#collapseSix" aria-expanded="false" aria-controls="collapseSix">
                <i class="fas fa-quote-left"></i><a>신뢰성 높이기</a><i class="fas fa-quote-right"></i>
            </button>
          </h5>
        </div>
        <div id="collapseSix" class="collapse" aria-labelledby="headingSix" data-parent="#accordionExample">
          <div class="card-body">
           후원자에게 신뢰감을 줄 수 있는 방법들을 소개합니다.   <br>
 -창작자의 얼굴사진을 사용하세요 <br>                                       - 프로젝트 소개영상을 만들어 보세요 <br>                                  - 구체적인 교환/환불정책을 생각해 보세요.
          </div>
        </div>
      </div>
      <div class="card">
        <div class="card-header" id="headingSeven">
          <h5 class="mb-0">
            <button class="btn btn-link collapsed" type="button" data-toggle="collapse" data-target="#collapseSeven" aria-expanded="false" aria-controls="collapseSeven">
                <i class="fas fa-quote-left"></i><a>프로젝트알리기</a><i class="fas fa-quote-right"></i>
            </button>
          </h5>
        </div>
        <div id="collapseSeven" class="collapse" aria-labelledby="headingSeven" data-parent="#accordionExample">
          <div class="card-body">
            - 주변에 가장 먼저 런칭소식    을 전하기 <br>                                - sns활용하기  <br>                       - 뒷심끌어올리기
          </div>
        </div>
      </div>
      <div class="card">
        <div class="card-header" id="headingEight">
          <h5 class="mb-0">
            <button class="btn btn-link collapsed" type="button" data-toggle="collapse" data-target="#collapseEight" aria-expanded="false" aria-controls="collapseEight">
                <i class="fas fa-quote-left"></i><a>배당금보상받기</a><i class="fas fa-quote-right"></i>
            </button>
          </h5>
        </div>
        <div id="collapseEight" class="collapse" aria-labelledby="headingEight" data-parent="#accordionExample">
          <div class="card-body">
           성공한 프로젝트의 수익금 일부를 후원자들에게 배당해줍니다.  후원이 완료된 후 앨범 판매가 시작 되면, 3개월마다 앨범판매가 완료될 때까지 앨범 수익금 일부가 후원자들에게 차등지급됩니다. (후원해준 금액에 따라 나눠지는 수익률이 달라집니다.)
           
          </div>
        </div>
      </div>
  </div>

</div> <!--content end -->
<jsp:include page="footer.jsp"></jsp:include>

</div><!--main end -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>



</body>
</html>
