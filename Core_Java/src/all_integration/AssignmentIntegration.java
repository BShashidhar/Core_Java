package all_integration;
import java.util.Scanner;

import aggregation.*;
import arrays.*;
import atmApp.*;
import bst.*;
import collections.*;
import composition.*;
import dependency.*;
import designpatterns.*;
import exceptions.*;
import honeywell.*;
import interviewPre.*;
import jdbc_old.*;
import jdbc.*;
import linkedlist.*;
import list.*;
import map.*;
import matrix.*;
import mcqs.*;
import numbers.*;
import oops.*;
import patterns.*;
import recursion.*;
import reflection.*;
import regex.*;
import run_time_type_identification.*;
import searching.*;
import siemensHealthcare.*;
import simplilearn.*;
import societeGenerale.*;
import sorting.*;
import strings.*;
import thread.*;

public class AssignmentIntegration {

	public static void main(String[] args) {		
		menu();		
	}
	private static void menu() {
		Scanner sc =new Scanner(System.in);
		boolean choice = true;
			do {
			System.out.println("1.linkedlist\n 2.Int-Array Program \n 3.Rectangle-array Program \n 4.reflection\n 5.Agggregation\n 6.composition\n 7.Dependency\n8.inheritance\n9.RTTI\n10.Exception\n11.CollectionsList\n12.Map\n13.Threads"
					+ "\n14.ATMCASESTUDY\n15 MenuBasedJdbc\n");
			int input=sc.nextInt();
			switch(input)
			{
			case 1:
				linkedlist.testLinkedList.main(null);
				break;
			case 2:
				IntArray.main(null);
				break;
			case 3:
				ReactangleTest.main(null);
				break;
			case 4:
				Ref.main(null);
				break;
			case 5:
				Student.main(null);
				break;
			case 6:
				person.main(null);
				break;
			case 7:
				one.main(null);
				break;
			case 8:
				inheritance.main(null);
				break;
			case 9:
				TestInmheritance.main(null);
				break;
			case 10:
				throwsException.main(null);
				break;
			case 11:
				Lists.main(null);
				break;
			case 12:
				TestMap.main(null);
				break;
			case 13:
				ThreadDrug.main(null);
				break;
			case 14:
				ATMCaseStudy.main(null);
				break;
			case 15:
				Jdbcdrug.main(null);
				break;	
			}			
		}
		while(choice);
	}

}
