package studyguide2;

import java.util.Arrays;

// Employee( ): Initialize the empty array empIDs to store 11 integer values. Assign the 
// value 1 to each element in empIDs. Print "A new JIRA team has been formed".

public class Employee implements EmployeeInterface{
	int[] empIDs = new int[11];
	public Employee(){
		for (int i = 0; i < 11; i++) empIDs[i]=1;
	}

	@Override
	public void calculateAvgAge(int[] age) {
		// TODO Auto-generated method stub
		empIDs=age;
		System.out.println("A new JIRA team has been formed");
		for (int i = 0; i < empIDs.length; i++) System.out.print(empIDs[i]+" ");

		double sum=0;
		for (int e: empIDs) sum+=e;
		sum/=(empIDs.length);
		System.out.printf("\nThe average age of the JIRA team is %.2f\n",sum);
	}

	@Override
	public void promoteEmployee(int id) {
		// TODO Auto-generated method stub
		if(empIDs[id-1]>(-1)) {
			System.out.printf("Employee with id: %d has been promoted!!\n", id);
			empIDs[id-1]=-1;
		}else
			System.out.printf("Employee %d has already been promoted\n",id);
	}

}
