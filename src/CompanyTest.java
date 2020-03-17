//package projectsProgram;

import java.util.Collections;
import java.util.Comparator;

public class CompanyTest {

	public static void main(String[] args) {
		String projectTitle, startDate, endDate;
		Company projects = new Company("Test");
		boolean operate = true;
		Integer option;

		do {
			while (true) {
				try {
					option = Input.getInteger("1) Add a project\n" +
							"2) Find a project\n" +
							"3) Remove a project\n" +
							"4) Display all projects\n" +
							"9) Quit\n" +
							"Option: ");
					if (option != 1 && option != 2 && option != 3 && option != 4 && option != 9) {
						System.out.println("Please enter valid option from the menu");
					}
					break;
				} catch (Exception e) {
					System.out.println("Invalid value entered");
				}
			}

			switch (option) {
			case 1:	
				projectTitle = Input.getString("Project title: ");
				if (projects.findProject(projectTitle) == null) {
					startDate = Input.getString("Project start date: ");
					endDate = Input.getString("Project end date: ");
					projects.addProject(new Project(projectTitle, startDate, endDate));
					System.out.println("The project " + '"' + projectTitle + '"' + " has been added");
				} else {
					System.out.println("The project " + '"' + projectTitle + '"' + " already exists");
				}
				break;
			case 2:
				projectTitle = Input.getString("Project title: ");
				Project check = projects.findProject(projectTitle);
				if (projects.findProject(projectTitle) == null) {
					System.out.println("The project " + '"' + projectTitle + '"' + " could not be found");
				} else {
					System.out.println("The project " + '"' + projectTitle + '"' + " has been found:");
					System.out.println(check);
				}
				break;
			case 3:
				projectTitle = Input.getString("Project title: ");
				if (projects.removeProject(projects.findProject(projectTitle))) {
					System.out.println("The project " + '"' + projectTitle + '"' + " has been removed");
				} else {
					System.out.println("The project " + '"' + projectTitle + '"' + " could not be found");
				}
				break;
			case 4:
				projects.displayProjects();
				break;
			case 9:
				if (Input.getString("Are you sure? (Y/N): ").equalsIgnoreCase("Y")) {
					System.out.println("Confirmed. Quitting program.");
					operate = false;
				}
				break;
			}
		} while (operate);

	}

}
