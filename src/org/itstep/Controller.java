package org.itstep;

import org.itstep.Model;
import org.itstep.View;

public class Controller {

	View view; 
	Model model;

	public Controller(View view, Model model) { // конструктор
		super();
		this.view = view;
		this.model = model;
	}

	public Controller() { // пустой конструктор 
		super();
	}

	public void getElementOfArray() {
		view.getMessageInArray(view.NumberInArray, model.getNumber());
		if (model.getIndexArray().length != 0) {
			
			view.getMessageInArrayIndex(view.IndexInArray, model.getStringIndex(model.getIndexArray()));
		} else {
			view.getMessageNotArray(view.NotNumberInArray);
		}

	}

}
