import java.util.List;

public class MyArrayList implements MyList{
	
	private int[] array;
	private int size;
	private static final int CAPACIDADE_DEFAULT = 10;
	
	public MyArrayList() {
		this.array = new int[CAPACIDADE_DEFAULT];
		this.size = 0;
	}
	
	public MyArrayList(int capacidade) {
		this.array = new int[capacidade];
		this.size = 0;
	}
	
	private void duplicar() {
		
		int[] newArray = new int[this.size*2];
		
		for(int i = 0; i < this.size; i++) {
			newArray[i] = this.array[i];
		}
		
		this.array = newArray;
	}

	@Override
	public void add(int valor) {
		
		if(this.size >= this.array.length) {
			duplicar();
		}
		
		for(int i = 0; i <= this.size; i++) {
			this.array[this.size] = valor;
		}
		this.size++;
		
	}

	@Override
	public void add(int valor, int pos) {
		
		if(pos < 0 || pos >= this.size) {
			throw new RuntimeException("Posição Inválida!");
		}	
		for (int i = this.size-1; i >= pos; i--) {	
			this.array[i+1] = this.array[i];
		}	
		this.array[pos] = valor;
		this.size++;
	}

	@Override
	public void remove(int pos) {

		if(pos < 0 || pos >= this.size) {
			throw new RuntimeException("Posição Inválida!");
		}
		for (int i = pos; i < this.size; i++) {
			this.array[i] = this.array[i+1];
		}	
		this.size--;
	}

	@Override
	public int getSize() {
		return this.size;
	}

	@Override
	public int get(int pos) {
		return this.array[pos];
	}

	@Override
	public boolean isEmpty() {
		if(this.size == 0) {
			return true;
		}
		return false;
	}
	
	

}
