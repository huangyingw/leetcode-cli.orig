class WordDistance(object):

    def __init__(self, words):
        self.w_to_idx = {}

        for idx, val in enumerate(words):
            self.w_to_idx.setdefault(val, []).append(idx)

    def shortest(self, word1, word2):
        idxs1 = self.w_to_idx[word1]
        idxs2 = self.w_to_idx[word2]
        print('word1 --> %s' % word1)
        print('idxs1 --> %s' % idxs1)
        print('word2 --> %s' % word2)
        print('idxs2 --> %s' % idxs2)

