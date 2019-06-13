
function validationForm(){
	var x= document.getElementById("year");
	var y= document.getElementById("season");
	var z= document.getElementById("title");

	//var x=form["year"].value;
	//var y=form[form1]["season"].value;
	//var z=form[form1]["title"].value;
	if(x=""){
		alert("enter year");
		return false;
	}
	if(y="UNKNOWN"){
		alert("enter season");
		return false;
	}
	if(z=""){
		alert("enter title");
		return false;
	}
}

