class Solution {
  public:
    vector<int> reverseSpiral(int R, int C, vector<vector<int>>&a)  {
        // code here
        
          vector<int>ans;

       

        int top=0,left=0,right=C-1,bottom=R-1;

        while(top<=bottom and left<=right)

        { // top row

         if(top<=bottom)

            {

                for(int i=left;i<=right;i++)

                 ans.push_back(a[top][i]);

            

                 top++;

            }

            // right column

            if(left<=right){

            for(int i=top;i<=bottom;i++)

            {

                ans.push_back(a[i][right]);

            }

            right--;

            }

          //bottom row (reverse order)

          if(top<=bottom)

          {

              for(int i=right;i>=left;i--)

              {

                  ans.push_back(a[bottom][i]);

              }

              bottom--;

          }

          //left column (reverse order)

           if(left<=right)

          {

              for(int i=bottom;i>=top;i--)

              {

                  ans.push_back(a[i][left]);

              }

              left++;

          }

        }

        // reverse ans vector

      reverse(ans.begin(),ans.end());

        return ans;
    }
};
