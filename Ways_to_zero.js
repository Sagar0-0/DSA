// Description

// Given an integer N. In how many ways you can subtract numbers 1, 2, and, 5 from N such that value of N reduces to 0. 

function fun(num){
if(num<0){
    return 0;
}    
if(num==0){
    return 1
}




return fun(num-1)+fun(num-2)+fun(num-5);
    
    
    
}

console.log(fun(4));
// ANSWER :-  5
