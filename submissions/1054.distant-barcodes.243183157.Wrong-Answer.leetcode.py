import heapq


class Solution(object):
    def rearrangeBarcodes(self, barcodes):
        di = collections.Counter(barcodes)
        pq = [(-value, key) for key, value in di.items()]
        heapq.heapify(pq)
        result = []
        while len(pq) >= 2:
            freq1, barcode1 = heapq.heappop(pq)
            freq2, barcode2 = heapq.heappop(pq)
            result += [barcode1, barcode2]
            print('freq1 --> %s' % (freq1))
            print('freq2 --> %s' % (freq2))
        if pq:
            result.append(pq[0][1])
        return result

