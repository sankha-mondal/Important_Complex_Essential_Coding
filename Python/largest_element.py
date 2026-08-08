elemts = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]

largest = elemts[0]

for i in elemts:
    if i > largest:
        largest = i

print("The largest element in the list is:", largest)