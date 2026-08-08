arr = [1,2,2,3,1,4]

seen = set()
duplicates = []

for i in arr:
    if i in seen:
        duplicates.append(i)
    else:
        seen.add(i)

print("The duplicate elements are:", duplicates)