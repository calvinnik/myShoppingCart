<div class="container">
	<div class="row">
		<!-- SideBar here -->
		<div class="col-md-3">
			<%@include file="./common/sideBar.jsp"%>
		</div>
		
		<!-- Showing the products here. -->
		<div class="col-md-9">
			<!-- Adding breadCrumbs -->
			<div class="row">
				<div class="col-md-12">
				
					<c:if test="${showAllTrue == true}">
						<ol class="breadcrumb">
							<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
							<li class="breadcrumb-item active">All Products</li>
						</ol>
					</c:if>
					
					<c:if test="${showCategoryTrue == true}">
						<ol class="breadcrumb">
							<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
							<li class="breadcrumb-item">Products</li>
							<li class="breadcrumb-item active">${category.name}</li>
						</ol>
					</c:if>		 
					 
				</div>
			</div>
		
		</div>
	</div>

</div>