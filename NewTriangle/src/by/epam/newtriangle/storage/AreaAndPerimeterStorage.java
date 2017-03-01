package by.epam.newtriangle.storage;

import java.util.ArrayList;
import java.util.HashMap;

import by.epam.newtriangle.entity.Triangle;
import by.epam.newtriangle.logic.TriangleLogic;
import by.epam.newtriangle.observer.OperationObserver;

public class AreaAndPerimeterStorage extends OperationObserver {
	 
		private static AreaAndPerimeterStorage instance;
		private HashMap<Integer, AreaAndPerimeter> areaAndPerim = new HashMap<>();
		
		private AreaAndPerimeterStorage(){}
	   
		public static AreaAndPerimeterStorage getInstance(){
			if(instance == null){
				instance = new AreaAndPerimeterStorage();
			}
			return instance;
		}
			
		public void addAreaAndPerimeter(ArrayList<Triangle> list){		
			for(Triangle t:list){
				areaAndPerim.put(t.getId(),new AreaAndPerimeter(TriangleLogic.areaOfTheTriangle(t),TriangleLogic.perimeterOfTheTriangle(t)));
			}
		}
		
		public HashMap<Integer, AreaAndPerimeter> getAreaAndPerim() {
			return areaAndPerim;
		}

		
		@Override
		public void valueChanged(Triangle observed) {
			AreaAndPerimeter ap = areaAndPerim.get(observed.getId());
			ap.setArea(TriangleLogic.areaOfTheTriangle(observed));
			ap.setPerimeter(TriangleLogic.perimeterOfTheTriangle(observed));
		}		
}
