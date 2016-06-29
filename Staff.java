
public class Staff {
	String firstName;
	String lastName;
	int socialNumber;
	int personnelNumber;
	int jobTitle;
	int Salary;
}
public class Manager extends Staff {
	int attendedMeatings;
	int assistantsNeeded;
	String driver'sSpecifications;
	String car'sModel;
}
public class Assistant extends Staff {
	String assistantTitle;
	int doneTasks;
	int attendedMeatings;
	int paymentPerHour;
}
public class HighRankingEmployee extends Staff{
	int hoursOfVacation;
	int paymentPerOvertimeHour;
	int overtimeHour;
}
public class LowRankingEmployee extends Staff{
	int solvedPuzzle;
	int paymentPerOvertimeHour;
}
