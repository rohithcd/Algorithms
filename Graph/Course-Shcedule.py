class Solution:
    def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:
        PreMap = { i : [] for i in range(numCourses) }
        
        for crs,pre in prerequisites:
            PreMap[crs].append(pre)
            
        visitSet = set()
            
        def dfs(crs):
            if crs in visitSet:
                return False
            if PreMap[crs] == []:
                return True
            
            visitSet.add(crs)
            
            for pre in PreMap[crs]:
                if not dfs(pre):
                    return False
            visitSet.remove(crs)
            PreMap[crs] = []
            return True
            
        for crs in range(numCourses ):
            if not dfs(crs):
                return False
        return True
