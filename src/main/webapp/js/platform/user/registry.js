var registryUser = function(){
	var name = $("#name").val();
	var email = $("#email").val();
	var password = $("#password").val();
	var login_state;
	$.ajax({
		  method: "POST",
		  data: { "name": name, "email":email,  "password":password},
		  async:false,
		  url: "/Ssm/user/registry",
		  success: function(result){
			  login_state = result;
		  }
		  })
	confirm(login_state);
}

$(document).ready(function(){
	
});