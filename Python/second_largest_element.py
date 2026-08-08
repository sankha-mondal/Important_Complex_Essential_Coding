elemts = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]

largest = elemts[0]
second_largest = elemts[0]

for i in elemts:
    if i > largest:
        second_largest = largest
        largest = i
    elif i > second_largest and i != largest:
        second_largest = i

print("The second largest element in the list is:", second_largest)