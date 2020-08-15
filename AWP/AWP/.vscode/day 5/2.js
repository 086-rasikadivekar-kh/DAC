
var counter = 1;
var likecount = 1;
function commentHere(){
    let newElement = document.createElement('div');
    newElement.textContent= "comment" + counter;
    newElement.style.background="blue";
    newElement.style.color="white";
    newElement.style.margin = "4px";

    let commentBox = document.querySelector('#commentBox');
     commentBox.appendChild(newElement);
     counter++;

}


let likeHere = function() {
    likecount++;
    let temp=document.querySelector('#likeid');
    temp.innerHTML=" Like" + " " + likecount;

}