
def decode_hex_to_ascii(hex_value):
    return bytes.fromhex(hex_value).decode('utf-8')
N = int(input())
decoded_chars = []
for _ in range(N):
    hex_value = input()
    decoded_chars.append(decode_hex_to_ascii(hex_value))
decoded_string = ''.join(decoded_chars)
print(decoded_string)
