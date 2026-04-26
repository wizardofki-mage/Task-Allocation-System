// Programmer: Jason Ash
// Discription: Learn Java With Projects, Chapter 4 Project: Task Allocation System 
// Filename: TaskAllocationSystem.java
// Creation date: 16, April 2026

import java.util.Scanner;
public class TaskAllocationSystem
{
	public static void main(String[] args)
	{
		int employeeRole, safetyRatingPassed, currentTime;
		boolean validRole, validSafetyRating, validHours, erronousOperation = false;
		char anotherSelection = 'n';
		Scanner sc = new Scanner(System.in);

		System.out.println("Mesozoic is open to the public from 10 A.M. to 7 P.M.");
		
		do
		{
			do
			{
				System.out.println("What is the employee\'s role?");
				System.out.print("1. Manager\n2. Feeder\n3. Cleaner\n4. Security\n5. Tour guide\n");
				System.out.print("Selection --> ");
				employeeRole = sc.nextInt();

				if(employeeRole >= 1 && employeeRole <=5)
				{
					validRole = true;
				} // end check if employee role is valid
				else
				{
					System.out.println("Please make a valid employee selection.");
					validRole = false;
				} // end else if employee role selected is not valid
			} while(!validRole); // end input employee type

			do
			{
				System.out.println("What is the park\'s current safety rating?");
				System.out.println("1. Pass");
				System.out.println("2. Fail");
				safetyRatingPassed = sc.nextInt();
				
				if(safetyRatingPassed == 1 || safetyRatingPassed == 2)
				{
					validSafetyRating = true;
				}
				else
				{
					System.out.println("Please make a valid safety rating selection.");
					validSafetyRating = false;
				}
			} while(!validSafetyRating); // end input safety rating

			do
			{
				System.out.println("What time is it?");
				System.out.println("1. During business hours");
				System.out.println("2. After business hours");
				currentTime = sc.nextInt();

				if(currentTime == 1 || currentTime == 2)
				{
					validHours = true;
				}
				else
				{
					validHours = false;
					System.out.println("Please make a valid selection for the current time.");
				}
			} while(!validHours); // end current time

			switch(employeeRole)
			{
				case 1:
					if(safetyRatingPassed == 1)
					{
						if(currentTime == 1)
						{
							System.out.println("Coordinate tasks between feeders, cleaners, security, and tour guides to keep everything is running smoothly and ensure continued guest satisfaction.");
						}
						else if(currentTime == 2)
						{
							System.out.println("Go home unless advised by a feeder, cleaner, or security guide that management is needed on premises to deal with something after hours.");
						}
						else
						{
							System.out.println("The program has produced erroneous output at the manager safety rating passed, check time part of the swtich statement and will now close.");
							erronousOperation = true;
						}
					} // end manager safety rating passed branch
					else if(safetyRatingPassed == 2)
					{
						if(currentTime == 1)
						{
							System.out.println("Call all hands meeting to get the park back into safety compliance ASAP so that dangerous dinosaurs are not posing a threat to people. Ensure park remains on lockdown");
						}
						else if(currentTime == 2)
						{
							System.out.println("Notify all on-call security personnel to report for duty immediately, ensure the park remains locked down, and notify local authorities.");
						}
						else
						{
							System.out.println("The program has produced erroneous output at the manager safety rating failed, check time part of the swtich statement and will now close.");
							erronousOperation = true;
						}
					} // end manager safety rating failed branch
					else
					{
						System.out.println("The program has produced erroneous output at the manager check safety rating branch and will now close.");
						erronousOperation = true;
					}
					break;
				
				case 2:
					if(safetyRatingPassed == 1)
					{
						if(currentTime == 1)
						{
							System.out.println("Feed dinosaurs according to their feeding schedule and dietary needs. Remember safety first.");
						}
						else if(currentTime == 2)
						{
							System.out.println("Feed dinosaurs according to their feeding schedule and dietary needs. Remember safety first. Notify the after-hours supervisor or on-call manager with any questions or concerns.");
						}
						else
						{
							System.out.println("The program has produced erroneous output at the feeder safety rating passed, check time part of the swtich statement and will now close.");
							erronousOperation = true;
						}
					} // end feeder safety rating passed branch
					else if(safetyRatingPassed == 2)
					{
						if(currentTime == 1)
						{
							System.out.println("Feed dinosaurs only as advised by security and management.");
						}
						else if(currentTime == 2)
						{
							System.out.println("Postpone feeding dinosaurs until given the all clear by security and management.");
						}
						else
						{
							System.out.println("The program has produced erroneous output at the feeder safety rating failed, check time part of the swtich statement and will now close.");
							erronousOperation = true;
						}
					} // end feeder safety rating failed branch
					else
					{
						System.out.println("The program has produced erroneous output at the feeder check safety rating branch and will now close.");
						erronousOperation = true;
					}
					break;
					
				case 3:
					if(safetyRatingPassed == 1)
					{
						if(currentTime == 1)
						{
							System.out.println("Clean common park areas according to the cleaing schedule, assist guests, and clean restrooms.");
						}
						else if(currentTime == 2)
						{
							System.out.println("Clean empty dinosaur stalls according to rotation determined by management.");
						}
						else
						{
							System.out.println("The program has produced erroneous output at the cleaner safety rating passed, check time part of the swtich statement and will now close.");
							erronousOperation = true;
						}
					} // end feeder safety rating passed branch
					else if(safetyRatingPassed == 2)
					{
						if(currentTime == 1)
						{
							System.out.println("Assist security with ensuring park remains on lockdown.");
						}
						else if(currentTime == 2)
						{
							System.out.println("Do not report for duty unless advised by managmenet until security and management give the all clear.");
						}
						else
						{
							System.out.println("The program has produced erroneous output at the cleaner safety rating failed, check time part of the swtich statement and will now close.");
							erronousOperation = true;
						}
					} // end feeder safety rating failed branch
					else
					{
						System.out.println("The program has produced erroneous output at the feeder check safety rating branch and will now close.");
						erronousOperation = true;
					}
					break;

				case 4:
					if(safetyRatingPassed == 1)
					{
						if(currentTime == 1)
						{
							System.out.println("Continue ensuring that the park remains secure and assist guests as needed.");
						}
						else if(currentTime == 2)
						{
							System.out.println("Perform regular parameter and security checks around the park and notify management of any abnormalities.");
						}
						else
						{
							System.out.println("The program has produced erroneous output at the security guard safety rating passed, check time part of the swtich statement and will now close.");
							erronousOperation = true;
						}
					} // end feeder safety rating passed branch
					else if(safetyRatingPassed == 2)
					{
						if(currentTime == 1)
						{
							System.out.println("Lockdown park immediately, notify the relevant local authorities, and advise management during the all hands meeting on how to most effeciently bring the park back into safety compliance.");						}
						else if(currentTime == 2)
						{
							System.out.println("Provide continual updates to the after-hours supervisor and on-call management on the security situtation. Ensure park remains on lockdown until all clear is issued by management.");
						}
						else
						{
							System.out.println("The program has produced erroneous output at the security guard safety rating failed, check time part of the swtich statement and will now close.");
							erronousOperation = true;
						}
					} // end feeder safety rating failed branch
					else
					{
						System.out.println("The program has produced erroneous output at the security guard check safety rating branch and will now close.");
						erronousOperation = true;
					}
					break;
				case 5:
					if(safetyRatingPassed == 1)
					{
						if(currentTime == 1)
						{
							System.out.println("Guide guests around the park attractions, and suggest use of Mesozoic Eden's ammenities including the food court.");
						}
						else if(currentTime == 2)
						{
							System.out.println("Go home and enjoy your off hours. Do not report for duty unless otherwise advised by management.");
						}
						else
						{
							System.out.println("The program has produced erroneous output at the tour guide safety rating passed, check time part of the swtich statement and will now close.");
							erronousOperation = true;
						}
					} // end feeder safety rating passed branch
					else if(safetyRatingPassed == 2)
					{
						if(currentTime == 1)
						{
							System.out.println("Ensure orderly evacuation of park guests. Bring any concerns to the attention of management and security.");						}
						else if(currentTime == 2)
						{
							System.out.println("Do not report for duty until given the all clear by management and security. Update the Website and social media accounts to notify the general public that the park is currently closed.");
						}
						else
						{
							System.out.println("The program has produced erroneous output at the tour guide safety rating failed, check time part of the swtich statement and will now close.");
							erronousOperation = true;
						}
					} // end feeder safety rating failed branch
					else
					{
						System.out.println("The program has produced erroneous output at the tour guide check safety rating branch and will now close.");
						erronousOperation = true;
					}
					break;
				
				default:
					System.out.println("The program has produced erroneous output within switch statement and will now close.");
					erronousOperation = true;
					break;
			} // end swtich statement

			if(!erronousOperation)
			{
				System.out.println("Would you like to make another selection?");
				System.out.println("Y or y for yes, or any other character for no. --> ");
				anotherSelection = sc.next().charAt(0);
			} // Ask the user if they want to make another selection and go again.
		} while(anotherSelection == 'y' || anotherSelection == 'Y'); // end outer do while
	} // end main
} // end TaskAllocationSystem class