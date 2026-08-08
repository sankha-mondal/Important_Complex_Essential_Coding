arr = [2,7,11,15]
target = 9

seen = {}

for num in arr:
    complement = target - num
    if complement in seen:
        print("The pair that sums to", target, "is:", (complement, num))
        break
    seen[num] = True