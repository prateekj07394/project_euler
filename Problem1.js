const isMultipleOf3 = num => num % 3 === 0;
const isMultipleOf5 = num => num % 5 === 0;
const sumFun = num => {
    let sum = 0;
    for(let i = 1; i < num ; i++){
        if(isMultipleOf3(i) || isMultipleOf5(i)){
            sum += i;
        }
    }
    return sum;
}


console.log(sumFun(1000));