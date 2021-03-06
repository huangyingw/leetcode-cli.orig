"""
Problem Link: https://leetcode.com/problems/isomorphic-strings/

Given two strings s and t, determine if they are isomorphic.
Two strings are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character 
while preserving the order of characters. No two characters may map 
to the same character but a character may map to itself.

Example 1:
Input: s = "egg", t = "add"
Output: true

Example 2:
Input: s = "foo", t = "bar"
Output: false

Example 3:  
Input: s = "paper", t = "title"
Output: true
Note:
You may assume both s and t have the same length.
"""
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        d1 , d2 = [-1] * 128, [-1] * 128
        for i in range(len(s)):
          if d1[ord(s[i])] != d2[ord(t[i])]:
            return False
          d1[ord(s[i])] = i
          d2[ord(t[i])] = i
        return True

    def isIsomorphic1(self, s: str, t: str) -> bool:
        d1 , d2 = {}, {}
        for i in range(len(s)):
          if d1.get(ord(s[i]),-1) != d2.get(ord(t[i]),-1):
            return False
          d1[ord(s[i])] = i
          d2[ord(t[i])] = i
        return True
