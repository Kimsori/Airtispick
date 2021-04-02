<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<head>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css" 
integrity="sha384-lKuwvrZot6UHsBSfcMvOkWwlCMgc0TaWr+30HWe3a4ltaBwTZhyTEggF5tJv8tbt" crossorigin="anonymous">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
<link href="https://fonts.googleapis.com/css?family=Nanum+Gothic:400,800|Alegreya+Sans:900|Cinzel:900|Nanum+Myeongjo" rel="stylesheet">
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="css/pay.css">
</head>
<body>

<div class="main" style="width:100%;">
<form action="artispick?cmd=getselectsponssss&pj_num=${asdf.pj_num}&pj_goods_num=${asdf.pj_goods_num}&id=<%=session.getAttribute("id")%>" method="post">
<table>
    <tr class="top">
        <th style="border-top:none;" id="first">
        <i class="fas fa-chevron-left" style="margin-right:5px;cursor:pointer;"></i><a style="cursor:pointer;">이전으로</a><br><br>
        <h5>${asdf.pj_name}</h5><br><br>
        <a>選択した 商品</a><br>
        <a>${asdf.so_price}ウォン</a>
        <a>${asdf.so_amount}の 後援</a>
        </th>
    </tr>
    
    <tr>
        <th>
           <p>住所記入</p>
           <input type="text" class="form-control" name="postcode" placeholder="ここを 押して 住所を 選びなさい." readonly="readonly"><!--readonly는 선택? 된 상태?-->
           <input type="text" class="form-control" name="addr" placeholder="選択した アドレスが 自動的に 入力されます." readonly="readonly">               
        </th>
    </tr>
    <tr>
        <th>
            <p>残りの住所</p>
            <input type="text" name="addr1" class="form-control col-5" id="inputSuccess1" placeholder="ex)リンゴビラ 1004号">
            </div>
        </th>
    </tr>
    <tr>
        <th>
            <p>お受け方</p>
            <input type="text" name="name" class="form-control col-1" id="inputSuccess1" placeholder="ex)洪吉童">
        </th>
    </tr>
  
    <tr>
        <th>
            <button type="submit"  class="btn btn-danger btn-lg btn-block" style="background-color: #db312e;">후원하기</button>
        </th>
    </tr>
    
</table>
</form>
</div><!--main end -->



<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://ssl.daumcdn.net/dmaps/map_js_init/postcode.v2.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

<script>
    $('input[name="postcode"]').click(function(){
        sample4_execDaumPostcode();
    });

    function sample4_execDaumPostcode() {
        new daum.Postcode({
            oncomplete: function(data) {
                var fullRoadAddr = data.roadAddress; // 도로명 주소 변수
                var extraRoadAddr = ''; // 도로명 조합형 주소 변수

                if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                    extraRoadAddr += data.bname;
                }
                // 건물명이 있고, 공동주택일 경우 추가한다.
                if(data.buildingName !== '' && data.apartment === 'Y'){
                    extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                }
                // 도로명, 지번 조합형 주소가 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                if(extraRoadAddr !== ''){
                    extraRoadAddr = ' (' + extraRoadAddr + ')';
                }
                // 도로명, 지번 주소의 유무에 따라 해당 조합형 주소를 추가한다.
                if(fullRoadAddr !== ''){
                    fullRoadAddr += extraRoadAddr;
                }

                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                $('input[name="postcode"]').val(data.zonecode);
                //5자리 새우편번호 사용
                $('input[name="addr"]').val(fullRoadAddr);
            }
        }).open();
    }

   
</script>

</body>
</html>