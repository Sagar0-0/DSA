class Solution
{
public:
    int minimizeXor(int num1, int num2)
    {
        int c1 = __builtin_popcount(num1);
        int c2 = __builtin_popcount(num2);

        int ans = 0;

        for (int i = 31; i >= 0; i--)
        {
            if ((1 << i) & num1)
            {
                ans |= (1 << i);
                c2--;

                if (c2 == 0) break;
            }
        }

        if (c2 > 0)
        {
            for (int i = 0; i < 32; i++)
            {
                if (((1 << i) & num1) == 0)
                {
                    ans |= 1 << i;
                    c2--;
                }

                if (c2 == 0) break;
            }
        }

        return ans;
    }
};