#フィボナッチ数列

print("数字を入力")
n = int(input())  # 入力

def fib(n):
    if n <= 1:
        return n
    return fib(n - 1) + fib(n - 2)

for i in range(n + 1):
    print(fib(i))

# python recursive_function/pythpn/fibonacci.py