text = "Python is easy, Python is powerful, Python is popular!"

words = text.split()
word_count = {}

for word in words:
    word_count[word] = word_count.get(word, 0) + 1

print(word_count)