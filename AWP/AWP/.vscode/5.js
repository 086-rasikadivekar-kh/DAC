
let counter=1;
let likecounter=1;
function commenthere(){
    let g= document.querySelector('#id1').value;
    let ele = document.createElement('div');
    ele.textContent= g;
    ele.style.background="red";
    ele.style.color="black";
    let rt= document.querySelector('#commentbox');
    rt.insertBefore(ele, rt.firstChild);
    document.querySelector('#id1').value="";
}


function likehere(){
    likecounter++;

let g=document.querySelector('#id2');
g.innerHTML= "like" + likecounter;
}