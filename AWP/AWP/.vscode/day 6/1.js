var likeCounter=1;
function commentHere(){

    let user = document.querySelector('#inputid').value; 
    let newElement= document.createElement('div');
    newElement.style.display="flex";
    newElement.style.justifyContent="space-between";
    newElement.style.marginBottom = "8px";

    let child= document.createElement('div');
    child.textContent= user;

    let child2 = document.createElement('button');
    child2.textContent= "delete";

    newElement.appendChild(child);
    newElement.appendChild(child2);

    let commentBox=document.querySelector('#commentBox');

    commentBox.insertBefore(newElement,commentBox.firstChild);

    document.querySelector('#inputid').value="";


}

function likeHere() {
    likeCounter++;
  
    let btnElement = document.querySelector("#likeid");
    btnElement.innerHTML = "Like " + likeCounter;
  }