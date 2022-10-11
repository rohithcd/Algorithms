# Python program to find smallest
# number to find smallest number
# with N as sum of digits and
# divisible by 10^N.

import math
def digitsNum(N):

	# If N = 0 the string will be 0
	if (N == 0) :
		print("0", end = "")
	
	# If n is not perfectly divisible
	# by 9 output the remainder
	if (N % 9 != 0):
		print (N % 9, end ="")
	
	# Print 9 N/9 times
	for i in range( 1, int(N / 9) + 1) :
		print("9", end = "")
	
	# Append N zero's to the number so
	# as to make it divisible by 10^N
	for i in range(1, N + 1) :
		print("0", end = "")
	
	print()


# Driver Code
N = 5
print("The number is : ",end="")
digitsNum(N)

# This code is contributed by Mathew Saju.
