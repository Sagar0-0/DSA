def decodedString(s):
    countArr = []
    stringArr = []
    # creating a extra string so we don't get any index error
    stringArr.append("")
    n = len(s)
    lastCount = ""  # Saving the last intger for values greater than 9, Since in that case we need to store last varibles
    for i in range(n):
        try:  # Handling integer values
            lastCount += str(int(s[i]))
        except:
            if s[i] == "[":  # if brackets starts
                countArr.append(int(lastCount))  # Save the count
                stringArr.append("")  # Start new string
                lastCount = ""  # Set last count to 0 or None
            elif s[i] == "]":  # pattern ends
                lastChar = stringArr.pop()  # pop the last saved string
                lastChar = lastChar * countArr.pop()  # Pop out count of string
                # Save the string to last string after pop out
                stringArr[-1] = stringArr[-1] + lastChar
            else:
                stringArr[-1] += s[i]  # add char to string

    return stringArr.pop()
