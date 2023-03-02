function hexToDecimal(n){
    let dec 
    let sum = 0
    let hex = n.toString().split('').reverse()
    hexStr = "0123456789ABCDEF"
    
    for(let i = 0; i < hex.length; i++){
        dec = Number(hexStr.indexOf(hex[i])) * 16 ** i
        sum += dec
    }

    return sum
}   


console.log(hexToDecimal(31)) //Output: 49
console.log(hexToDecimal("3F")) //Output: 63

