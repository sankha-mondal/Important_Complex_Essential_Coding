elemts = [1,2,5,3,2,3,4,5,2,5,2,1]

freq = {}

for i in elemts:
    if i in freq:
        freq[i] += 1
    else:
        freq[i] = 1

print(freq)