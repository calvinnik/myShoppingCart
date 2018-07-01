

<h1 class="my-4">Shop Name</h1>

<div class="list-group">

	<c:forEach items="${categories}" var="categories">
		<a href="#" class="list-group-item">${categories.name}</a>
	</c:forEach>
</div>