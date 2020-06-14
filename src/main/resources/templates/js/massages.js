
let condition=true;
function switchMenu(){
    if (condition){
        document.getElementById("create").style.backgroundColor="#f0932b";
        document.getElementById("container").style.display="none";
        document.getElementById("container1").style.display="flex";
        condition=false;
    }
    else{
        document.getElementById("create").style.background="none";
        document.getElementById("container").style.display="flex";
        document.getElementById("container1").style.display="none";
        condition=true;
    }
    
}

function add(){

}