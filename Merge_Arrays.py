arr1 = [7, 9, 9, 10, 11, 11, 13, 14, 17, 19]
arr2 = [1, 1, 4, 5, 8, 11, 13, 16, 19, 19]
n = 10
m = 10
arr3 = []
arr4 = []

arr3.extend(arr1)
arr3.extend(arr2)
arr3.sort()
arr4.extend(arr3)
arr4.sort(reverse=True)

arr1.clear()
arr2.clear()
for i in arr3:
    arr1.append(i)
    if arr1.index(i)==n-1:
        break

for i in arr4:
    arr2.append(i)
    if arr2.index(i)==m-1:
        break
for i in arr2:
    arr2.pop()
    if arr2.index(i)==m-1:
        break
arr2.sort()
print(arr1+arr2)

#for i in arr2:
#            arr2.pop()
 #           if arr2.index(i)==m-1:
  #              break
   #     arr2.sort()