var likeCounter = 1;

function commentHere() {
  let userComment = document.querySelector("#inputId1").value; // we are not using innerHTML wy bcz this is a form element

  
  let newElement = document.createElement("div");
  newElement.style.display = "flex";
  newElement.style.justifyContent = "space-between";
  newElement.style.marginBottom = "4px";

  let child1 = document.createElement("div");
  child1.textContent = userComment;
  let child2 = document.createElement("button");
  child2.textContent = "Deletee";

 
  newElement.appendChild(child1);
  newElement.appendChild(child2);


  const commentBox = document.querySelector("#commentBox");

  
  commentBox.insertBefore(newElement, commentBox.firstChild);

  
  document.querySelector("#inputId1").value = "";
}

function likeHere() {
  likeCounter++;

  let btnElement = document.querySelector("#btnid");
  btnElement.innerHTML = "Like " + likeCounter;
}