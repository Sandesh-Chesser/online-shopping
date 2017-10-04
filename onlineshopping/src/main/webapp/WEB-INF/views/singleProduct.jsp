<div id="container" class="container">
	<div class="row">
		<div class="col-md-12">
			<ol class="breadcrumb">
				<li class="breadcrumb-item"><a href="${root }/home">Home</a></li>
				<li class="breadcrumb-item"><a href="${root }/show/all/products">Products</a></li>
				<li class="breadcrumb-item">${product.name }</li>
			</ol>
		</div>
	</div>
	
	<div class="row">
		<div class="col-md-4">
			<div class="thumbnail">
				<img width="100%" src="${images }/${product.code }.jpg" class="img-responsive img-thumbnail" />
			</div>
		</div>
		<div class="col-md-8">
			<h3>${product.name }</h3>
			<hr />
			<p>${product.description }</p>
			<hr />
			<h4>Price: <strong>$  ${product.unitPrice }</strong></h4>
			<hr />
			<c:choose>
				<c:when test="${product.quantity < 1 }">
					<h6>Quantity Available: <span  class="text-danger">Out of Stock!</span></h6>
				</c:when>
				<c:otherwise>
					<h6>Quantity Available: ${product.quantity }</h6>
				</c:otherwise>
			</c:choose>
			
			<c:choose>
				<c:when test="${product.quantity < 1 }">
					<a class="btn btn-md btn-success disabled" href="javascript:void(0)">Add to Cart</a>
				</c:when>
				<c:otherwise>
					<a class="btn btn-md btn-success" href="${root }/cart/add/${product.id }/product">Add to Cart</a>
				</c:otherwise>
			</c:choose>
			
			<a class="btn btn-md btn-primary" href="${root }/show/all/products">Products</a>
		</div>
	</div>
</div>