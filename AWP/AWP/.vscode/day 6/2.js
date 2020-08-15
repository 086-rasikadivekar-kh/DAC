var likecount = 1;

function commentHere(){

    let userComment = document.querySelector("#inputId1").value;
    if(document.querySelector("#inputId1").value == ""){
        let ras = document.querySelector('#deleteid');
        ras.style.display="none";
        let ras1 = document.querySelector('#inputId1');
        ras1.style.visibility="hidden";
    }
    

    const newElement = document.querySelector("#referenceCommentId").cloneNode(true);
    newElement.removeAttribute("id");
    newElement.style.visibility="visible";
    newElement.children[0].innerHTML = userComment;

    const commentBox = document.querySelector("#commentBox");
    commentBox.insertBefore(newElement, commentBox.firstChild);

    document.querySelector("#inputId1").value="";


}




function likeHere(){
    likecount++;
    let like = document.querySelector('#likeid');
    like.children[0].innerHTML=likecount;

}

function deleteComment(btnElement){
    btnElement.parentElement.remove();
}