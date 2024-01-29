#Burst-Search
class Solution:
    def twoSum(self, num: List[int], target: int) -> List[int]:
        n = len(num)
        for i in range(n-1):#From starting element to last-1
            for j in range(i+1,n):#From i+1 to last element
                if num[i]+num[j]==target:#If sum is equal to target return 
                    return [i,j]
        return []#If not return empty 