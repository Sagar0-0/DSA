class Solution:
    def insert(self, intervals, newInterval):
        if len(intervals) == 0:
            return [newInterval]
        result = []
        result.append(newInterval)
        for i in range(0,len(intervals)):
            a = result.pop()
            b = intervals[i]
            if a.start > b.end:
                result.append(b)
                result.append(a)
            elif a.end < b.start:
                result.append(a)
                result.append(b)
            else:
                start = min(a.start, b.start)
                end = max(a.end, b.end)
                result.append(Interval(start, end))
            
        return result
