# User function Template for python3
class Solution:

    def kLargest(self, arr, n, k):
        arr.sort(reverse=True)
        arr2 = [None] * k
        for i in range(0, k):
            arr2[i] = arr[i]

    return arr2


# {
#  Driver Code Starts
# Initial Template for Python 3


if __name__ == '__main__':
    tc = int(input())
    while tc > 0:
        n, k = list(map(int, input().strip().split()))
        arr = list(map(int, input().strip().split()))
        ob = Solution()
        ans = ob.kLargest(arr, n, k)
        for x in ans:
            print(x, end=" ")
        print()
        tc -= 1

# } Driver Code Ends