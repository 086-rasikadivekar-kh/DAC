var counter=1;

function increment(){

let x = document.querySelector('#counterid');
counter = counter+1;
x.innerHTML=counter;

}


function decrement(){
    let y = document.querySelector('#counterid');
    counter = counter -1 ;
    y.innerHTML= counter;
}