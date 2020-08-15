var likecount=1;

function commentHere(){
    let username = document.querySelector('#inputid').value; 
    let das = document.createElement('div');
    das.textContent = username;
    das.style.background="blue";
    das.style.color="white";
    das.style.margin="5px";
    let commentbox = document.querySelector('#commentBox');
    commentbox.insertBefore(das, commentbox.firstChild);
    document.querySelector('#inputid').value="";

}


function likeHere(){
likecount++;
let emp =document.querySelector('#likeid');
emp.innerHTML="Like" + likecount;
}