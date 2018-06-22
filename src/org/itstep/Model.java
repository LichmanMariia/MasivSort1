package org.itstep;

public class Model {

	private int number;
	private int[] array; // объявление массива

	public int[] getArray() { // геттер для этого массива
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Model(int number, int[] array) { // конструктор с двумя полями
		super();
		this.number = number;
		this.array = array;
	}

	public Model() {
		super();
	}

	

	public Model(int[] array) {
		super();
		this.array = array;
	}

	public int[] getIndexArray() { // этот метод ничего не принимает, т.к. () пустые
		int counter = 0;
		int[] arrayIndex = new int[getIndex()]; // создаем массив. getIndex() - это ссылка на следющий метод
		for (int i = 0; i < array.length; i++) { // проходит по всем элементам массива, от 0 до последнего 
			if (array[i] == number) { // значение i которое ув на 1, и т.д. сравнивается с нашим числом
				arrayIndex[counter] = i; // если условие выполнилось, то ему присваевается индекс массива (начиная с 0)
				counter++;
			}
		}
		return arrayIndex;
	}
	
	private int getIndex() { //  следющий метод
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) {
				count = count + 1;
			}
		}
		return count;
	}
	
	public String getStringIndex(int [] array) { // выводит результат поиска на экран 
		String result = "";
		for (int i = 0; i <array.length ; i++) {
			result = result + array[i] + " ";
		}
		return result;
	}

}
