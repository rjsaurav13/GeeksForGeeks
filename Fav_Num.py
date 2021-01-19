#User function Template for python3
class Solution:
    def isValid (self,N):
        if N%5==0:
            return "YES"
        return "NO"    



#{ 
#  Driver Code Starts
#Initial Template for Python 3
if __name__ == '__main__': 
    t = int (input ())
    for _ in range (t):
        
        N=int(input())
    

        ob = Solution()
        print(ob.isValid(N))
# } Driver Code Ends