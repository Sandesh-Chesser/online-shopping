<div id="container" class="container">
	<div class="row">
		<div class="col-md-3">
			<%@ include file="./fragments/sidebar.jsp" %>
		</div>
		<div class="col-md-9">
			<div class="row">
				<div class="col-md-12">
					<c:if test="${userClickAllProducts == true }">
						<script>
							window.categoryId = '';
						</script>
						<ol class="breadcrumb">
							<li class="breadcrumb-item"><a href="${root }/home">Home</a></li>
							<li class="breadcrumb-item">All Products</li>
						</ol>
					</c:if>
					<c:if test="${userClickCategoryProducts == true }">
						<script>
							window.categoryId = '${category.id}';
						</script>
						<ol class="breadcrumb">
							<li class="breadcrumb-item"><a href="${root }/home">Home</a></li>
							<li class="breadcrumb-item"><a href="${root }/show/all/products">All Products</a></li>
							<li class="breadcrumb-item">${category.name }</li>
						</ol>
					</c:if>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<table id="productListTable" class="table table-bordered table-striped">
						<thead>
							<tr>
								<th></th>
								<th>Name</th>
								<th>Brand</th>
								<th>Unit Price</th>
								<th>Quantity</th>
								<th></th>
							</tr>
						</thead>
					</table>
				</div>
			</div>
		</div>

	</div>
</div>