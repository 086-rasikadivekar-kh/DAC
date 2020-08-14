

function handleMouseOver(){
    var elem = document.querySelector("#id2");
    elem.style.background= "pink";
    elem.style.color = "yellow";
    elem.innerHTML = "Hello Class Selector!!";

}


function handleMouseOut(){
    var elem = document.querySelector("#id2");
    elem.style.background= "black";
     elem.style.color = "white";
  
    elem.innerHTML = "Hello World";

}
