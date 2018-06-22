package org.itstep;

import org.itstep.Controller;
import org.itstep.Model;
import org.itstep.View;

public class AppRunner {

	public static void main(String[] args) { // объ€вление массива
		int[] array = {1, 2, 2, 3, 4, 5, 6, 6, 7, 8, 6, 9}; // значени€ массива
		Model model = new Model(6, array); // объект класса модель ему - число которое мы ищем в массиве
		View view = new View();
		Controller controller = new Controller(view, model);

		controller.getElementOfArray(); // вызываем метод из класса контролера
	}
}
