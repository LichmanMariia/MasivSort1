package org.itstep;

public class Model {

	private int number;
	private int[] array; // ���������� �������

	public int[] getArray() { // ������ ��� ����� �������
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

	public Model(int number, int[] array) { // ����������� � ����� ������
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

	public int[] getIndexArray() { // ���� ����� ������ �� ���������, �.�. () ������
		int counter = 0;
		int[] arrayIndex = new int[getIndex()]; // ������� ������. getIndex() - ��� ������ �� �������� �����
		for (int i = 0; i < array.length; i++) { // �������� �� ���� ��������� �������, �� 0 �� ���������� 
			if (array[i] == number) { // �������� i ������� �� �� 1, � �.�. ������������ � ����� ������
				arrayIndex[counter] = i; // ���� ������� �����������, �� ��� ������������� ������ ������� (������� � 0)
				counter++;
			}
		}
		return arrayIndex;
	}
	
	private int getIndex() { //  �������� �����
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) {
				count = count + 1;
			}
		}
		return count;
	}
	
	public String getStringIndex(int [] array) { // ������� ��������� ������ �� ����� 
		String result = "";
		for (int i = 0; i <array.length ; i++) {
			result = result + array[i] + " ";
		}
		return result;
	}

}
