class Solution {
    public void moveZeroes(int[] arr) {
       
       int n=arr.length;
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


        
    }
}