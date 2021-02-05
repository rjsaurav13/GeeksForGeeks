import sys


# Function to find the minimum element
def getMin(arr, n, k):
    res = sys.maxsize
    for i in range(n):
        if (arr[i] % k == 0):
            res = min(res, arr[i])
            index=i
    return index


# Function to find the maximum element
def getMax(arr, n, k):
    res = 0
    for i in range(1, n):
        if (arr[i] % k == 0):
            res = max(res, arr[i])
            index = i
    return index


# Driver code
if __name__ == "__main__":
    arr = [15, 1230, 45, 10, 1]
    k = 10
    n = len(arr)
    print("Minimum element of array which",
          "is divisible by k: ", getMin(arr, n, k))
    print("Maximum element of array which",
          "is divisible by k: ", getMax(arr, n, k))
