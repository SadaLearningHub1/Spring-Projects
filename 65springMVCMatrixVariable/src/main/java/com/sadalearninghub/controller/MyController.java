package com.sadalearninghub.controller;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	
		@GetMapping("/")
		public String root() {
			return "index";
		}
	
		/*
	    * Binding a matrix variable to a method parameter
	    * Ex:http://localhost:9999/54springMVC/student/name=SadaLearningHub
	    */
	   @GetMapping("/student/{name}")
	   @ResponseBody
	   public String matrixVarialbleMethodParameter(@MatrixVariable("name") String name) {

	      return "<center><h1>Matxrix variable <br> "
	            + "name =" + name+"</h1></center>";
	   }
	   
	   /*
	    * Binding multiple matrix variables to  method parameters
	    * Ex:http://localhost:9999/54springMVC/matrixToMethodParam/firstName=SadaLearningHub/lastName=SadaLearningHub
	    */
	   @GetMapping("/matrixToMethodParam/{firstName}/{lastName}")
	   @ResponseBody
	   public String handleMultipleMatixVariables(@MatrixVariable("firstName") String firstName, @MatrixVariable("lastName") String lastName) {

	      return "<center><h1><br>Matxrix variable <br> "
	            + "firstName =" + firstName +"<br>"
	            + "lastName =" + lastName+"</h1></center>";
	   }
	   
	   /*
	    * Binding matrix variables and path variables
	    * Ex:http://localhost:9999/54springMVC/matrixAndPathVar/SadaLearningHub;salary=1000;dept=computer
	    */
	   @GetMapping("/matrixAndPathVar/{name}")
	   @ResponseBody
	   public String handleMatrixAndPathVariable(@PathVariable("name") String name, @MatrixVariable("salary") double salary, @MatrixVariable("dept") String dept ) {

	      return "<center><h1>Path Variables <br>"
	            + "name = "+ name +"<br>"
	            + "<br>Matxrix variable <br> "
	            + "salary =" + salary +"<br>"
	            + "dept =" + dept+"</h1></center>";
	   }
	   
	   /*
	    * Binding matrix variables having same name in different path segments
	    * Ex: http://localhost:9999/54springMVC/matrixHavingSameNameAndDiffPathRef/SadaLearningHub;id=10;dept=computer/India;id=100
	    */
	   @GetMapping("/matrixHavingSameNameAndDiffPathRef/{name}/{address}")
	   @ResponseBody
	   public String handleMatrixwithDifferentPathSegment(@PathVariable("name") String name, @MatrixVariable(name="id", pathVar="name") int empId, @MatrixVariable("dept") String dept, @PathVariable("address") String address, @MatrixVariable(name="id", pathVar="address") int addrId ) {

	      return "<center><h1>Path Variables <br>"
	            + "name = "+ name +"<br>"
	            + "address = "+ address +"<br>"
	            + "<br>Matxrix variable <br> "
	            + "empId =" + empId +"<br>"
	            + "dept =" + dept +"<br>"
	            + "addrId =" + addrId+"</h1></center>";
	   }
	   
	   /*
	    * Binding matrix variable with multiple values
	    * Ex : http://localhost:9999/54springMVC/matrixWithMulVal/SadaLearningHub;color=red,green,blue
	    */
	   @GetMapping("/matrixWithMulVal/{name}")
	   @ResponseBody
	   public String handleMatrixWithMuktipleValues(@PathVariable("name") String name, @MatrixVariable("color") String[] color ) {

	      return "<center><h1>Path Variables <br>"
	            + "name = "+ name +"<br>"
	            + "<br>Matxrix variable <br> "
	            + "colors =" + Arrays.asList(color)+"</h1></center>";
	   }
	   
	   /*
	    * Binding a matrix variable with optional and default value
	    * Ex: http://localhost:9999/54springMVC/matrixWithOptAndDefVal/SadaLearningHub;dob=2018-08-12
	    */
	   @GetMapping("/matrixWithOptAndDefVal/{name}")
	   @ResponseBody
	   public String handleMatrixwithOptionalValues(@PathVariable("name") String name, @MatrixVariable("dob") @DateTimeFormat(pattern="yyyy-MM-dd") LocalDate dob, @MatrixVariable(required=false, defaultValue="91XXXXXXXX") String mobile ) {

	      return "<center><h1>Path Variables <br>"
	            + "name = "+ name +"<br>"
	            + "<br>Matxrix variable <br> "
	            + "dob =" + dob +"<br>"
	            + "mobile =" + mobile+"</h1></center>";
	   }


}
