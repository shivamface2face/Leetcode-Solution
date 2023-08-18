class Solution {
    public int[] applyOperations(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(i<n-1){
                if(arr[i]==arr[i+1]){
                    arr[i]=arr[i]*2;
                    arr[i+1]=0;

                }
            }
        }
         
         	ArrayList<Integer>li=new ArrayList<>();
	
  // filling non zero to the list
		for(int i=0;i<n;i++){
			if(arr[i]!=0){
				li.add(arr[i]);
			}
		}

			int size=li.size();

		// now copy the non zero at begning of main array
		for(int i=0;i<size;i++){
			arr[i]=li.get(i);
		}

		// fill zero after non-zero
		for(int i=size;i<arr.length;i++){
			arr[i]=0;
		}

		return arr;




    }
}