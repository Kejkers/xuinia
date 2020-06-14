let condition=true;
function switchMenu(){
    if (condition){
        document.getElementById("login").style.display="none";
        document.getElementById("signup").style.display="block";
        condition=false;
    }
    else{
        document.getElementById("login").style.display="block";
        document.getElementById("signup").style.display="none";
        condition=true;
    }
    
}