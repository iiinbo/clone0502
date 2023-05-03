    <%--jsp 작성을 위해 아래 3줄은 기입.--%>
    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%--JSTL : 통화 날짜를 표현하게 해주는 문법--%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

    <style>
        #imgname{
            width: 200px;
            height: 250px;
        }
    </style>

    <!-- Begin Page Content -->
    <div class="container-fluid">

        <!-- Page Heading -->
        <h1 class="h3 mb-2 text-gray-800">Item Tables</h1>

        <!-- DataTales Example -->
        <div class="card shadow mb-4">
            <div class="card-header py-3">
                <h6 class="m-0 font-weight-bold text-primary">상품정보 상세조회</h6>
            </div>
            <div class="card-body">
                <div class="table-responsive">
                    <%-- 표(테이블)로 db에 담긴 사용자정보(list. 화면에서 뿌릴 땐  로 이름 지었다.) 출력하기   --%>
                    <%--  아래는, web05 버전  --%>
                    <div class="col-sm-12">
                        <div class ="container col-sm-12">

                            <h2>상품정보 상세보기</h2>

                            <form id="detail_form">

                                <div class="form-floating mt-3 mb-3">
                                    <label for="imgname">imgname</label>
                                    <img src="/uimg/${itemdetail.imgname}"class="form-control" id="imgname" name="imgname" value="${itemdetail.imgname}"/>
                                </div>
                                <div class="form-floating mt-3 mb-3">
                                    <label for="id">id</label>
                                    <input type="text" class="form-control" id="id" name="id" value="${itemdetail.id}"/>
                                </div>
                                <div class="form-floating mt-3 mb-3">
                                    <label for="name">name</label>
                                   <input type="text" class="form-control" id="name" name="name" value="${itemdetail.name}"/>
                                </div>
                                <div class="form-floating mb-3 mt-3">
                                    <label for="price">price</label>
                                    <input type="text" class="form-control" id="price"  name="price" value="${itemdetail.price}" />
                                    <%--   CustController 에서 db에 있는 회원 정보를 담겠다고 만든 이름 : itemdetail    --%>
                                </div>

                                <div class="form-floating mt-3 mb-3">
                                    <label for="rdate">rdate</label>
                                    <input type="text" class="form-control" id="rdate" name="rdate"  value="${itemdetail.rdate}"/>
                                </div>


                                <br>
                                <button type="button" class="btn btn-primary"  id="update_btn">수정하기</button>
                                <button type="button" class="btn btn-primary"  id="delete_btn">삭제하기</button>
                            </form>

                        </div>
                    </div><%--  복사끝   --%>
                </div>
            </div>
        </div>

    </div>