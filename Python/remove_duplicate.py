arr = [1,2,2,3,1,4]

unique_arr = []

for i in arr:
    if i not in unique_arr:
        unique_arr.append(i)

print("The array after removing duplicates is:", unique_arr)