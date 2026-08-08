nums = [1,2,4,5]
n = 5

total_sum = n * (n + 1) // 2
actual_sum = sum(nums)  

missing_number = total_sum - actual_sum
print("The missing number is:", missing_number)