class TimeMap:
    def __init__(self):
        self.timeStampDict = defaultdict(dict)
        self.timeStampRange = defaultdict(list)

    def set(self, key: str, value: str, timestamp: int) -> None:
        if key not in self.timeStampDict:
            self.timeStampDict[key][0] = ""
            self.timeStampRange[key].append(0)

        self.timeStampDict[key][timestamp] = value
        self.timeStampRange[key].append(timestamp)

    def get(self, key: str, timestamp: int) -> str:
        if timestamp in self.timeStampDict[key]: return self.timeStampDict[key][timestamp]
        index = bisect_left(self.timeStampRange[key], timestamp) - 1
        if index == -1: return ""
        
        return self.timeStampDict[key][self.timeStampRange[key][index]]
