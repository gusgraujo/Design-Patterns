package StructuralPattern.Bridge.Converter;

import StructuralPattern.Bridge.Converter.converters.CSVConverter;
import StructuralPattern.Bridge.Converter.converters.Converter;
import StructuralPattern.Bridge.Converter.converters.JsonConverter;
import StructuralPattern.Bridge.Converter.employees.ITGuy;
import StructuralPattern.Bridge.Converter.employees.ProjectManager;


public class Client {

	public static void main(String[] args) {
		Converter csvConverter = new CSVConverter();
		Converter jsonConverter = new JsonConverter();

		ITGuy it = new ITGuy("Maurice Moss", 32, 4000d);
		ProjectManager pm = new ProjectManager("Jen Barber", 40, 6000d);
		
		System.out.println(csvConverter.getEmployeeFormated(it));
		System.out.println(jsonConverter.getEmployeeFormated(it));
		System.out.println(csvConverter.getEmployeeFormated(pm));
		System.out.println(jsonConverter.getEmployeeFormated(pm));
	}
}
