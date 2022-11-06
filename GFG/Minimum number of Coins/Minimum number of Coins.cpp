class Solution{
public:
    vector<int> minPartition(int N)
    {
        vector<int> v;
        
        if(N>=2000){
            int cnt = N/2000;
            for(int i=0;i<cnt;i++) v.push_back(2000);
            N %= 2000;
        } if(N>=500){
            int cnt = N/500;
            for(int i=0;i<cnt;i++) v.push_back(500);
            N %= 500;
        } if(N>=200){
            int cnt = N/200;
            for(int i=0;i<cnt;i++) v.push_back(200);
            N %= 200;
        } if(N>=100){
            int cnt = N/100;
            for(int i=0;i<cnt;i++) v.push_back(100);
            N %= 100;
        } if(N>=50){
            int cnt = N/50;
            for(int i=0;i<cnt;i++) v.push_back(50);
            N %= 50;
        } if(N>=20){
            int cnt = N/20;
            for(int i=0;i<cnt;i++) v.push_back(20);
            N %= 20;
            // cout<<N<<"\n";
        } if(N>=10){
            int cnt = N/10;
            for(int i=0;i<cnt;i++) v.push_back(10);
            N %= 10;
        } if(N>=5){
            int cnt = N/5;
            for(int i=0;i<cnt;i++) v.push_back(5);
            N %= 5;
        } if(N>=2){
            int cnt = N/2;
            for(int i=0;i<cnt;i++) v.push_back(2);
            N %= 2;
        } if(N>=1){
            int cnt = N;
            for(int i=0;i<cnt;i++) v.push_back(1);
            N %= 1;
        }
        
        return v;
    }
};
