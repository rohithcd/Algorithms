
def selectionSort(array, size):
	
	for ind in range(size):
		min = ind

		for j in range(ind + 1, size):
			if array[j] < array[min]:
				min = j
		(array[ind], array[min]) = (array[min], array[ind])

arr = [9,6,8,4,21,3,1,6,10,0]
size = len(arr)
selectionSort(arr, size)
print('The array after sorting in Ascending Order by selection sort is:')
print(arr)
