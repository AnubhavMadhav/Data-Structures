# Python code to demonstrate the working of
# typecode, itemsize, buffer_info()

'''
typecode :- This function returns the data type by which array is initialised.
itemsize :- This function returns size in bytes of a single array element.
buffer_info() :- Returns a tuple representing the address in which array is stored and number of elements in it.
'''



# importing "array" for array operations
import array

# initializing array with array values
# initializes array with signed integers
arr= array.array('i',[1, 2, 3, 1, 2, 5])

# using typecode to print datatype of array
print ("The datatype of array is : ",end="")
print (arr.typecode)                                                # returns the data type by which array is initialised

# using itemsize to print itemsize of array
print ("The itemsize of array is : ",end="")
print (arr.itemsize)                                                # returns size in bytes of a single array element

# using buffer_info() to print buffer info. of array
print ("The buffer info. of array is : ",end="")
print (arr.buffer_info())                                           # returns a tuple representing the address in which array is stored and number of elements in it
                # address in which array is stored changes after each compilation