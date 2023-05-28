
  def split_text_by_first_occurrence(t, match):
    # Find the index of the first occurrence of the match
    index = t.index(match)

    # Split the text into three parts based on the match
    before_match = t[:index]
    the_match = match
    after_match = t[index + len(match):]

    return before_match, the_match, after_match

# Test the function with the given example
t = input()
match = input()
result = split_text_by_first_occurrence(t, match)

# Print the results
for part in result:
    print(part)
