function inputlike(){
var user = document.getElementById('inputid').value;
var pass = document.getElementById('passid').value;

if(document.getElementById('inputid').value == ""){
    return;
}

if(document.getElementById('passid').value == ""){
    return;
}

let newElement = document.querySelector('#inputBox').cloneNode(true);
newElement.removeAttribute('id');
newElement.children[0].innerHTML = user;
newElement.children[1].innerHTML = pass;
newElement.style.visibility="visible";

let commentBox = document.querySelector("#commentBox");

commentBox.insertBefore(newElement,commentBox.firstChild);

document.getElementById('inputid').value="";
document.getElementById('passid').value="";


}



function submithere(btnElement){

    btnElement.parentElement.parentElement.nextElementSibling.children[0].remove();
}