arr = [0,1,0,3,1,2]

result = []

for i in arr:
    if i != 0:
        result.append(i)


print("The array after moving zeros to the end is:", result + [0] * (len(arr) - len(result)))

# The array after moving zeros to the end is: [1, 3, 1, 2, 0, 0]