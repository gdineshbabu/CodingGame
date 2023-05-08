words = input().strip()
typed = input().strip()
time = int(input())

num_chars = len(typed)
num_errors = sum([1 for i in range(num_chars) if typed[i] != words[i]])
num_words = num_chars / 5 - num_errors
words_per_minute = round(num_words / (time / 60))

print(words_per_minute)
