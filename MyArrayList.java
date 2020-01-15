package help_arraylist;

public class MyArrayList {
	
	private int size;
	private Object[] array;
	
	public MyArrayList(){
		array = new Object[10];
		size =0;
		
	}
	public int size(){
		return this.size;
		
	}
	
	public Object[] getObjects(){
		return this.array;
	}
	
	public Object get(int index){
		if(index<0 || index>= this.array.length){
			throw new IndexOutOfBoundsException();
		}
		else {
		return this.array[index];
		}
	}
	
	public void add(Object s){
		
		
		if(this.size==this.array.length){
			ensureCapacity();
		}
		this.array[this.size++]= s;
	}
	
	private void ensureCapacity(){
		
		int newSize = this.array.length + (int) (this.array.length/2)+1;
		
		Object[] temp = new Object[newSize];
		for(int i=0; i<this.array.length-1;i++){
			temp[i]=this.array[i];
		}
		
		this.array=temp;
		
	}
	
	public int indexOf(Object s){
		for(int i=0; i<=this.size-1;i++){
			if(this.array[i].equals(s)){
			return i;
		}
		}
		return -1;
		
	}
	
	public boolean remove(Object s){
		
		Object[] array2 = new Object[this.array.length];
		int count =0;
		
		int check =1;
		for(int i =0;i<this.array.length -1;i++){
			if(this.array[i] !=null && this.array[i].equals(s) && check ==1){
				--this.size;
				check =0;
				continue;
			}
			else {
				array2[count]=this.array[i];
				count++;
			}
		}
		if(check==1){
			return false;
		}
		
		this.array = array2;
		
		return true;
				
		
	}
	
	public static void main(String[] args){
		int[] x = {1,2,3};
		int[] y = {1,2,3};
		System.out.println(x.equals(y));
	}
	

}
