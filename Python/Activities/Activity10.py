# Given tuple
#num_tuple = (10, 20, 33, 46, 55,77, 100)

#To get user input
num_tuple = tuple(input("Enter a sequence of comma separated values: ").split(","))

print("Given list is ", num_tuple)

# Print elements that are divisible by 5
print("Elements that are divisible by 5:")
for num in num_tuple:
    if (int(num) % 5 == 0):
        print(num)