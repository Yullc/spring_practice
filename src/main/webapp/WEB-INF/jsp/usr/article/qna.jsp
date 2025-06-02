<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ include file="../common/head.jspf"%>
<body class="p-4">

<div class="flex flex-col items-center">


  <h3 class="text-2xl font-bold mb-6 text-center">질문하기</h3>


  <form action="/usr/article/qna" method="post" class="w-full max-w-md">
    <div class="flex justify-center mb-6">
      <label class="input input-bordered input-sm flex items-center gap-2 w-full">
        <input type="text" placeholder="QnaSearch" name="searchKeyword"
               value="${searchKeyword}" class="bg-white flex-grow" />
        <button type="submit" class="btn btn-sm">
          <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16" fill="currentColor" class="h-4 w-4 opacity-70">
            <path fill-rule="evenodd"
                  d="M9.965 11.026a5 5 0 1 1 1.06-1.06l2.755 2.754a.75.75 0 1 1-1.06 1.06l-2.755-2.754ZM10.5 7a3.5 3.5 0 1 1-7 0 3.5 3.5 0 0 1 7 0Z"
                  clip-rule="evenodd" />
          </svg>
        </button>
      </label>
    </div>
  </form>

</div>
</body>

<div>
  <c:if test="${not empty searchKeyword}">
    <c:if test="${empty articles}">
      <p class="text-gray-500">검색 결과가 없습니다.</p>
    </c:if>

    <c:forEach var="article" items="${articles}" varStatus="loop">
      <div class="border p-3 mb-2 rounded shadow cursor-pointer" onclick="showBody(${loop.index})">
        <h4 class="text-md font-semibold text-white">Q...${article.title}</h4>
        <div id="body-${loop.index}" class="hidden text-sm text-white mt-2">
          A...${article.body}
        </div>
      </div>
    </c:forEach>
  </c:if>
</div>

<script>
  function showBody(index) {
    var body = document.getElementById('body-' + index);
    body.classList.toggle('hidden');
  }
</script>
</body>
