def factorial(n):
    """Calculates the factorial of a number using recursion."""
    if n == 0 or n == 1:
        return 1  # Base case: 0! and 1! are 1
    
    # Recursive call: n! = n * (n-1)!
    return n * factorial(n - 1)

if __name__ == "__main__":
    number = 5
    result = factorial(number)
    print(f"Factorial of {number} is: {result}")