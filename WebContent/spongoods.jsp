<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<head>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css" 
integrity="sha384-lKuwvrZot6UHsBSfcMvOkWwlCMgc0TaWr+30HWe3a4ltaBwTZhyTEggF5tJv8tbt" crossorigin="anonymous">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
<link href="https://fonts.googleapis.com/css?family=Nanum+Gothic:400,800|Alegreya+Sans:900|Cinzel:900|Nanum+Myeongjo" rel="stylesheet">


<link rel="stylesheet" href="css/pay.css">

</head>
<body>
<div class="main" style="width:100%;">
<table>
    <tr class="top">
        <th style="border-top:none;" id="first">
        <i class="fas fa-chevron-left" style="margin-right:5px;cursor:pointer;"></i>
        <a href=artispick?cmd=getDetailProject&pjNum=1 style="color:white; text-decoration:none; cursor:pointer;">이전으로</a><br><br>
        <h5>${detaill.pjName}</h5><br><br>
        </th>
    </tr>
    
    <c:forEach items="${spongoods}" var="ProjectDetailInVO">
    <form action="artispick?cmd=getsponsList&pj_num=${detaill.pjNum}&pj_goods_num=${ProjectDetailInVO.pj_goods_num}&id=<%=session.getAttribute("id")%>" method="post">
    
     
    <tr class="middle2">
        <th>
            <br><br>
			
            <a>${ProjectDetailInVO.goods_price}ウォン 後援の 方へ</a><br>

            <div class="form-group row">
                    <label for="example-number-input" class="col-1 col-form-label">水量選択</label>
                    <div class="col-1" style="padding-left:0px; margin-top: 5px;">
                      <input class="form-control" type="number" name="so_amount" value="1" id="example-number-input">
                    </div>
            </div>

            <ul>
                <li>${ProjectDetailInVO.goods_name}</li>
                <!-- <li>스티커묶음</li>
                <li>엽서묶음</li>-->
            </ul>    
            <div class="butt">
            <button type="submit" class="btn btn-danger" style="border-radius:50%;"><i class="fas fa-chevron-right"></i></button></div></div>
            <br><br><br><br>
        </th>
    </tr>
    </c:forEach>
    </form>
    
</table>
</div><!--main end -->

<script>

</script>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</body>
</html>