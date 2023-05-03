import sys
import math
_input = input()
result = ''
# Write an answer using print
# To debug: print("Debug messages...", file=sys.stderr, flush=True)
chunks = _input.split()
for chunk in range(len(chunks)):
    if (chunk == len(chunks)-1):
        result += str(len(chunks[chunk]))
    else:
        result += str(len(chunks[chunk])) + ' '

print(result)
