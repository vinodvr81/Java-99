var xhr;

function getEmployeeDetails(empno){
	xhr = new XMLHttpRequest();
	xhr.open("GET", "search?eno="+empno, true); //true - asynchronous communication
	xhr.onreadystatechange=stateChanged; //this function gets called wheneven XHR state change happens 
	xhr.send();
}

function stateChanged(){
 var ename = "NO MATCH";
 var esal = "NO MATCH";
 
 if(xhr.readyState==4 && xhr.status==200){
    var text = xhr.responseText;
    if(text.length > 0){
       var empObj = JSON.parse(text); //convert JSON string to JSON Object
       ename = empObj.empname;
       esal = empObj.empsal;
    }
    document.getElementById("emp_name").innerText = ename;
    document.getElementById("emp_sal").innerText = esal;
 }
}