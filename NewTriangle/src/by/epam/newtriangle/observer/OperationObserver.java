package by.epam.newtriangle.observer;

import by.epam.newtriangle.entity.Triangle;


public abstract class OperationObserver {
	public abstract void valueChanged(Triangle observed);
}
