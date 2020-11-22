def even_valued_fibo(limit):
    ans = 0
    sum = 0
    first_num = 0
    second_num = 1
    while sum < limit:
        sum = first_num + second_num
        if current_value % 2 == 0:
            ans += sum
        second_num = first_num
        first_num = sum
    return ans

print(even_valued_fibo(4000000))
    