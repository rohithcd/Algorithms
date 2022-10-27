# Python3 program to find the minimum
# time to place all mice in all holes.

# Returns minimum time required
# to place mice in holes.
def assignHole(mices, holes, n, m):
	
	# Base Condition
	# No. of mouse and holes should be same
	if (n != m):
		return -1
	
	# Sort the arrays
	mices.sort()
	holes.sort()
	
	# Finding max difference between
	# ith mice and hole
	Max = 0
	
	for i in range(n):
		if (Max < abs(mices[i] - holes[i])):
			Max = abs(mices[i] - holes[i])
	
	return Max
	
# Driver code

# Position of mouses
mices = [ 4, -4, 2 ]

# Position of holes
holes = [ 4, 0, 5 ]

# Number of mouses
n = len(mices)

# Number of holes
m = len(holes)

# The required answer is returned
# from the function
minTime = assignHole(mices, holes, n, m)

print("The last mouse gets into the hole in time:", minTime)


