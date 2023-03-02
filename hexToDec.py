def hexToDec(n):
    hexStr = "0123456789ABCDEF"
    sum = 0
    hex = str(n)[::-1]

    for i in range(len(hex)):
        dec = hexStr.index(hex[i]) * 16 ** i
        sum += dec

    return sum

print(hexToDec(31)) #Output: 49
print(hexToDec("3F")) #Output: 63
