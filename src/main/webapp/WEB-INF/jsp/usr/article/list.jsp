<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="pageTitle" value="ARTICLE LIST"></c:set>
<%@ include file="../common/head.jspf"%>


<table class="w-full border border-gray-300">
	<thead class="bg-gray-100">
		<tr>
			<th class="text-center border px-4 py-2">ID</th>
			<th class="text-center border px-4 py-2">Registration Date</th>
			<th class="text-center border px-4 py-2">Title</th>
			<th class="text-center border px-4 py-2">Member ID</th>
			<th class="text-center border px-4 py-2">삭제</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="article" items="${articles}">
			<tr class="hover:bg-gray-50">
				<td class="text-center border px-4 py-2">${article.id}</td>
				<td class="text-center border px-4 py-2">${article.regDate.substring(0,10)}</td>
				<td class="text-center border px-4 py-2">
					<a href="detail?id=${article.id}" class="text-blue-600 hover:underline">${article.title}</a>
				</td>
				<td class="text-center border px-4 py-2">${article.memberId}</td>
				<td class="text-center border px-4 py-2">
    <button onclick="doDeleteArticle(${article.id})"
            class="text-red-600 hover:underline">
        삭제
    </button>
</td>

			</tr>
		</c:forEach>
	</tbody>
</table>




<%@ include file="../common/foot.jspf"%>