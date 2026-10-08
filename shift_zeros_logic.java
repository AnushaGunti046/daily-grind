int i=0;
int j=1;
while(j<n){
if(arr[i]>=0&&arr[j]<0){
int temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
i=i+1;
j=j+1;
}
else if(arr[i]<0&&arr[j]>=0){
i=i+1;
j=j+1;
}
else{
j=j+1;
}
}