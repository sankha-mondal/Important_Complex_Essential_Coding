test = "Hello, World!"

print(test[::-1])

rev = ""

for i in test:
    rev = i + rev

print("The reverse of the string is:", rev)