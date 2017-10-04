$(document).ready(function() {
	switch(menu) {
	case "Home":
		$("#home_link").addClass("active");
		break;
	case "About Us":
		$("#about_link").addClass("active");
		break;
	case "Contact Us":
		$("#contact_link").addClass("active");
		break;
	default:
		$("#list_link").addClass("active");
		$("#a_"+menu).addClass("active");
	}
});

var $table = $('#productListTable');
if($table.length) {
	var jsonUrl = '';
	if(window.categoryId == '') {
		jsonUrl += window.contextRoot + '/json/data/all/products';
	} else {
		jsonUrl += window.contextRoot + '/json/data/category/' + window.categoryId + '/products';
	}
	
	$table.DataTable({
		lengthMenu: [[3,5,10,-1], ['3 Records', '5 Records', '10 Records', 'ALL']],
		pageLength: 5,
		ajax: {
			url: jsonUrl,
			dataSrc: ''
		},
		columns: [	
			{data:'code',
				mRender: function(data,type,row) {
					return '<img class="dataTableImg" src="'+window.contextRoot+'/resources/images/'+data+'.jpg"/>';
				}},
			{data:'name'},
			{data:'brand'},
			{data:'unitPrice',
				mRender: function(data,type,row){
					return '$  ' + data;
				}},
			{data:'quantity',
					mRender: function(data,type,row){
						if (data == 0) {
							return '<span class="text-danger">Out of Stock!</span>'
						} 
						return data
					}},
			{data:'id',
				bSortable: false,
				mRender: function(data,type,row){
					var str = '';
					str += '<a class="btn btn-sm btn-outline-primary" href="'+window.contextRoot+'/show/'+data+'/product">View</a> &#160;';
					if (row.quantity >= 1)
						str += '<a class="btn btn-sm btn-outline-success" href="'+window.contextRoot+'/cart/add/'+data+'/product">Add to Cart</a>';
					else
						str += '<a class="btn btn-sm btn-outline-success disabled" href="javascript:void(0)">Add to Cart</a>';
					return str;
				}}
		]
	})
}