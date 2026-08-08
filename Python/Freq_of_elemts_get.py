elemts = [1,2,5,3,2,3,4,5,2,5,2,1]

freq = {}

for i in elemts:
    freq[i] = freq.get(i,0) + 1

print(freq)