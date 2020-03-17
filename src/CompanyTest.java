//package projectsProgram;

public class CompanyTest {

	public static void main(String[] args) {
		String projectTitle, startDate, endDate;
		Company projects = new Company("Test");
		Integer option;

		do {
			while (true) {
				try {
					option = Input.getInteger("---------------\n" +
							"1) Add a project\n" +
							"2) Find a project\n" +
							"3) Remove a project\n" +
							"4) Display all projects\n" +
							"9) Test data (delete me later)\n" +
							"0) Quit\n" +
							"Option: ");
					break;
				} catch (Exception e) {
					System.out.println("Invalid value entered");
				}
			}

			switch (option) {
				case 0:
					if (Input.getString("Are you sure? (Y/N): ").equalsIgnoreCase("Y")) {
						System.out.println("Confirmed. Quitting program.");
						break;
					}
					option = 99;
					continue;
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
					if (projects.findProject(projectTitle) == null) {
						System.out.println("The project " + '"' + projectTitle + '"' + " could not be found");
					} else {
						System.out.println("The project " + '"' + projectTitle + '"' + " has been found:");
						projects.displayProject(projects.findProject(projectTitle));
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
					projects.displayAllProjects();
					break;
				case 9:
					// Populates the object with data for testing purposes
					projects.populateObject();
					break;
				default:
					System.out.println("Please enter valid option from the menu");
			}
		} while (option != 0);

	}

}
