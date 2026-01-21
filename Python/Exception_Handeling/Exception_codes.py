def divide(a, b):
    if b == 0:
        raise ValueError("Cannot divide by zero!")
    return a / b

try:
    result = divide(10, 0)
    print("Result:", result)
except ValueError as e:
    print("Caught an error:", e)

# O.p- 
# Caught an error: Cannot divide by zero!

## ========================================================================

## Define a custom exception class
## -------------------------------
class NegativeNumberError(Exception):
    def __init__(self, message="Negative numbers are not allowed"):
        self.message = message
        super().__init__(self.message)

# Function that uses the custom exception
def square_root(x):
    if x < 0:
        raise NegativeNumberError(f"Cannot calculate square root of negative number: {x}")
    return x ** 0.5

try:
    print(square_root(9))   # Works fine, prints 3.0
    print(square_root(-4))  # Raises NegativeNumberError
except NegativeNumberError as e:
    print("Caught a custom exception:", e)

# O.p-
# 3.0
# Caught a custom exception: Cannot calculate square root of negative number: -4
	
## =================================================================================

## Exception Raise Chain
## --------------------------------
## Define a custom exception class
class NegativeNumberError(Exception):
    def __init__(self, message="Negative numbers are not allowed"):
        self.message = message
        super().__init__(self.message)

# Function that uses the custom exception
def square_root(x):
    if x < 0:
        raise NegativeNumberError(f"Cannot calculate square root of negative number: {x}")
    return x ** 0.5

def call_fun_3(num):
    try:
        print(square_root(num))  
    except NegativeNumberError as e:
        print("call_fun_3")
        raise e
        
def call_fun_2(num):
	try:
		call_fun_3(num)
	except NegativeNumberError as e:
		print("call_fun_2")
		raise e
				   
def call_fun_1(num):
    try:
        call_fun_2(num)
    except NegativeNumberError as e:
        print("call_fun_1")
        print(e)
		
call_fun_1(-3)

# O.p-
'''
	call_fun_3
	call_fun_2
	call_fun_1
	Cannot calculate square root of negative number: -3
'''

# ==================================================================================

# Switch ValueError to NegativeNumberError:
# -------------------------------------------------------------
# Define a custom exception class
class NegativeNumberError(Exception):
    def __init__(self, message="Negative numbers are not allowed"):
        self.message = message
        super().__init__(self.message)


# Function that uses the custom exception
def square_root(x):
    if x == 0:
        raise ValueError("Cannot divide by zero!")
    elif x < 0:
        raise NegativeNumberError(f"Cannot calculate square root of negative number: {x}")
    return x ** 0.5

def call_fun_3(num):
    try:
        print(square_root(num))
    except Exception as e:
        print("call_fun_3")
        raise NegativeNumberError(e)

def call_fun_2(num):
    try:
        call_fun_3(num)
    except NegativeNumberError as e:
        print("call_fun_2")
        raise e

def call_fun_1(num):
    try:
        call_fun_2(num)
    except NegativeNumberError as e:
        print("call_fun_1")
        print(e)

# O.p:
'''
	call_fun_1(0)
	call_fun_1(-3)
	
	call_fun_3
	call_fun_2
	call_fun_1
	Cannot divide by zero!
	call_fun_3
	call_fun_2
	call_fun_1
	Cannot calculate square root of negative number: -3
'''
