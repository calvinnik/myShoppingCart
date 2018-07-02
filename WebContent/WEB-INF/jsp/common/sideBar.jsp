

<h1 class="my-4">Categories</h1>

<div class="list-group">

	<c:forEach items="${categories}" var="categories">
		<a href="${contextRoot}/show/product/${categories.id}" class="list-group-item" id="cat_${categories.name}">${categories.name}</a>
	</c:forEach>
</div>