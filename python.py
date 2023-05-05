import sys
import math

# Auto-generated code below aims at helping you parse
# the standard input according to the problem statement.

t = input()
a = t.find("#")
b = len(t)-a-1
print(min(a,b))
