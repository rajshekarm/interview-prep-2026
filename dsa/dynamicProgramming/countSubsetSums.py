

def countSubsetSum(nums: list[int]) -> int:
        dp = [[0] for _ in range(len(nums))]
        for i in range(sum(nums)):
            dp[0].add(0) 

        # s= 0 1 2 3 4 5 6 7 8 9 10
        # [........................
        #  ........................
        #  ........................
        #  .........................    
        #  .......................
        #  .........................
        #  .....................
        #  .......................]

        # dp[i][s] = number of subsets using the first i elements that sum to s

        for i in range(sum(nums)):
              for j in range(len(nums)):
                    if cur + nums[j]:
                          


        