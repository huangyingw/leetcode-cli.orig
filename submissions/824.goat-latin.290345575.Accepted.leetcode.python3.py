class Solution:
    def toGoatLatin(self, S):
        postfix = "maa"
        new_list = []
        for word in S.split():
            if word.startswith(('a', 'i', 'e', 'o', 'u', 'A', 'E', 'I', 'O', 'U')):
                word = word + postfix
            else:
                word = word[1:] + word[0] + postfix
            postfix = postfix + 'a'
            new_list.append(word)
        return " ".join(new_list)

