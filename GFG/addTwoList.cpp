Node* addTwoList(Node* first,Node* second)
{
    if (first == NULL)
    {
        return second;
    }

    if (second == NULL)
    {
        return first;
    }

    // step1
    first = reverse(first);
    second = reverse(second);

    // step2 
    Node* ansHead = NULL;
    Node* ansTail = NULL;

    int carry = 0;

    while (first != NULL || second != NULL || carry != 0)
    {
        int firstListData = 0;
        if(first)
            firstListData = first -> data;
        
        int secondListData = 0;
        if(second)
            secondListData = second -> data;
        
        int sum = carry + firstListData + secondListData;
        int digit = sum % 10;

        insertAtTail(ansHead,ansTail,digit);

        carry = sum / 10;

        if(first)
            first = first -> next;

        if(second)
            second = second -> next;
    }
    return reverse(ansHead);    
}
