class Solution(object):
    def wordBreak(self, s, wordDict):
        dp = [[] for _ in range(len(s) + 1)]
        for start in range(0, len(s)):
            if not dp[start]:
                continue
            for end in range(len(s), start, -1):
                word = s.substring(start, end)
                if word in wordDict:
                    if not dp[end]:
                        dp[end] = []
                    dp[end].append(word)
        result = []
        if not dp[-1]:
            return result
        self.dfs(dp, len(s), result, [])
        return result

    def dfs(self, dp, end, result, current):
        if end <= 0:
            ans = current.get(current.size() - 1)
            for i in range(len(current) - 2, -1, -1):
                ans += (" " + current.get(i))
            result.append(ans)
            return
        for str in dp[end]:
            current.append(str)
            self.dfs(dp, end - len(str), result, current)
            current.pop()

