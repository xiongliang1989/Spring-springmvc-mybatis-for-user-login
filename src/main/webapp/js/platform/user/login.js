var openMoment = function(){
	var moments_state;
	$.ajax({
		  method: "POST",
		  async:false,
		  url: "/Ssm/platform/moment/judgeOpenMoments",
		  success: function(result){
			  moments_state = result;
		  }
		  })
	
	if(moments_state == "true"){
		confirm("already add moment function!");		
	}else{
		addmomentFunction();
	}
	
}

var addmomentFunction  = function() {
	var moments_state;
	$.ajax({
		  method: "POST",
		  async:false,
		  url: "/Ssm/platform/moment/openMoments",
		  success: function(result){
			  moments_state = result;
		  }
		  })
	if(moments_state == "true"){
		$("#open_state_id").html("<h1>already open!</h1>");		
	}
}

var judgeOpenMoment = function(){
	var moments_state;
	$.ajax({
		  method: "POST",
		  async:false,
		  url: "/Ssm/platform/moment/judgeOpenMoments",
		  success: function(result){
			  moments_state = result;
		  }
		  })
	if(moments_state == "true"){
		$("#open_state_id").html("<h1>already open!</h1>");		
	}
}

var uploadAndShare = function(){
	var content = $("#contentId").val();
	if(content == ""){
		confirm("content can't be empty!");
	}else{
		var allContentList;
		$.ajax({
			  method: "POST",
			  async:false,
			  url: "/Ssm/platform/moment/content/uploadAndShare",
			  data: { "content": content },
			  success: function(result){
				  allContentList = eval('(' + result + ')'); ;
			  }
			  })
		var momentHtml = getMomentHtml(allContentList);
		$("#moments_id").html(momentHtml);
	}
	
}

var initShare = function(){
	var content = $("#contentId").val();
	var allContentList;
	$.ajax({
		  method: "POST",
		  async:false,
		  url: "/Ssm/platform/moment/content/initShare",
		  success: function(result){
			  allContentList = eval('(' + result + ')'); ;
		  }
		  })
	var momentHtml = getMomentHtml(allContentList);
	$("#moments_id").html(momentHtml);
}

var getMomentHtml = function(allContentList){
	var momentHtml = "";
	for(var i=0; i<allContentList.length; i++){
		momentHtml = momentHtml+ "<span>"+allContentList[i]["cdate"]+"</span>" + "<span>"+allContentList[i]["content_data"]+"</span>" +"<br>";
	}
	return momentHtml;
}

$(document).ready(function(){
	judgeOpenMoment();
	initShare();
});