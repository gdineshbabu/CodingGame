
def fibonacci_letter(s):
    if s == 'a':
        return 1
    elif s == 'b':
        return 1
    else:
        return fibonacci_letter(chr(ord(s) - 1)) + fibonacci_letter(chr(ord(s) - 2))

letter = input()
fibonacci_number = fibonacci_letter(letter)
print(fibonacci_number)
